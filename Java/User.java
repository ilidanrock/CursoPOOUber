public class User extends Account {
  String photo;

  public User(String name, String document, String email, String password, String photo) {
    super(name, document, email, password);
    this.photo = photo;
  }
}
