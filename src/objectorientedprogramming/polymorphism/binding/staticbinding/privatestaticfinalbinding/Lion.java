package objectorientedprogramming.polymorphism.binding.staticbinding.privatestaticfinalbinding;

public class Lion
{
    private void eat()
    {
        System.out.println("Lion eats flesh");
    }
    static void live()
    {
        System.out.println("Lion lives in Jungle");
    }
    public static void main(String[] args)
    {
        Lion l = new Lion();
        l.eat(); // final, static and private methods can not be overridden
        Lion.live();
    }
}
