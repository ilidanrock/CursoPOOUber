
import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
  Map<String, Map<String, Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;
  protected Integer passenger;

  // public UberVan(String license, Account driver, Map<String, Map<String,
  // Integer>> typeCarAccepted,
  // ArrayList<String> seatsMaterial) {
  // super(license, driver);
  // this.typeCarAccepted = typeCarAccepted;
  // this.seatsMaterial = seatsMaterial;
  // }

  public UberVan(String license, Account driver) {
    super(license, driver);
  }

  @Override
  public void setPassenger(Integer passenger) {
    // TODO Auto-generated method stub
    if (passenger == 6) {
      this.passenger = passenger;
    } else {
      System.out.println("Necesitas madurar y colocar un passenger == 6");
    }
  }

  public void printPassengerUberVan() {
    System.out.println(" Passenger: " + this.passenger);
  }
}
