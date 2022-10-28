from account import Account


class User(Account):
    photo = str

    def __init__(self, photo, name, document, email, password):
        super(User).__init__(name, document, email, password)
        self.photo = photo
