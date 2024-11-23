package kalra.himanshu.demo.practice.array;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

//        System.out.println(set);
        if(set.size()==nums.length) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println("Result-"+containsDuplicate(arr));
    }
}
