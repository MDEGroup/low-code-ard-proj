from service.utils_service import Utils

utils = Utils()

class  TagService:
    tag_prediction = utils.get_predictions_without_ratings(file_path = 'src\\rec_storage\\top20_rec_surprise_tag_comp_cut_5_5.json')

    def getAll(self):
        json = utils.clean_json_dict(utils.read_json_from_file(file_path = 'src\\rec_storage\\top20_rec_surprise_tag_comp_cut_5_5.json'))
        tag_list = list(set(list(json.keys())))
        tag_list.sort()
        return tag_list 

