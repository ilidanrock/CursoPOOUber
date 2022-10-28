class User extends Account {
  constructor(email, password, name, document, photo) {
    super(email, password, name, document);
    this.photo = photo
  }
}