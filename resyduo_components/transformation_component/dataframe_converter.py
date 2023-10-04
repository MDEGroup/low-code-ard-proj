
# Python program to demonstrate
# Conversion of JSON data to
# dictionary
 
 
# importing the module
import json
import pandas as pd
from IPython.display import display

def json_reader(file_name='json_test.txt'):
# Opening JSON file
    with open(file_name) as f:
        data = f.read().replace("\\","/").replace('""','","')
    with open(file_name,"w") as d:
        d.write(data)
    print("Data type before reconstruction : ", type(data))
    # reconstructing the data as a dictionary
    js = json.loads(data,strict=False)
    df = pd.read_json(file_name+"converted")

    print("Data type after reconstruction : ", type(js))
    display(df)
    #print(js)



json_reader('all_project_detail_final_converted_test.txt')