package kalra.himanshu.demo.verify.hashCodeEquals;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Random;

public class EqualsOverrideVerify {


    private class Sample {
        int a ;
        int b;

        public Sample(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public Sample() {
        }

        @Override
        public String toString() {
            return "Sample{}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (o instanceof EqualsOverrideVerify) {

            }
            Sample sample = (Sample) o;
            return a == sample.a && b == sample.b;
        }

        @Override
        public int hashCode() {
            return new Random().hashCode();
//            return Objects.hash(a, b);
        }
    }

    public static void main(String[] args) {


        EqualsOverrideVerify.Sample s12 = new EqualsOverrideVerify(). new Sample(1,2);
        EqualsOverrideVerify.Sample s23 = new EqualsOverrideVerify(). new Sample(2,3);
        EqualsOverrideVerify.Sample s00 = new EqualsOverrideVerify(). new Sample();
        EqualsOverrideVerify.Sample s00_1 = new EqualsOverrideVerify(). new Sample();
        System.out.println(s12);
        System.out.println(s23);
        System.out.println(s00);
        System.out.println(s00_1);
        System.out.println(s12.equals(s23));
        System.out.println("00"+s00.equals(s00_1));


    }
}
