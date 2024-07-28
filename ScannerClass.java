import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter num 1 : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("Sum is : "+sum);

        System.out.println("Enter float value : ");
        float f1 = sc.nextFloat();
        System.out.println("You enter the value : "+f1);

        System.out.println("Enter String : ");
        String str = sc.next();
        // sc.next will take the first word only from string that you enter
        System.out.println("You Entered : "+str);

        System.out.println("Enter the line of String : ");
        String s1 = sc.nextLine();
        System.out.println("You Entered : "+s1); 
    }
}
