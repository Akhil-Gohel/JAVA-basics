package objectorientedprogramming.inheritance.hybridinheritance;

public class Main {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        BabyCat c = new BabyCat();

        d.eat();
        d.bark();
        d.weep();

        c.eat();
        c.meow();
        c.weep();
    }
}
