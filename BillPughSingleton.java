package kalra.himanshu.demo.verify.singleton;

public class BillPughSingleton {

    static BillPughSingleton instance =null;
    private BillPughSingleton() {
//        if (instance!=null)
//            throw new RuntimeException("Ille");
    }

    private static class SingletonHelper {
        private static final BillPughSingleton BILL_PUGH_SINGLETON_INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        instance =  SingletonHelper.BILL_PUGH_SINGLETON_INSTANCE;
        return instance;
    }
}
