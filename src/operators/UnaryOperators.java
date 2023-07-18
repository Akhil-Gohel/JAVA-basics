package operators;
public class UnaryOperators {
    public static void main(String[] args) {

        // Unary Operators
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        System.out.println();

        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
        System.out.println();

        int u1=10;
        int u2=-10;
        boolean u3=true;
        boolean u4=false;
        System.out.println("u1 = " + ~u1);//-11 (minus of total positive value which starts from 0)
        System.out.println("u2 = " + ~u2);//9 (positive of total minus, positive starts from 0)
        System.out.println("u3 = " + !u3);//false (opposite of boolean value)
        System.out.println("u4 = " + !u4);//true

    }
}
