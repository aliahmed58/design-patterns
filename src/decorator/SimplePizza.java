package decorator;

public class SimplePizza extends Pizza {
  public int getCost() {
    return 10;
  }

  @Override
  public String getDescripton() {
    return "Simple Pizza";
  }
}
