// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

package Strings;
import java.util.Scanner;

public class NameFromEmail {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String email = sc.nextLine();

        String name = email.split("@")[0];

        System.out.println("Username :"+name);

    }
}
