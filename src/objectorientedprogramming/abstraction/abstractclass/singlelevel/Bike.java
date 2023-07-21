package objectorientedprogramming.abstraction.abstractclass.singlelevel;

abstract class Bike {
    Bike() // abstract class can have constructor
    {
        System.out.println("Bike is created");
    }
    abstract void run();
    static void changeGear() // abstract class can have non-abstract, static and final methods
    {
        System.out.println("Gear changed");
    }
}
