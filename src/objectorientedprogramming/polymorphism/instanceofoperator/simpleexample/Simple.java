package objectorientedprogramming.polymorphism.instanceofoperator.simpleexample;

public class Simple {
    public static void main(String[] args) {
        Simple s = new Simple();
        System.out.println(s instanceof Simple); // true
        s = null;
        System.out.println(s instanceof Simple); // false if any variable has null value
    }
}
