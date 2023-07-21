package objectorientedprogramming.polymorphism.binding.dynamicbinding.methodoverriding;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Lion();

        a1.eat(); // call eat() method of Animal class because the reference variable is pointing to the object of Animal class.
        a2.eat(); // call eat() method of Lion class because the reference variable is pointing to the object of Loin class.
        // JVM resolved the method calls based on the type of object at runtime.
    }
}
