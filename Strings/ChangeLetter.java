package Strings;
import java.util.Scanner;

public class ChangeLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String org = sc.nextLine();

        String res = "";
        res = org.replace('e','i');
        System.out.println("result String is :"+res);
        System.out.println("Original String is :"+org);
    }
}
