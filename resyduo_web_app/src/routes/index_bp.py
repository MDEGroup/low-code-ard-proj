import sys
import os
from flask import Blueprint

SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(SCRIPT_DIR))

from controller.indexController import index


index_bp = Blueprint('index_bp',__name__)

index_bp.route('/', methods = ['GET'])(index)