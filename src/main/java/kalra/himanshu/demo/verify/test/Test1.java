package kalra.himanshu.demo.verify.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        String str = "csdaca";

//        freqOfEachChar
        Map<Character, Long> result1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        try {

//        [6,8,9,1,2]  Find subset whose sum= 7
            int[] arr = {6, 8, 9, 1, 2};
            List<List<Integer>> result = new ArrayList<>();
            findSubSet(arr, 7, result, new ArrayList<>(), 0);

            System.out.println(result);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void findSubSet(int[] arr, int sum, List<List<Integer>> result, List<Integer> currentIteration, int ix) {
        if (ix >= arr.length) return;

        if(sum == 0) {
            result.add(currentIteration);
            return;
        }
        List inclusiveCurrentPosList = new ArrayList(currentIteration);
        inclusiveCurrentPosList.add(arr[ix]);
        findSubSet(arr, sum-arr[ix], result, inclusiveCurrentPosList, ix+1);
        findSubSet(arr, sum, result, currentIteration, ix+1);
    }



//    "GET: /employee/{empId}"
//
//    RestController: EMp-> service-> DAO-> DB

}
