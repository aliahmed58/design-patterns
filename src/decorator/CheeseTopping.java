package decorator;

public class CheeseTopping extends ToppingDecorator {

  public CheeseTopping(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescripton() {
    return pizza.getDescripton() + ", Cheese Topping";
  }

  public int getCost() {
    return this.pizza.getCost() + 2;
  }
}
