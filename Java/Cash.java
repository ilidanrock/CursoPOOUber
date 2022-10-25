public class Cash extends Payment {
  float amount;

  public Cash(Integer id, float amount) {
    super(id);
    this.amount = amount;
  }
}
