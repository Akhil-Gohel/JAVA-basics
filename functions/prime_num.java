package functions;

import java.util.Scanner;

public class prime_num {
    public static boolean isPrimeNumber(int n){
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        boolean ans = isPrimeNumber(n);
        if(ans){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("it is not a prime number.");
        }
    }
}
