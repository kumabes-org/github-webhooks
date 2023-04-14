from flask import Flask
from flask_restful import Resource, Api, reqparse


app = Flask(__name__)
api = Api(app)

class IndexResource(Resource):
    def __init__(self):
        print("Index Resource")    
    argumentos = reqparse.RequestParser()
    action = argumentos.add_argument('action')
    label = argumentos.add_argument('label')
    issue = argumentos.add_argument('issue')
    repository = argumentos.add_argument('repository')
    organization = argumentos.add_argument('organization')
    sender = argumentos.add_argument('sender')
    def post(self):
        dados = IndexResource.argumentos.parse_args()
        print(dados)



api.add_resource(IndexResource, "/")


if __name__ == '__main__':
    app.run(debug=True, port=21505, host="0.0.0.0")