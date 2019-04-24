import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class program {

    public static void main (String[] args)
    {
//        List<Node> nodes = new ArrayList<>();
//
//        //region Nodes init
//        String temp = "";
//        for (int i = 0; i < 100; i++) {
//            temp += i;
//            if(i == 0)
//                nodes.add(new Node(temp));
//            else
//                nodes.add(new Node(nodes.get(i - 1), temp));
//
//        }
//        for (int i = 1; i < nodes.size() - 1; i++)
//        {
//            nodes.get(i).addChild(nodes.get(i - 1));
//        }
//        //endregion
//
//        for (int i = 0; i < nodes.size(); i++) {
//            System.out.println(nodes.get(i));
//        }

        //region node init
        Node root = new Node(null, 1);

        Node n1 = new Node(root, 1);
        Node n2 = new Node(root, 2);
        Node n3 = new Node(root, 3);

        Node[] kids1, kids2, kids3;
        kids1 = new Node[10];
        kids2 = new Node[10];
        kids3 = new Node[10];

        for(int i = 0; i < kids1.length; i++)
        {
            kids1[i] = new Node(n1, i);
            kids2[i] = new Node(n2, i);
            kids3[i] = new Node(n3, i);
        }


        root.addChild(n1);
        root.addChild(n2);
        root.addChild(n3);

        for (int i = 0; i < kids1.length; i++)
        {
            n1.addChild(kids1[i]);
            n2.addChild(kids2[i]);
            n3.addChild(kids3[i]);
        }
        //endregion

        Tree willow = new Tree(root);


        willow.print();


    }


}
