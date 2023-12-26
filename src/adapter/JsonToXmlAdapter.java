package adapter;

public class JsonToXmlAdapter implements DataAdapter<Xml> {
  private Json json;

  public JsonToXmlAdapter(Json json) {
    this.json = json;
  }

  public Xml convert() {
    System.out.println("converting to xml");

    return new Xml();
  }

}
