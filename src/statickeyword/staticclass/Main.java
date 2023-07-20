package statickeyword.staticclass;

public class Main {

    static String s = "Static Variable";
    static void display()
    {
        System.out.println("Static Method");
    }

    static public class Demo
    {
        Demo()
        {
            System.out.println("Static Class");
            System.out.println(s);
            display();
        }
    }
    public static void main(String[] args) {
        System.out.println("main method");
        Main.Demo d = new Main.Demo();
    }
}
