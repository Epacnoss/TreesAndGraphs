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

    protected void setParent (Node parent)
    {
        this.parent = parent;
    }

    protected void addChild (Node child)
    {
        children.add(child);
    }

    protected Node getParent() {
        return parent;
    }

    protected List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("content='" + content + "'")
                .toString();
    }

    public int childCount ()
    {
        if(children.size() == 1)
            return 1;
        if(children.size() == 0)
            return 0;

        int cc = children.size();

        for (int i = 0; i < children.size(); i++) {
            cc += children.get(i).childCount();
        }

        return cc;
    }
}
