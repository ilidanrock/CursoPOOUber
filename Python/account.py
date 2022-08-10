class Account(object):
    id = int
    document = str
    email = str
    password = str
    name = str

    def __init__(self, *args):
        super(Account, self).__init__(*args)
