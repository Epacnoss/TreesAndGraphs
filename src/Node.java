import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Node {

    private Node parent;
    private List<Node> children;

    private String content;

    public Node(String content) {
        this.content = content;
        children = new ArrayList<>();
    }

    public Node(Node parent, String content)
    {
        this.parent = parent;
        this.content = content;
        children = new ArrayList<>();
    }

    public void setParent (Node parent)
    {
        this.parent = parent;
    }

    public void addChild (Node child)
    {
        children.add(child);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("content='" + content + "'")
                .toString();
    }
}
