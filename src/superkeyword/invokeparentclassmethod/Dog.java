package superkeyword.invokeparentclassmethod;

public class Dog extends Animal {
    void eat()
    {
        System.out.println("Dog is eating bread....");
        super.eat(); // invoke eat method of Animal class
    }
    void bark()
    {
        System.out.println("Dog is barking...");
    }
}
