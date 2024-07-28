package arrays;

import java.util.Scanner;

public class user_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int  size = sc.nextInt();
        int names[] = new int[size];

        System.out.println("enter values of the array : ");
        for(int i=0; i<size; i++){
            names[i] = sc.nextInt();
        }

        System.out.println("your array is : ");
        for(int i=0; i<names.length ; i++){
            System.out.println(names[i]);
        }
    }
}
