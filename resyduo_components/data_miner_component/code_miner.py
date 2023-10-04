import requests
import bs4
import time
from utils import *
import wget
import os




def download_project_code(url="",project_id=''):
    result =  requests.get(url)
    try:

        result.raise_for_status()
        html_page = bs4.BeautifulSoup(result.text, 'html.parser')
        elem_html = "div"
        sel_elem = html_page.select(elem_html)
        contents = sel_elem[0]
        project_code = contents.find_all("a", {"class": "btn btn-primary btn-xs"}, href=True)
        code_part = 1
        for a in project_code:
            #print(a['href'])
            id=str(project_id)+"-part"+str(code_part)
            filename = wget.download("https://create.arduino.cc"+a['href'])
            with open (filename) as data:
                str_code = data.read()
                with open ('C:\\progetti\\low-code-ard-proj\\data-scraper\\code-snippets\\'+id+'.c','w') as out:
                    out.write(str_code)
            os.remove(filename)
            code_part=code_part+1

    except Exception as exc:
        msg=str(time.time())+ url +'\n'
        print('-------------------Exception raised Code Downloader', exc.__class__)
        if hasattr(exc, 'message'):
            msg = exc.message
        else:
            msg = exc
        with open('err_log.txt','a') as data_log:
            log_str = str(time.time())+' : '+ str(msg) + "URL: " + url +'\n'
            data_log.write(log_str)
