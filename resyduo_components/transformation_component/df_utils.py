import pandas as pd
import numpy as np
#from IPython.display import display
#from utils import *


class DfUtils:

    def get_all_project_id_from_df(self, file_name):
        df = pd.read_csv(file_name, index_col=0)
        return df.index

    """
    convert JSON to pandas dataframe
    """

    def json_df_to_pd_df(self, file_name = ''):
        # Opening JSON file
        with open(file_name) as f:
            data = f.read().replace("\\","/").replace('""','","').replace("/","\/")
        df = pd.read_json(data)
        return df

    """
    get_set_by_column_name()
    """

    def get_set_by_column_name(self, df, column_name=''):
        return list(set(df[column_name].sum()));


    """
    cut-off by non zero values on df
    """

    def cut_off_by_non_zero_element(self, df, row_cut,col_cut):
        for c in df.columns:
            if len(df[df[c]>0])<col_cut+1:
                df=df.drop([c], axis=1)
        #return the series of non zero values per row
        serie=df.apply(np.flatnonzero, axis=1)
        for t in df.index:
            if(len(serie[t])<row_cut+1):
                df=df.drop([t], axis=0)
        return df




    """
    create a 0/n filled dataframe by occurrence on 2 column df
    """
    def create_df_from_2_df_col(self, df, output_file='out.csv',col_1='col name 2', col_2 ='col name 2',row_cut=0,col_cut=0):
        index =self.get_set_by_column_name(df,col_1)
        columns=self.get_set_by_column_name(df,col_2)
        df2 = pd.DataFrame(0, index=index, columns=columns)
        for i in df.index:
            for t in df.loc[i,col_1]:
                for c in df.loc[i,col_2]:
                    df2.loc[t,c]=df2.loc[t,c]+1
        df2=self.cut_off_by_non_zero_element(df2, row_cut,col_cut)
        df2.to_csv(output_file)
        return df2



    """
    transform a 0/n filled DF to a surprise DF
    """

    def df_to_surprise_df(self, input_file='json_test.txt',output_file='out.csv',index_names = ["tagID", "componentID"],column_name='rating'):
        df=pd.read_csv(input_file, index_col=0)
        index_1 =df.index
        index_2=df.columns
        zeroes = [0]*(len(index_1)*len(index_2))
        index = pd.MultiIndex.from_product([index_1, index_2], names = index_names)
        df2= pd.DataFrame(index = index)
        df2['rating']=zeroes
        for i in df.index:
            for j in df.columns:
                if df.loc[i,j]!=0:
                    df2.loc[i,j]=df.loc[i,j]
        df2.to_csv(output_file)
        return df2

