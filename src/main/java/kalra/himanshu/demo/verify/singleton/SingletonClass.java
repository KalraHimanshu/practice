package kalra.himanshu.demo.verify.singleton;

import lombok.ToString;

@ToString
public class SingletonClass {

    {
        System.out.println("static block Sc");
    }
    private byte data;

    private SingletonClass() {
        System.out.println("Constructor Called");
    }
    
    private static class SingletonHelper{

        static {
            System.out.println("static block Helper called");
        }
        private static final SingletonClass instance = new SingletonClass();
        private static final SingletonClass instance2 = new SingletonClass();
//        *** It causes below logs
//        static block Helper called
//        static block Sc
//        Constructor Called
//        static block Sc
//        Constructor Called
    }


    public static SingletonClass getInstance() {
        return SingletonHelper.instance;
//        return null;
    }
        



}
