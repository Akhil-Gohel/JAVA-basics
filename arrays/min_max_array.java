package arrays;

import java.util.Scanner;

public class min_max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int size = sc.nextInt();
        int names[] = new int[size];

        System.out.println("enter values : ");
        for(int i=0; i<names.length; i++ ){
            names[i] = sc.nextInt();
        }

        int min = names[0];
        int max = names[0];

        for(int i=0; i<names.length; i++){
            if(names[i]<min){
                min = names[i];
            }
            if(names[i]>max){
                max = names[i];
            }
        }

        System.out.println("min is : "+min);
        System.out.println("max ix : "+max);

    }
}
