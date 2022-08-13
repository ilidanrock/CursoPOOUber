class Account:
    id = int
    document = str
    email = str
    password = str
    name = str

    def __init__(self, name, document):
        self.name = name
        self.document = document
