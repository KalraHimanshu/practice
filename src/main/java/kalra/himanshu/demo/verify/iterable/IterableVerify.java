package kalra.himanshu.demo.verify.iterable;

import java.util.ArrayList;
import java.util.List;

public class IterableVerify {
    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        Node n2 = new Node(2, n1);
        List<Node> nodes = List.of(n1, n2);

        for (Node n: nodes) {
            System.out.println(n);
        }

    }
}
