package functions;

import java.util.Scanner;

public class average{
    public static float average(float a,float b, float c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        float n1 = sc.nextFloat();
        System.out.println("enter number 2 : ");
        float n2 = sc.nextFloat();
        System.out.println("enter number 3 : ");
        float n3 = sc.nextFloat();

        float average = average(n1,n2,n3);
        System.out.println("Average is : "+average);
    }
}