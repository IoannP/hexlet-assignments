package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
  public SingleTag(String name, Map<String, String> attributes) {
    super(name, attributes);
  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    string.append("<");
    string.append(getName());

    getAttributes().entrySet()
      .forEach(entry -> {
        string.append(" ");
        string.append(entry.getKey());
        string.append("=\"");
        string.append(entry.getValue());
        string.append("\"");;
      });
    
    string.append(">");
    return string.toString();
  }
}
// END
