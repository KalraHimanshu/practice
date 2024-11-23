package kalra.himanshu.demo.interview.guardian;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Test1 {

    // i/p => a=1, b=10 - inclusive
    // top 5 even numbers in the range

    public static void main(String[] args) {
        printTopNEven(5, 100, 5);
    }

    static void printTopNEven(final int start, final int end, final int topCount) {

        IntStream.range(start,end+1).boxed().sorted(Comparator.reverseOrder()).filter(i-> i%2==0).limit(topCount).forEach(System.out::println);

//        int counter = topCount;
//        for (int i= end; i>=start; --i) {
//            if (counter<=0) break;
//            if(i%2==0) {
//                System.out.println(i);
//                counter--;
//            }
//        }
    }
}
