import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        float sub1, sub2, sub3, sub4, sub5, total, per;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1 : ");
        sub1 = sc.nextFloat();
        System.out.println("Enter marks of subject 2 : ");
        sub2 = sc.nextFloat();
        System.out.println("Enter marks of subject 3 : ");
        sub3 = sc.nextFloat();
        System.out.println("Enter marks of subject 4 : ");
        sub4 = sc.nextFloat();
        System.out.println("Enter marks of subject 5 : ");
        sub5 = sc.nextFloat();
        System.out.println("Enter the total marks : ");
        total = sc.nextFloat();

        per = (sub1+sub2+sub3+sub4+sub5)/total * 100;
        System.out.println("Your Percentage os : "+per);

    }
}
