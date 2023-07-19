package methods.instancemethods;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        Main m = new Main();
        System.out.println("Addition="+m.add(n1,n2));
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
