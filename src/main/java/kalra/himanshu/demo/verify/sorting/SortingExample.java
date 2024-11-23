package kalra.himanshu.demo.verify.sorting;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SortingExample {

    public static void main(String[] args) {

        int[] iarr= {1,2,3,0,9,8};

        arraySorting(iarr);

        streamStats(iarr);

        skipLimitSorted(iarr);

    }

    private static void skipLimitSorted(int[] iarr) {
        System.out.println("sorted ");
        Arrays.stream(iarr).sorted().forEach(System.out::println);
        System.out.println("limit 3 skip 2 test 1");
        Arrays.stream(iarr).sorted().limit(3).skip(2).forEach(System.out::println);

        System.out.println("skip 2, sorted test 1");

        Arrays.stream(iarr).skip(2).sorted().forEach(System.out::println);

        System.out.println("skip 2 limit 3 test 1");
        Arrays.stream(iarr).sorted().skip(2).limit(3).forEach(System.out::println);
    }

    private static void streamStats(int[] iarr) {
        IntSummaryStatistics summary = Arrays.stream(iarr).summaryStatistics();
        System.out.println(summary);
        System.out.println(summary.getMax());
    }

    private static void arraySorting(int[] iarr) {
        System.out.println(iarr);
        System.out.println(Arrays.toString(iarr));

        Arrays.sort(iarr);
        System.out.println("after Arrays.sort");

        System.out.println(iarr);
        System.out.println(Arrays.toString(iarr));
    }


}
