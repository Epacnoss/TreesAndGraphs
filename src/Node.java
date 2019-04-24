public class Node {

    private Node parent;
    private Node[] children;

    private int content;

    public Node(Node parent, Node[] children, int content) {
        this.parent = parent;
        this.children = children;
        this.content = content;
    }
}
