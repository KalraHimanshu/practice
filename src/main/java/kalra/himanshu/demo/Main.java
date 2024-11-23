package kalra.himanshu.demo;

import kalra.himanshu.demo.verify.inheritence.Bugati;
import kalra.himanshu.demo.verify.inheritence.Car;
import kalra.himanshu.demo.verify.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        inheritanceExampleRun();
        singletonTest();
    }

    private static void inheritanceExampleRun() {
        Car bugati = new Bugati();
        bugati.run();
        bugati.repair();
    }

    private static void singletonTest() {


        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();
    }
}