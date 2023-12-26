package builder;

public class User {
  String username;
  private String password;
  private String role;

  public User(UserBuilder builder) {
    this.username = builder.username;
    this.password = builder.password;
    this.role = builder.role;
  }

  public User(String username, String password, String role) {

  }

  @Override
  public String toString() {
    return this.username + " " + this.password + " " + this.role;
  }
}
