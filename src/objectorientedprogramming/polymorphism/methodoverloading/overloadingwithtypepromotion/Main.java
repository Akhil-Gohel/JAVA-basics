package objectorientedprogramming.polymorphism.methodoverloading.overloadingwithtypepromotion;

public class Main {
    public static void add(int n1, long n2){System.out.println((n1+n2));}
    public static void add(int n1, int n2, int n3){System.out.println(n1+n2+n3);}

    public static void main(String[] args) {
        Main.add(10,20); // now second int literal will be promoted to long
        Main.add(10,20,30);
    }
}
