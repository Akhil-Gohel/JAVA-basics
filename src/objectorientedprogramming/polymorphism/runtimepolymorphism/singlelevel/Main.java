package objectorientedprogramming.polymorphism.runtimepolymorphism.singlelevel;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Splendor(); // upcasting
        b1.run(); // overridden method run() of Splendor class is called through the reference variable of Bike superclass.
    }
}
