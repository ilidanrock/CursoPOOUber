class Card extends Payment {
  constructor(id, numberCard, cvv, expiration, amount) {
    super(id)
    this.numberCard = numberCard
    this.cvv = cvv
    this.expiration = expiration
    this.amount = amount
  }
  printCard() {
    console.log({
      id: this.id,
      numberCard: this.numberCard,
      cvv: this.cvv,
      expiration: this.expiration
    });
  }
}