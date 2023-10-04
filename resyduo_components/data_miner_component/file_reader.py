
"""
class used to read project source code files

"""


class CodeReader:

    """
    read source code file and return the list of included libraries
    
    """
    
    def read_file(self, path, project_id):
        complete_path= path + project_id
        part=1
        guard=True
        lib_list = []
        while(guard):
            try:
                with open(complete_path +'-part'+str(part)+'.c',"r") as file:
                    for row in file:
                        if(str(row).startswith('#include')):
                            s = row.split('//')
                            s = s[0]
                            s = s.split('/*')
                            s = s[0]
                            s = s.strip()
                            lib_list.append(s)
                part = part + 1
            except OSError as e:
                guard = False
                #print('Exception !!!! Project code total part:',part-1)
                #print(complete_path +'-part'+str(part)+'.c')
        return lib_list
