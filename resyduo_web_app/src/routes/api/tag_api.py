from msilib.schema import Component
from flask import Flask
from flask_restful import reqparse, abort, Api, Resource
app = Flask(__name__)
api = Api(app)

components = ['Comp1','Comp2']


class Get_component_by_tag(Resource):
    def get(self,tag):
        if tag:
            return components

##
## Actually setup the Api resource routing here
##
api.add_resource(Get_component_by_tag, '/components')