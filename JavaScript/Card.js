class Card extends Payment {
  constructor(numberCard, cvv, expiration, amount) {
    super();
    this.numberCard = numberCard
    this.cvv = cvv
    this.expiration = expiration
    this.amount = amount
  }
  printCard() {
    console.log({
      numberCard: this.numberCard,
      cvv: this.cvv,
      expiration: this.expiration
    });
  }
}