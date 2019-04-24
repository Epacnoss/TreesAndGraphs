import java.util.ArrayList;
import java.util.List;

public class program {

    public static void main (String[] args)
    {
        List<Node> nodes = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < 100; i++) {
            temp += i;
            if(i == 0)
                nodes.add(new Node(temp));
            else
                nodes.add(new Node(nodes.get(i - 1), temp));

        }

        for (int i = 1; i < nodes.size() - 1; i++)
        {
            nodes.get(i).addChild(nodes.get(i - 1));
        }

        for (int i = 0; i < nodes.size(); i++) {
            System.out.println(nodes.get(i));
        }
    }


}
