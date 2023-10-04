from data_miner_component.project_miner import *

class DataMiner:

    def generate_project_data():
        project_links_scraper_cycle (start_page=0,last_pages=276,first_write=False,last_write=True,file_name='all_projects_links_final_201022.txt',project_detail_file='all_project_detail_final_201022.txt')


if __name__ == "__main__":
    data_miner = DataMiner()
    data_miner.generate_project_data()
