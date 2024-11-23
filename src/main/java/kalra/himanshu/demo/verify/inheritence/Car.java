package kalra.himanshu.demo.verify.inheritence;

public interface Car {
    void run();

    default void repair() {
        System.out.println("Car's Repair");
    }

}
