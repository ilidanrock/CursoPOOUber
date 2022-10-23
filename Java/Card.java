public class Card extends Payment {
  Integer numberCard;
  Integer cvv;
  String expiration;

  public Card(Integer id, Integer numberCard, Integer cvv, String expiration) {
    super(id);
    this.numberCard = numberCard;
    this.cvv = cvv;
    this.expiration = expiration;
  }

}
