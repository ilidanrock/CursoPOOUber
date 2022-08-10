class Car(object):
    id = int
    license = str
    driver = str
    passenger = str

    def __init__(self, *args):
        super(Car, self).__init__(*args)
