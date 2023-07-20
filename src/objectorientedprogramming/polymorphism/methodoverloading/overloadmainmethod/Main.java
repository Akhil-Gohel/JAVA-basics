package objectorientedprogramming.polymorphism.methodoverloading.overloadmainmethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("main with String[] args"); //JVM calls main() method which receives string array as arguments only.
    }
    public static void main(String s)
    {
        System.out.println("main with String arg");
    }
    public static void main()
    {
        System.out.println("main without args");
    }
}
