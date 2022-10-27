from Payment import Payment


class Cash(Payment):
    amount = float

    def __init__(self, amount):
        super().__init__()
        self.amount = amount
