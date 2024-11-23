package kalra.himanshu.demo.practice.string;

import java.util.Iterator;
import java.util.List;

public class MemoryAllocation {

    public static void main(String[] args) {
//        memoryVerifyString();


        String s = "abcdef";

        String repeated = s.repeat(3);
        System.out.println(repeated);

        System.out.println(s.substring(1,3));

        s.indexOf("bc");

    }



    private static void memoryVerifyString() {
        String s1 = "rs";
        String s2 = "rs";
        String s3 = s2;
        String s4 = new String("rs");
        s4.intern();
        String s5 = "rs";
        String s6 = s4;


        List lt = List.of(s1, s2, s3, s4, s5, s6);

        Iterator itr = lt.iterator();
        System.out.println("hash-codes");
        while (itr.hasNext()) {
            System.out.println(System.identityHashCode(itr.next()));
        }
        System.out.println("== s3, s4, s5");
        System.out.println("s3==s4" + (s3 == s4));
        System.out.println("s5==s4" + s5 == s4);

        System.out.println("s3==s2" + s3 == s2);
    }
}
