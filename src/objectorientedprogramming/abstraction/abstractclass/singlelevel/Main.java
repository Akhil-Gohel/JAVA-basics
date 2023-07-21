package objectorientedprogramming.abstraction.abstractclass.singlelevel;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Honda();
        b1.run();
        Bike.changeGear();
    }
}
