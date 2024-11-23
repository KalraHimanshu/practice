package kalra.himanshu.demo.practice.string;

public class ReverseInt {

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));


    }

    public static int reverse(int x) {

        if(x==Integer.MIN_VALUE) return 0;

        int num =x;
        if(x<0) {
            num *=-1;
        }
//        int x = 9_646_324_351;
//        2147483647
//        Integer.MAX_VALUE;
        String ns = String.valueOf(num);
        StringBuilder sb = new StringBuilder(ns);
        sb.reverse();
        int nRev = Integer.valueOf(sb.toString());
        return x<0 ? nRev*-1 : nRev;
    }
}
