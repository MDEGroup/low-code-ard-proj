import requests
import bs4

def detail_scraper(address,name,element):
    url = address+name
    res =  requests.get(url)
    try:
        
        res.raise_for_status()
        html_page = bs4.BeautifulSoup(res.text, 'html.parser')
        elem_html = element
        sel_elem = html_page.select(elem_html)
        contents = sel_elem[0]

        with open('library_test.txt','a') as data:
            data.write('{'+'\n')
            data.write('"name":'+name+','+'\n')
            #print(contents)

            category = contents.find_all("p", {"class": "categories"})
            if category:
                data.write('"category":'+str(category[0].get_text(strip=True).replace("\n",""))+','+'\n')
            else:
                data.write('"category": "null",'+'\n')
            
            description = contents.find_all("p", {"class": "description"})
            if description:
                data.write('"description":'+str(description[0].get_text(strip=True).encode("utf-8"))+','+'\n')
            else:
                data.write('"description":"null",'+'\n')
            author = contents.find_all("p", {"class": "author"})
            if author:
                data.write('"author":'+str(author[0].get_text(strip=True).replace("\n","").encode("utf-8"))+','+'\n')
            else:
                data.write('"author":"null",'+'\n')
            maintainer = contents.find_all("p", {"class": "maintainer"})
            if maintainer:
                data.write('"maintainer":'+str(maintainer[0].get_text(strip=True).replace("\n","").encode("utf-8"))+','+'\n')
            else:
                data.write('"maintainer": "null",'+'\n')
            compatibility = contents.find_all("p", {"class": "compatibility"})
            if compatibility:
                data.write('"compatibility":'+str(compatibility[0].get_text(strip=True).replace("\n",""))+','+'\n')
            else:
                data.write('"compatibility":"null",'+'\n')
            
            ul = contents.find_all("ul")
            ul= ul[0:2]
            for u in ul:

                if not u.get_text(strip=True)[0].isdigit() and u.get_text(strip=True)[0]!="":
                    compatible_boards_list='['

                    for li in u:
                        if li.get_text(strip=True)!='':
                            #print(li.get_text(strip=True)[0].isdigit())
                            compatible_boards_list = compatible_boards_list + '"'+str(li.get_text(strip=True))+'",'
                            compatible_boards_list=compatible_boards_list + ','
                    #print(compatible_boards_list)
                    if(compatible_boards_list[:-1]==','):
                        compatible_boards_list= compatible_boards_list[:-1]
                    data.write('"boards":'+compatible_boards_list+']\n') 
                #else:
                #    data.write('"boards":[],'+'\n')
                if u.get_text(strip=True)[0].isdigit() and u.get_text(strip=True)[0]!="":
                    release_list='['
                    for li in u:
                        if li.get_text(strip=True)!='':
                            release_list = release_list + '"'+str(li.get_text(strip=True))+'",'
                    release_list = release_list[:-1]
                    #print(release_list)
                    release_list= release_list + ']'
                    data.write('"relaeases":'+release_list+'\n') 
                #else:
                #    data.write('"releases":[]'+'\n')
            data.write('}'+'\n')

    except Exception as exc:
        print('Exception raised'+str(name))
        print ('------------------------------------'+url)


detail_scraper('https://www.arduino.cc/reference/en/libraries/','arduinoble','div.single-page')