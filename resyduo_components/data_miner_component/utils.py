
import csv

def clean_string(temp_string):
    temp_string=temp_string.encode("ascii", "ignore")
    temp_string = temp_string.decode()
    if(temp_string == ""):
        return " "
    if(temp_string[1] == '"'):
            
            temp_string = temp_string.split('b"', 1)[1]
    elif(temp_string[1] == "'"):
            
            temp_string = temp_string.split("b'", 1)[1]
                #print(parsed_name)
                #data.write(parsed_name+','+'\n')
    temp_string = temp_string.split("'", 1)[0]
    temp_string = temp_string.replace('"',"''").replace(",","")
    if(temp_string == ""):
        return " "

    return temp_string

def read_columns(file_name = "test.txt"):
    with open (file_name,'r') as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=",")
        for row in csv_reader:
            #print (len(row))
            row_set = set(row)
            #print(len(row_set))
            #for c in row_set:
            #   print(c)
        return row_set

def write_column_name(file_name="components.txt", component_name=""):
    if(component_name!=' '):
        with open(file_name,'a') as data:
            data.write(component_name+',')

#read_columns('components.txt')
#read_columns('tools.txt')