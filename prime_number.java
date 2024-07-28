// Print if a number is prime or not (Input n from the user).

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i<n){
            if(n%i==0){
                System.out.println(n+" is not a prime number");
                break;
            }
            else{
                i++;
                if(i==n){
                    System.out.println(n+" is a prime number");
                }
            }
        }      
    }
}
