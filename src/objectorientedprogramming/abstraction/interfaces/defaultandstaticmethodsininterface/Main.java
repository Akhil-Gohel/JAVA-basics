package objectorientedprogramming.abstraction.interfaces.defaultandstaticmethodsininterface;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Honda();
        b1.getNoPlate();
        b1.run();
        Bike.changeGear();
    }
}
