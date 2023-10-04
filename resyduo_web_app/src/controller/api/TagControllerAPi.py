from flask import render_template, redirect, url_for, request, flash,abort,jsonify,json,Response
from service.tag_service import TagService


tagService = TagService()

def get_all_tag():
    return jsonify(tagService.getAll())


    
