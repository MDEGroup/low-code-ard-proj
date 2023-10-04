import json

class Utils:
    def read_json_from_file(self, file_path = 'resyduo_web_app\\src\\rec_storage\\top10_rec_surprise_comp_lib_cut_5_5.json'):
        with open(file_path) as f:
            data = f.read()
        js = json.loads(data)
        return js

    def get_predictions_without_ratings(self, file_path = 'resyduo_web_app\\src\\rec_storage\\top10_rec_surprise_comp_lib_cut_5_5.json'):
        js = self.clean_json_dict(self.read_json_from_file(file_path = file_path))
        for i in js:
            temp = []
            for j in range(0,len(js[i])):
                lib,est,true_r =js[i][j]
                temp.append(lib)
            js[i] = temp
        return js

    def clean_json_dict(self,json):
        new_dict = {}
        for k in json:
            new_key = k.replace("'","")
            if(new_key!= " "):
                if (new_key[0]==" "):
                    #print("space 0")
                    new_key =new_key[1:]
                if (new_key[0]==" "):
                    #print("space -1")
                    new_key =new_key[:-1]
                new_dict[new_key] = json[k]
        return new_dict
