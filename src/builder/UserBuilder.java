package builder;

public class UserBuilder {

  String username, password, role;

  public UserBuilder username(String username) {
    this.username = username;
    return this;
  }

  public UserBuilder password(String password) {
    this.password = password;
    return this;
  }

  public UserBuilder role(String role) {
    this.role = role;
    return this;
  }

  public User build() {
    return new User(this);
  }
}
