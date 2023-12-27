package decorator;

public abstract class Pizza {

  protected String description;

  public String getDescripton() {
    return this.description;
  }

  public abstract int getCost();

}
