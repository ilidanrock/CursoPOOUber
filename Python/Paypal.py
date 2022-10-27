from Payment import Payment


class Paypal(Payment):
    email = str
    amount = float

    def __init__(self, email, amount):
        super().__init__()
        self.amount = amount
        self.email = email
