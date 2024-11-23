package kalra.himanshu.demo.practice.array;

import java.util.Arrays;

public class SingleNumberXOR {

    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {1,10, 3, 1, 3}));
        System.out.println(singleNumber(new int[] {1,11, 10,11, 10}));
    }
}
