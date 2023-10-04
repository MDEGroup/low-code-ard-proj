from flask import render_template, redirect, url_for, request, flash,abort,jsonify,json,Response
from service.LibraryService import LibraryService


library_service = LibraryService()

def get_libraries_by_components():
    data = request.get_json()
    return jsonify(library_service.get_libs_by_component_id_list(data))