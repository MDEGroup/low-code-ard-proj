from flask import Blueprint
from controller.api.TagControllerAPi import get_all_tag

api_tag_bp = Blueprint('api_tag_bp', __name__)

api_tag_bp.route('/', methods=['GET'])(get_all_tag)
