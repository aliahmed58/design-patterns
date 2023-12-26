import builder.UserBuilder;
import adapter.DataAdapter;
import adapter.Json;
import adapter.JsonToXmlAdapter;
import adapter.Xml;
import builder.User;

public class Main {
  public static void main(String[] args) {

    // testBuilderPattern();
    testAdapterPattern();
  }

  public static void testAdapterPattern() {
    Json json = new Json();
    DataAdapter<Xml> adapter = new JsonToXmlAdapter(json);
    Xml xml = adapter.convert();
  }

  public static void testBuilderPattern() {
    User user = new UserBuilder().username("aliahmed")
        .password("testpassword")
        .role("ADMIN/USER")
        .build();
    System.out.println(user);
  }
}
