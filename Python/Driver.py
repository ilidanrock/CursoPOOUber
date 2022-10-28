from time import sleep
from account import Account


class Driver(Account):
    vehicleRegistration = str
    photo = str
    insurance = str
    certificateStandardSafety = str

    def __init__(self, vehicleRegistration, photo, insurance, certificateStandardSafety, name, document, email, password):
        super(Driver).__init__(name, document, email, password)
        self.photo = photo
        self.certificateStandardSafety = certificateStandardSafety
        self.vehicleRegistration = vehicleRegistration
        self.insurance = insurance
