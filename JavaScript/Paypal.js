class Paypal extends Payments {

  constructor(id, email, amount) {
    super(id)
    this.email = email
    this.amount = amount
  }
}