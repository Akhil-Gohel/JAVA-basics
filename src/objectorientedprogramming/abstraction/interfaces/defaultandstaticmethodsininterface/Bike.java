package objectorientedprogramming.abstraction.interfaces.defaultandstaticmethodsininterface;

public interface Bike {
    void getNoPlate();
    default void run()
    {
        System.out.println("Bike is Running");
    }
    static void changeGear()
    {
        System.out.println("Gear changed");
    }
}
