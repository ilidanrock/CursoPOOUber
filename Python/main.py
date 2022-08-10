from Car import Car

if __name__ == "__main__":
    print("Hello World!")
    car = Car()
    car.license = "ABC-123"
    car.driver = "John"
    car.passenger = "Mary"
    print(vars(car))

    ferrari = Car()
    ferrari.license = "DDD-456"
    ferrari.driver = "Tom"
    ferrari.passenger = "Jack"
    print(vars(ferrari))
