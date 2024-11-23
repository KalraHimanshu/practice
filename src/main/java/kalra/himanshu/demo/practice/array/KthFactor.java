package kalra.himanshu.demo.practice.array;

import java.util.ArrayList;
import java.util.List;

public class KthFactor {
    public static int kthFactor(int n, int k) {
        int ans=1, count =0;
        for(int i =1; i<=n;++i) {
            if(n%i==0) {
                ans = i;
                count++;
            }
            if(count ==k) {return ans;}

        }
        if(count ==k) {return ans;}
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println("Result: "+kthFactor(12, 3));
        System.out.println("Result: "+kthFactor(7, 2));
    }
}
