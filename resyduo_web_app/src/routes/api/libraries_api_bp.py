from flask import Blueprint
from controller.api.LibrariesControllerApi import get_libraries_by_components

api_libraries_bp = Blueprint('api_libraries_bp', __name__)


api_libraries_bp.route('/', methods=['POST'])(get_libraries_by_components)