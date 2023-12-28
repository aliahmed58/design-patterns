import builder.UserBuilder;
import decorator.CheeseTopping;
import decorator.Pizza;
import decorator.SimplePizza;
import adapter.DataAdapter;
import adapter.Json;
import adapter.JsonToXmlAdapter;
import adapter.Xml;
import builder.User;
import observer.Subject;
import observer.ViewOne;
import observer.ViewTwo;
import scenario.ConfigurationManager;

import javax.swing.text.View;

public class Main {
  public static void main(String[] args) {
    // testBuilderPattern();
    // testAdapterPattern();
//    testDecoratorPattern();
//    testConfigurationManager();
    testObserverPattern();
  }
public static void testObserverPattern() {
    Subject subject = new Subject();
    ViewOne one = new ViewOne(subject);
    ViewTwo two = new ViewTwo(subject);

    subject.setSate(one);
    subject.setSate(two);
    subject.setSate(one);

  }

  public static void testConfigurationManager() {
    ConfigurationManager configurationManager = ConfigurationManager.getInstance();
    configurationManager.addConfiguration("name", "Something");
    configurationManager.addConfiguration("test", false);

    System.out.println(configurationManager.getConfiguration("name"));
    System.out.println(configurationManager.getConfiguration("test"));
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
