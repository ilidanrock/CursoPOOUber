class Driver extends Account {
  constructor(email, password, name, document, photo, vehicleRegistration, insurance, certificateStandardSafety) {
    super(email, password, name, document)
    this.photo = photo
    this.vehicleRegistration = vehicleRegistration
    this.insurance = insurance
    this.certificateStandardSafety = certificateStandardSafety
  }
}