import json
import re
import pandas as pd
import numpy as np
from IPython.display import display
from data_miner_component.utils import *
from recommender_component import recommender
from data_miner_component import file_reader
from transformation_component import df_utils,libraries_tranformation

class ComponentTransformation:
    
    dfutils = df_utils.DfUtils()
    
    """
    -read the data from a txt file as JSON list and return a dataset
    -generate the set of available components in the dataset inside a file components.txt
    -appy a cutoff to the dataset and return the dataset with name "csv_name"
    """



    def json_to_project_compo_df(self, input_file='json_test.txt',output_file="df.csv",row_cutoff=5, col_cutoff=5):

        df = self.dfutils.json_df_to_pd_df(input_file)
        
        comp_df= pd.DataFrame(df.drop(['project_link','project_title','project_description','tools','tags','views','respects','comment'], axis = 1))
        display(df.head(5))
        list_of_zeros = [0]*len(df)
        components = []
        components = set(df['components'].sum())
        df_header=list(components)
        df2 = pd.DataFrame(0, index=np.arange(len(df)), columns=df_header)
        df2.index = list(df["project_id"])
        #display(df2.head(2))
        df2.info()
        for i in range (0,len(df)):       
            for j in range(0,len(df.iloc[i]["components"])):
                comp_index=df.iloc[i]["components"][j]
                #print(df.iloc[i]["project_id"])
                df2.loc[df.iloc[i]["project_id"],comp_index]=1
                
        #display(df2.head(2))
        if(col_cutoff>0 or row_cutoff>0):
            df2 = self.cut_df(df2, col_cutoff, row_cutoff)
        df2.info()
        display(df2.head(5))
        df2.to_csv(output_file)
        return df2
        
            


    def cut_df(df, col_cutoff=0, row_cutoff=0):
        
        
        for i in df.columns:
            sum = df[i].sum()
            if (sum<col_cutoff+1):
                df=df.drop([i], axis = 1)
        
        for i in df.index:
            sum = df.loc[i].sum()
            if (sum<row_cutoff+1):
                df=df.drop([i], axis = 0)
        return df