public class Driver extends Account {
  String vehicleRegistration;
  String photo;
  String insurance;
  String certificateStandardSafety;

  public Driver(String vehicleRegistration, String photo, String insurance, String certificateStandardSafety,
      String name, String document, String email, String password) {
    super(name, document, email, password);
    this.vehicleRegistration = vehicleRegistration;
    this.photo = photo;
    this.insurance = insurance;
    this.certificateStandardSafety = certificateStandardSafety;
  }
}
