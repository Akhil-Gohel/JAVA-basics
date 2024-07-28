package Strings;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = sc.next();
        System.out.println("Enter your first name:");
        String lname = sc.next();

        String name = fname + " " + lname;
        System.out.println("Entered name is:");
        System.out.println(name);

        System.out.print("Your name is:");

        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i));
        }
    }
}
