package exercise;

// BEGIN
public class LabelTag implements TagInterface {
  private String value;
  private TagInterface input;

  public LabelTag(String value, TagInterface input) {
    this.value = value;
    this.input = input;
  }

  @Override
  public String render() {
    return "<label>" + value + input.render() + "</label>";
  }
}
// END
