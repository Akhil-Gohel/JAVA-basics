package functions;

import java.util.Scanner;

public class greater_value {
    public static int greaterValue(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("The greater value is : "+greaterValue(a, b));
    }
}
