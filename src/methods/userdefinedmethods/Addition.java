package methods.userdefinedmethods;

public class Addition {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int ans = add(n1,n2);
        System.out.println("Addition = "+ans);
    }

    public static int add(int n1,int n2)
    {
        int ans = 0;
        ans = n1 + n2;
        return ans;
    }
}
