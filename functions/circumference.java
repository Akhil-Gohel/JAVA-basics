package functions;

import java.util.Scanner;

public class circumference {
    public static float circumference(float r){
        return 2 * 3.14f * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        float circumference = circumference(r);
        System.out.println("Circumference is : "+circumference);
    }
}
