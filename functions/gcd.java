package functions;

import java.util.Scanner;

public class gcd {
    public static int getGCD(int a, int b){
        if(a>=b){
            for(int i=b; i>=2; i--){
                if(a%i == 0 && b%i == 0){
                    return i;
                }    
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("The Greatest common divisor is : "+getGCD(a, b));
    }
}

