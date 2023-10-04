from flask import Flask,redirect,url_for,render_template
#from flask_restful import reqparse, abort, Api, Resource

import sys
import os
SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(SCRIPT_DIR))

from routes.index_bp import index_bp
from routes.api.tag_api_bp import api_tag_bp
from routes.api.components_api_bp import api_components_bp
from routes.api.libraries_api_bp import api_libraries_bp


app = Flask(__name__)
#api = Api(app)

"""

PROSSIMI STEP DA FARE:

-DIVIDERE IL COMPORTAMENTO DEL TEMPLATE DEL PRIMO TAB visualizzazione delle diverse parti del tab prima tag poi component

-IMPLEMENTARE IL COMPORTAMENTO DEL TAB2 SELEZIONARE COMPONENTS SINGOLI PER OTTENERE LIBRERIE
- TAB STATEMENTS
-TAB OVERVIEW DEVE CONTENERE TUTTE LE COMPONENTI E LIBRERIE SELEZIONATE
-SALVATaggio del codice

"""

"""

Controller Blueprints

"""

app.register_blueprint(index_bp)


"""

API Blueprints

"""

### API ###
app.register_blueprint(api_tag_bp, url_prefix='/api/tag')
app.register_blueprint(api_components_bp, url_prefix='/api/component')
app.register_blueprint(api_libraries_bp, url_prefix='/api/library')


@app.route('/')
def index():
    return redirect(url_for('index_bp.index'))


if __name__ == '__main__':
    app.run(debug=True)