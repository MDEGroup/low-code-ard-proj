
from df_utils import DfUtils
from libraries_tranformation import LibraryTranformation
from component_transformation import ComponentTransformation
import pandas as pd


dfutils = DfUtils()
lib_tranformer = LibraryTranformation()
comp_tranformer = ComponentTransformation()


class DataGenerator:


    def generate_lib_data():
        #project_id_list = dfutils.get_all_project_id_from_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\components_data\\project_df_page_0_to_276_cut_0_0.csv')

        #lib_tranformer.create_lib_surprise_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\code-storage\\', project_id_list, output_df='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv')

        #lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_0_0.csv')   

        #lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_5_5.csv',row_cut = 5, col_cut = 5)   
        
        #lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_5_10.csv',row_cut = 5, col_cut = 10)  
        
        #lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_10_10.csv',row_cut = 10, col_cut = 10) 
        
        #lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_2_5.csv',row_cut = 2, col_cut = 5)

        #lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_2_10.csv',row_cut = 2, col_cut = 10)

        
        lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_1_1.csv',row_cut = 1, col_cut = 1)

        lib_tranformer.add_libraries_to_df(df1=dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'), df2 = pd.read_csv('C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\project_data\\proj_lib_cut_0_0.csv'), output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_1_5.csv',row_cut = 1, col_cut = 5)

        #dfutils.df_to_surprise_df( input_file = 'C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_0_0.csv', index_names = ["componentID", "libID"], column_name='rating', output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\surprise_df_comp_lib_df_cut_0_0.csv')

        #dfutils.df_to_surprise_df( input_file = 'C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_5_5.csv', index_names = ["componentID", "libID"], column_name='rating', output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\surprise_df_comp_lib_df_cut_5_5.csv')

        #dfutils.df_to_surprise_df( input_file = 'C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_5_10.csv', index_names = ["componentID", "libID"], column_name='rating', output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\surprise_df_comp_lib_df_cut_5_10.csv')

        #dfutils.df_to_surprise_df( input_file = 'C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_10_10.csv', index_names = ["componentID", "libID"], column_name='rating', output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\surprise_df_comp_lib_df_cut_10_10.csv')

        dfutils.df_to_surprise_df( input_file = 'C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_1_1.csv', index_names = ["componentID", "libID"], column_name='rating', output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\surprise_df_comp_lib_df_cut_1_1.csv')
        
        dfutils.df_to_surprise_df( input_file = 'C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\comp_lib_df_cut_1_5.csv', index_names = ["componentID", "libID"], column_name='rating', output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\libraries_data\\surprise_df_comp_lib_df_cut_1_5.csv')



    def generate_tag_data():
        """

    01 df generation

     """

    dfutils.create_df_from_2_df_col(dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'),
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_5_5.csv',
    col_1='tags',
    col_2 ='components',
    row_cut=5,col_cut=5)

    dfutils.create_df_from_2_df_col(dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'),
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_5_10.csv',
    col_1='tags',
    col_2 ='components',
    row_cut=5,col_cut=10)

    dfutils.create_df_from_2_df_col(dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'),
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_0_0.csv',
    col_1='tags',
    col_2 ='components',
    row_cut=0,col_cut=0)

    dfutils.create_df_from_2_df_col(dfutils.json_df_to_pd_df('C:\\progetti\\low-code-ard-proj\\resyduo_components\\data_miner_component\\data_miner_storage\\all_project_detail_final_201022.txt'),
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_1_1.csv',
    col_1='tags',
    col_2 ='components',
    row_cut=1,col_cut=1)


    """

    surprise df generation

    """

    dfutils.df_to_surprise_df(input_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_5_5.csv',
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\surprise_tag_comp_test_cut_5_5.csv',
    index_names = ["tagID", "componentID"],
    column_name='rating')

    dfutils.df_to_surprise_df(input_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_5_10.csv',
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\surprise_tag_comp_test_cut_5_10.csv',
    index_names = ["tagID", "componentID"],
    column_name='rating')

    dfutils.df_to_surprise_df(input_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_0_0.csv',
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\surprise_tag_comp_test_cut_0_0.csv',
    index_names = ["tagID", "componentID"],
    column_name='rating')


    dfutils.df_to_surprise_df(input_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\df_tag_comp_cut_1_1.csv',
    output_file='C:\\progetti\\low-code-ard-proj\\resyduo_components\\transformation_component\\transformation_storage\\tag_data\\surprise_tag_comp_cut_1_1.csv',
    index_names = ["tagID", "componentID"],
    column_name='rating')

    def generate_comp_data():


        """ 01 DF"""

        comp_tranformer.json_to_project_compo_df('all_project_detail_final_201022.txt','project_df_page_0_to_276_cut_0_0_test.csv',row_cutoff=0, col_cutoff=0)

        comp_tranformer.json_to_project_compo_df('all_project_detail_final_201022.txt','project_df_page_0_to_276_cut_1_1_test.csv',row_cutoff=1, col_cutoff=1)
        
        comp_tranformer.json_to_project_compo_df('all_project_detail_final_201022.txt','project_df_page_0_to_276_cut_1_5_test.csv',row_cutoff=1, col_cutoff=5)
    
        comp_tranformer.json_to_project_compo_df('all_project_detail_final_201022.txt','project_df_page_0_to_276_cut_5_5_test.csv',row_cutoff=5, col_cutoff=5)

        comp_tranformer.json_to_project_compo_df('all_project_detail_final_201022.txt','project_df_page_0_to_276_cut_10_10_test.csv',row_cutoff=10, col_cutoff=10)
        
        """ Surprise DF"""

        dfutils.df_to_surprise_df(input_file='project_df_page_0_to_276_cut_0_0.csv',output_file='surprise_df_page_0_to_276_cut_0_0.csv')

        dfutils.df_to_surprise_df(input_file='project_df_page_0_to_276_cut_1_1.csv',output_file='surprise_df_page_0_to_276_cut_1_1.csv')

        dfutils.df_to_surprise_df(input_file='project_df_page_0_to_276_cut_1_5.csv',output_file='surprise_df_page_0_to_276_cut_1_5.csv')

        dfutils.df_to_surprise_df(input_file='project_df_page_0_to_276_cut_5_5.csv',output_file='surprise_df_page_0_to_276_cut_5_5.csv')

        dfutils.df_to_surprise_df(input_file='project_df_page_0_to_276_cut_10_10.csv',output_file='surprise_df_page_0_to_276_cut_10_10.csv')

    generate_tag_data()
    generate_lib_data ()



