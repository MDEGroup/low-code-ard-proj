from flask import Blueprint
from controller.api.ComponentControllerApi import get_all_components,get_components_by_tags


api_components_bp = Blueprint('api_components_bp', __name__)

api_components_bp.route('/', methods=['GET'])(get_all_components)
api_components_bp.route('/', methods=['POST'])(get_components_by_tags)

