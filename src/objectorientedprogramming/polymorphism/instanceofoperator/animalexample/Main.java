package objectorientedprogramming.polymorphism.instanceofoperator.animalexample;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1 instanceof Animal); // true

        Animal a1 = new Dog(); // upcasting
        System.out.println(a1 instanceof Dog); // true
        System.out.println(a1 instanceof Animal); // true
    }
}
