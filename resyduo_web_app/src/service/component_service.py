from service.utils_service import Utils
from service.tag_service import TagService

utils = Utils()
tag_service = TagService()

class  ComponentService:
    components_predictions = utils.get_predictions_without_ratings(file_path = 'src\\rec_storage\\top10_rec_surprise_comp_lib_cut_5_5.json')
    

    def getAll(self):
        json = ComponentService.components_predictions
        print (type(list(json.keys())))
        comp_list = list(json.keys())
        comp_list.sort()
        return comp_list

    def get_component_by_id(self, id):
        components= ComponentService.components_predictions
        return components[id]
    
    def get_components_by_tag_id_list(self, id_list):
        id_list = list(set(id_list))
        print ('tags list: ',id_list)
        tag_predictions = TagService.tag_prediction
        result = []
        for i in id_list:
            print(len(tag_predictions[i]))
            result.extend(tag_predictions[i])
        result = list(set(result)) 
        result.sort()
        return result






