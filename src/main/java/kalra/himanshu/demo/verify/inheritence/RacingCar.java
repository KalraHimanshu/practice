package kalra.himanshu.demo.verify.inheritence;

public interface RacingCar {
    void run();

    default void repair() {
        System.out.println("Racing Car's Repair");
    }
}
