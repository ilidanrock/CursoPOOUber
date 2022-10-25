public class Paypal extends Payment {
  String email;
  float amount;

  public Paypal(Integer id, String email, float amount) {
    super(id);
    this.email = email;
    this.amount = amount;
  }
}
