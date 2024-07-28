package arrays;
import java.util.Scanner;

public class is_acending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int size = sc.nextInt();
        int names[] = new int[size];

        System.out.println("enter values : ");
        for(int i=0; i<names.length; i++ ){
            names[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<names.length - 1; i++ ){
            if(names[i]>names[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("Array is in ascending order.");
        }
        else{
            System.out.println("Array is not in ascending order.");
        }

    }
}
