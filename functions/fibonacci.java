package functions;

import java.util.Scanner;

public class fibonacci {
    public static void printFibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=3; i<=n; i++){
            int sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
