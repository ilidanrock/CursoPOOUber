public class Cash extends Payment {
  Float Quantity;

  public Cash(Integer id, Float Quantity) {
    super(id);
    this.Quantity = Quantity;
  }
}
