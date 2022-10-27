public class Paypal extends Payment {
  String email;
  float amount;

  public Paypal(String email, float amount) {
    super();
    this.email = email;
    this.amount = amount;
  }
}
