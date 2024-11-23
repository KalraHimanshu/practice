package kalra.himanshu.demo.interview.oracle;

public class Test {

    public static void main(String[] args) {
        printPrime(100);
    }

    static void printPrime(int n) {

        for (int i =2; i<101; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {

        for (int i =2; i<= Math.sqrt(num); ++i) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
