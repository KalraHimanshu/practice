package kalra.himanshu.demo.interview.guardian;

public class Test2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
            for (int i=0; i<= 10;++i){
                if(i%2==0) {
                    System.out.println(Thread.currentThread().getName()+"value- " + i);
                }
            }
        });

        Thread t2 = new Thread(()-> {
            for (int i=0; i<= 10;++i){
                if(i%2!=0) {
                    System.out.println(Thread.currentThread().getName()+"value- " + i);
                }
            }
        });
        t1.start();
        t2.start();

    }
}
