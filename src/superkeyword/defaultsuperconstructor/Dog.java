package superkeyword.defaultsuperconstructor;

public class Dog extends Animal{
    Dog()
    {
        // super(); invoked automatically by compiler as first statement
        System.out.println("Dog is Created");
    }
}
