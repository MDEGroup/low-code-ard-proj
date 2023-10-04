from surprise import Dataset,accuracy, Reader, KNNWithMeans,KNNBasic, SVD
from surprise.model_selection import train_test_split,KFold
from surprise.model_selection import GridSearchCV
import pandas as pd
from collections import defaultdict
import random
import math
import json


class Recommender:

    def get_best_hyper_param(self,surp_df):
        # Use movielens-100K
        df = pd.read_csv(surp_df)
        reader = Reader(rating_scale=(df['rating'].min(),df['rating'].max()))
        # The columns must correspond to user id, item id and ratings (in that order).
        data = Dataset.load_from_df(df[df.columns], reader)

        param_grid = {
        'k': [3,10,20],
        'sim_options': {
            'name': ['msd', 'pearson_baseline'],
            'min_support': [1, 3, 5],
            'user_based': [True, False],
            'shrinkage':[0,5,10]
        },
    }

        gs = GridSearchCV(KNNWithMeans, param_grid, measures=["rmse", "mae"], cv=10)

        gs.fit(data)

        # best RMSE score
        print(gs.best_score["rmse"])

        # combination of parameters that gave the best RMSE score
        print(gs.best_params["rmse"])

        algo = gs.best_estimator["rmse"]
        algo.fit(data.build_full_trainset())

        results_df = pd.DataFrame.from_dict(gs.cv_results)
        return results_df

    """
    Metrics Evaluations
    """
    def precision_recall_at_k(self, predictions, k=10, threshold=0.5):
        """Return precision and recall at k metrics for each user"""

        # First map the predictions to each user.
        user_est_true = defaultdict(list)
        for  uid,_, true_r, est, _ in predictions:
            user_est_true[uid].append((est, true_r))
        #print(user_est_true)
        #display(user_est_true)

        precisions = dict()
        recalls = dict()
        for uid, user_ratings in user_est_true.items():

            # Sort user ratings by estimated value
            user_ratings.sort(key=lambda x: x[0], reverse=True)

            # Number of relevant items
            n_rel = sum((true_r >= threshold) for (_, true_r) in user_ratings)
            #print('relevant: ',n_rel)

            # Number of recommended items in top k
            n_rec_k = sum((est >= threshold) for (est, _) in user_ratings[:k])
            #print('recommended: ',n_rec_k)

            # Number of relevant and recommended items in top k
            n_rel_and_rec_k = sum(
                ((true_r >= threshold) and (est >= threshold))
                for (est, true_r) in user_ratings[:k]
            )

            # Precision@K: Proportion of recommended items that are relevant
            # When n_rec_k is 0, Precision is undefined. We here set it to 0.

            precisions[uid] = n_rel_and_rec_k / n_rec_k if n_rec_k != 0 else 0

            # Recall@K: Proportion of relevant items that are recommended
            # When n_rel is 0, Recall is undefined. We here set it to 0.

            recalls[uid] = n_rel_and_rec_k / n_rel if n_rel != 0 else 0

        return precisions, recalls


    def get_true_positive(self, predictions, threshold):
        tp=0
        for  uid,iid, true_r, est, _ in predictions:
            if (true_r>0 and est>threshold):
                tp=tp+1
        return tp


    def get_true_negative(self, predictions, threshold):
        tn=0
        for  uid,iid, true_r, est, _ in predictions:
            if (true_r==0 and est<threshold):
                tn=tn+1
        return tn


    def get_false_negative(self, predictions, threshold):
        fn=0
        for  uid,iid, true_r, est, _ in predictions:
            if (true_r>0 and est<threshold):
                fn=fn+1
        return fn

    def get_false_positive(self, predictions, threshold):
        fp=0
        for  uid,iid, true_r, est, _ in predictions:
            if (true_r==0 and est>threshold):
                fp=fp+1
        return fp


    def get_precision_recall_accuracy_fprate(self,predictions, threshold):
        fp=self.get_false_positive(predictions, threshold)
        fn=self.get_false_negative(predictions, threshold)
        tp=self.get_true_positive(predictions, threshold)
        tn=self.get_true_negative(predictions, threshold)
        precision = tp/(tp+fp)
        recall = tp/(tp+fn)
        accuracy = (tp+tn)/(tp+tn+fp+fn)
        fprate = fp/(fp+tn)
        return precision,recall,accuracy,fprate


    def predict_and_validate(self,surprise_df='surprise df',sim_options={
                'name': 'msd',
                'user_based': True,
                'min_support':1,
                'shrinkage':0
                },threshold = 0.2,k=20,fold_split=10):
        df = pd.read_csv(surprise_df)
        #display(df)
        # A reader is still needed but only the rating_scale param is requiered.
        reader = Reader(rating_scale=(df['rating'].min(),df['rating'].max()))
        #print(df.columns)
        # The columns must correspond to user id, item id and ratings (in that order).
        data = Dataset.load_from_df(df[df.columns], reader)
        algo = KNNWithMeans(sim_options=sim_options )


        # define a cross-validation iterator
        kf = KFold(n_splits=fold_split)
        result = []
        for trainset, testset in kf.split(data):
            # train and test algorithm.
            algo.fit(trainset)
            predictions = algo.test(testset)
            precisions, recalls = self.precision_recall_at_k(predictions, k=k, threshold=threshold)
            precistion_at_k_avg = sum(rec for rec in precisions.values()) / len(precisions)
            recall_at_k_avg = sum(rec for rec in recalls.values()) / len(recalls)
            # Compute and print Root Mean Squared Error
            rmse = accuracy.rmse(predictions, verbose=False)
            mae = accuracy.mae(predictions, verbose=False)
            precision_avg,recall_avg,accu,fprate = self.get_precision_recall_accuracy_fprate(predictions, threshold)
            success_rate = self.get_success_rate(predictions, n=k, threshold = threshold)
            partial_result = {"precision": precistion_at_k_avg,"recall":recall_at_k_avg,"accuracy":accu,"false_positive_rate" : fprate, "success_rate" : success_rate, "rmse" : rmse, "mae" : mae } 
            result.append(partial_result)
        return result 


    def get_all_prediction(self, surprise_df, drop_zero = False,sim_options={
                'name': 'pearson',
                'user_based': True,
                'min_support':1,
                'shrinkage':100
                }):
        df = pd.read_csv(surprise_df)
        if(drop_zero):
            df = df[df.rating != 0]
        #display(df)
        # A reader is still needed but only the rating_scale param is requiered.
        reader = Reader(rating_scale=(df['rating'].min(),df['rating'].max()))
        #print(df.columns)
        # The columns must correspond to user id, item id and ratings (in that order).
        data = Dataset.load_from_df(df[df.columns], reader)
        # sample random trainset and testset
        # test set is made of 25% of the ratings.
        trainset, testset = train_test_split(data, test_size=0.25)
        # Build an algorithm, and train it.
        algo = KNNWithMeans(sim_options=sim_options,k=100)
        algo.fit(trainset)
        predictions = algo.test(testset)
        return predictions



    def get_top_n(self, predictions, n=10):
        """Return the top-N recommendation for each user from a set of predictions.

        Args:
            predictions(list of Prediction objects): The list of predictions, as
                returned by the test method of an algorithm.
            n(int): The number of recommendation to output for each user. Default
                is 10.

        Returns:
        A dict where keys are user (raw) ids and values are lists of tuples:
            [(raw item id, rating estimation), ...] of size n.
        """

        # First map the predictions to each user.
        
        top_n = defaultdict(list)
        for  uid,iid, true_r, est, _ in predictions:
            top_n[uid].append((iid, float(round(est,6)),float(true_r)))

        # Then sort the predictions for each user and retrieve the k highest ones.
        for iid, user_ratings in top_n.items():
            user_ratings.sort(key=lambda x: x[1], reverse=True)
            top_n[iid] = user_ratings[:n]

        return top_n

    def get_top_n_by_id(self, predictions, n=10, id=''):
        top_n = self.get_top_n(predictions, n)
        for uid, user_ratings in top_n.items():
            if(uid== id):
                print(uid, [iid for (iid, _) in user_ratings])
        return top_n


    def get_success_rate(self, predictions, n=10, threshold = 0.3):
        # First map the predictions to each user.
        top_n =self.get_top_n(predictions=predictions, n=n)
        total = len(top_n)
        n_success = 0
        for i in top_n:
            partial_success=0
            for j in top_n[i]:
                _,est,true_r = j
                if(true_r > threshold and est > threshold):
                    partial_success=1
            n_success+=partial_success
        return n_success/total


    def write_recommendation_to_file(self,top_n_recommendations,file):
     with open(file, 'w') as convert_file:
          convert_file.write(json.dumps(top_n_recommendations))

    def read_recommendation_from_file(self,file='recommendation_top10_project_component_0_to_276_cut_5_10.json'):
        # reading the data from the file
        with open(file) as f:
            data = f.read()
        js = json.loads(data)
        return js

    """
    -------------------------
    old recommender functions
    -------------------------
    """
    def get_similar_projects (self, project, df2, cutoff = 0.1):
        df3=df2
        scores = []
        for row in range(0, len(df3)):
            sim_score= 1 - self.cosine(project,df3.loc[[row]])
            scores.append(sim_score)
        df3['scores']= scores
        for row in range(0, len(df3)):
            if (df3.loc[row,'scores'] <= cutoff or df3.loc[row,'scores'] == 0.0 or math.isnan(df3.loc[row,'scores'])):
                df3.drop(row, axis = 0 , inplace = True)
        df3.sort_values('scores', ascending=False, inplace = True)
        for i in list(df3.columns.values):
            if(df3[i].sum()==0):
                df3.drop(i, axis = 1, inplace = True)
        
        return df3

    def generate_input(self, df):
        input_list= []
        for i in range (0,len(df.columns)):
            input_list.append(random.randint(0,1))
        return input_list



    """
    -----------------------------
    end old recommender functions
    -----------------------------
    """