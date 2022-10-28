public class Driver extends Account {
  String vehicleRegistration;
  String photo;
  String insurance;
  String certificateStandardSafety;

  public Driver(String vehiculeRegistration, String photo, String insurance, String certificateStandardSafety,
      String name, String document, String email, String password) {
    super(name, document, email, password);
  }
}
