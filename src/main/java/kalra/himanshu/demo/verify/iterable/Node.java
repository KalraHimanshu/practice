package kalra.himanshu.demo.verify.iterable;

import lombok.ToString;

@ToString
public class Node {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
