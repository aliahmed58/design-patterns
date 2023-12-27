import builder.UserBuilder;
import decorator.CheeseTopping;
import decorator.Pizza;
import decorator.SimplePizza;
import adapter.DataAdapter;
import adapter.Json;
import adapter.JsonToXmlAdapter;
import adapter.Xml;
import builder.User;

public class Main {
  public static void main(String[] args) {
    // testBuilderPattern();
    // testAdapterPattern();
    testDecoratorPattern();
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

  public static void testDecoratorPattern() {
    Pizza pizza = new SimplePizza();

    System.out.println(pizza.getCost() + " " + pizza.getDescripton());

    // after ToppingDecorator
    Pizza pizzaWithCheese = new CheeseTopping(pizza);

    System.out.println(pizzaWithCheese.getCost() + " " + pizzaWithCheese.getDescripton());
  }
}
