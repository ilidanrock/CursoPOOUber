public class Card extends Payment {
  Integer numberCard;
  Integer cvv;
  String expiration;
  float amount;

  public Card(Integer id, Integer numberCard, Integer cvv, String expiration, float amount) {
    super(id);
    this.numberCard = numberCard;
    this.cvv = cvv;
    this.expiration = expiration;
    this.amount = amount;
  }

}
