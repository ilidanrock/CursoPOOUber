from Car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World!")

    car = Car("ABC-1234", Account("John Doe", "123.456.789-00"))
    print(vars(car))
    print(vars(car.driver))
