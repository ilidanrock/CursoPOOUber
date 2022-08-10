public class Car {
  Integer id;
  String license;
  Account driver;
  Integer passenger;

  public Car(String license, Account driver, Integer passenger) {
    this.license = license;
    this.driver = driver;
    this.passenger = passenger;
  }

  void printDataCar() {

    System.out.println("Driver: " + driver.name);
  }
}
