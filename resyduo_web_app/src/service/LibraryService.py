from service.utils_service import Utils
from service.component_service import ComponentService

utils = Utils()
component_service = ComponentService()

class  LibraryService:
    
    
    def get_libs_by_component_id_list(self, id_list):
        id_list = list(set(id_list))
        lib_predictions = component_service.components_predictions
        result = []
        for i in id_list:
            result.extend(lib_predictions[i])
        return result