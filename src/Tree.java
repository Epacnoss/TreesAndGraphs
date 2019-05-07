import java.util.ArrayList;
import java.util.List;

public class Tree {

    private Node root = null;

    public Tree(Node root) {
        this.root = root;
    }

    protected Node getRoot() {
        return root;
    }

    public Boolean isEmpty ()
    {
        return root == null;
    }

    public void print ()
    {
        if(this.isEmpty())
        {
            System.err.println("TREE IS EMPTY");
            return;
        }

        List<Node> lastNodes = new ArrayList<>();
        lastNodes.add(root);

        while(!lastNodes.isEmpty())
        {
            Node[] nodeArrayFam = lastNodes.toArray(new Node[0]);
            lastNodes.clear();

            for (int i = 0; i < nodeArrayFam.length; i++) {
                System.out.print(nodeArrayFam[i].toString() + " ");
                
                Node[] kiddies = nodeArrayFam[i].getChildren().toArray(new Node[0]);
                if(kiddies == null)
                {
                    continue;
                }

                for (int j = 0; j < kiddies.length; j++) {
                    lastNodes.add(kiddies[i]);
                }
                
            }

            System.out.println();

        }
    }

}
