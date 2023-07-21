package objectorientedprogramming.abstraction.abstractclassandinterface;

public abstract class MountainBike implements Bike {
    public void getSpeedLimit()
    {
        System.out.println("Speed Limit is 100");
    }
    public void changeGear()
    {
        System.out.println("Gear changed");
    }
}
