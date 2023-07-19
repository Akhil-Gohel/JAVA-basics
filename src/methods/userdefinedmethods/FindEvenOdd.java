package methods.userdefinedmethods;

public class FindEvenOdd {
    public static void main(String[] args) {
        findEvenOdd(23);
    }

    public static void findEvenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+" is even");
        }
        else
        {
            System.out.println(n+" is odd");
        }
    }
}
