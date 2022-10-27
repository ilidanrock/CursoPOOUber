from Payment import Payment


class Card(Payment):
    numberCard = int
    cvv = int
    expire = str
    amount = float

    def __init__(self, numberCard, cvv, expire, amount):
        super().__init__()
        self.amount = amount
        self.cvv = cvv
        self.expire = expire
        self.numberCard = numberCard
