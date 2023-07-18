package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;//101
        int b = 3;//011

        System.out.println(a&b);//1=001
        System.out.println(a|b);//7=111
        System.out.println(a^b);//6=110
    }
}
