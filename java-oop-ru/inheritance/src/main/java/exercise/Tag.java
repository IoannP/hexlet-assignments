package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
abstract class Tag {
  private final String name;
  private Map<String, String> attributes;

  public Tag(String name, Map<String, String> attributes) {
    this.name = name;
    this.attributes = attributes;
  }

  public String getName() {
    return name;
  }

  public Map<String, String> getAttributes() {
    return attributes;
  }
}
// END
