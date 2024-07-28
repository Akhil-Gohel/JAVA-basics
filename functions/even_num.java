package functions;

import java.util.Scanner;

public class even_num {
    public static void isEven(int n){
        if(n%2 == 0){
            System.out.println("It is an even number.");
        }
        else{
            System.out.println("It is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
    }
}
