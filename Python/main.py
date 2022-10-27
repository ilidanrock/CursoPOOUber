from Car import Car
from Card import Card
from Cash import Cash
from Paypal import Paypal
from account import Account

if __name__ == "__main__":
    print("Hello World!")

    car = Car("ABC-1234", Account("John Doe", "123.456.789-00"))
    print(vars(car))
    print(vars(car.driver))

    card = Card(34343443434, 345, "30-06-2025", 34.7)
    card.id = 13
    print(vars(card))

    cash = Cash(343.88)
    cash.id = 45
    print(vars(cash))

    paypal = Paypal("reluis", 3434.66)
    paypal.id = 56
    print(vars(paypal))
