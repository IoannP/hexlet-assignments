package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private final String body;
    private List<Tag> children;

    public PairedTag(
        String name,
        Map<String, String> attributes,
        String body,
        List<Tag> children
    ) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String getBody() {
        return body;
    }

    public List<Tag> getChildren() {
        return children;
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
        string.append(getBody());

        getChildren().forEach(child -> string.append(child.toString()));

        string.append("</");
        string.append(getName());
        string.append(">");

        return string.toString();
    }
}
// END
