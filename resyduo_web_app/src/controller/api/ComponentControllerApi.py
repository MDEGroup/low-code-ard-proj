from flask import render_template, redirect, url_for, request, flash,abort,jsonify,json,Response
from service.component_service import ComponentService


component_service = ComponentService()

def get_all_components():
    return jsonify(component_service.getAll())

def get_components_by_id(id):
    return jsonify(component_service.get_component_by_id(id))

    
def get_components_by_tags():
    data = request.get_json()
    return jsonify(component_service.get_components_by_tag_id_list(data))

