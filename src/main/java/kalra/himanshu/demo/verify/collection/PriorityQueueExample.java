package kalra.himanshu.demo.verify.collection;

import lombok.Builder;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<PQNode> pq = new PriorityQueue<>(
//                Comparator.comparing(PQNode::getSequence)
                Comparator.reverseOrder()
        );

        try {


            pq.add(PQNode.builder().value("a").build());
            pq.add(PQNode.builder().value("b").build());
            pq.add(PQNode.builder().build());
            pq.add(PQNode.builder().sequence(2).build());
            pq.add(PQNode.builder().sequence(3).build());

            System.out.println(pq);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}