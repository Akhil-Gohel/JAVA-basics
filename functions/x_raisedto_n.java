package functions;

import java.util.Scanner;

public class x_raisedto_n {
    public static int raisedTo(int x, int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans * x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value x : ");
        int x = sc.nextInt();
        System.out.println("Enter the power value n : ");
        int n = sc.nextInt();
        System.out.println(x+" Raised to "+n+" is : "+raisedTo(x, n));
    }
}
