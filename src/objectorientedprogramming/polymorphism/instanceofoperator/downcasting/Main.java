package objectorientedprogramming.polymorphism.instanceofoperator.downcasting;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        doAnimalStuff(dog);
        doAnimalStuff(cat);

        Animal animal = new Animal();
        doAnimalStuff(animal);
    }

    public static void doAnimalStuff(Animal animal) // upcasting to Animal
    {
        animal.eat();
        if(animal instanceof Dog)
        {
            Dog dog = (Dog)animal; // downcasting Animal to Dog
            dog.bark();
        }
        else if(animal instanceof Cat)
        {
            Cat cat = (Cat)animal; // downcasting Animal to Cat
            cat.meow();
        }
    }
}
