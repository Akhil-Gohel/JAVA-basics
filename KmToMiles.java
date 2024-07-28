import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value in kilometers : ");
        float kms = sc.nextFloat();

        float miles = kms * 0.621371f;
        System.out.println("Miles = "+miles);

        sc.close();
    }
}
