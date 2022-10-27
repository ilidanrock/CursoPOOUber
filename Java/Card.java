public class Card extends Payment {
  Integer numberCard;
  Integer cvv;
  String expiration;
  Float amount;

  public Card(Integer numberCard, Integer cvv, String expiration, Float amount) {
    super();
    this.numberCard = numberCard;
    this.cvv = cvv;
    this.expiration = expiration;
    this.amount = amount;
  }

}
