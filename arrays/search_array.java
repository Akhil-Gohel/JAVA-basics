package arrays;

import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int size = sc.nextInt();
        int names[] = new int[size];

        System.out.println("enter values : ");
        for(int i=0; i<names.length; i++ ){
            names[i] = sc.nextInt();
        }

        System.out.println("enter values you want to search : ");
        int x = sc.nextInt();
        for(int i=0; i<names.length; i++ ){
            if(names[i] == x){
                System.out.println("the value found at : "+i);
            }
        }
    } 
}
  
