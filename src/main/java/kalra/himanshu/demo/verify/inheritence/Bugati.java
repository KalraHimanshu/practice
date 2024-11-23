package kalra.himanshu.demo.verify.inheritence;

import lombok.Data;

public class Bugati implements Car, RacingCar {
    @Override
    public void run() {
        System.out.println("Bugati Running");
    }

    @Override
    public void repair() {
        RacingCar.super.repair();
    }
}
