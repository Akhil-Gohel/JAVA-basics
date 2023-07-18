package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical && vs Bitwise &
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
        System.out.println();

        // Logical || vs Bitwise |
        int x=10;
        int y=5;
        int z=20;
        System.out.println(x>y||x<z);//true || true = true
        System.out.println(x>y|x<z);//true | true = true
        // || vs |
        System.out.println(x>y||x++<z);//true || true = true
        System.out.println(x);//10 because second condition is not checked
        System.out.println(x>y|x++<z);//true | true = true
        System.out.println(x);//11 because second condition is checked
    }
}
