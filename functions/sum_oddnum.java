package functions;

import java.util.Scanner;

public class sum_oddnum {
    public static int sumOddNum(int n){
        int sum = 0;
        for(int i=1; i<=n; i+=2){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOddNum(n);
        System.out.println("Sum of odd numbers is : "+sum);
    }
}
