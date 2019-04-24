public class Node {

    private Node parent;
    private Node[] children;

    private String content;

    public Node(Node parent, Node[] children, String content) {
        this.parent = parent;
        this.children = children;
        this.content = content;
    }
}
