import java.util.StringJoiner;

public class Edge {

    private Node first;
    private Node second;
    private int weight;

    public Edge(Node first, Node second) {
        this.first = first;
        this.second = second;
    }

    public Edge(Node first, Node second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Edge.class.getSimpleName() + "[", "]")
                .add("first=" + first)
                .add("second=" + second)
                .toString();
    }
}
