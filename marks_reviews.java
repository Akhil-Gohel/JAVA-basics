/* 
Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why) 
*/

import java.util.Scanner;

public class marks_reviews {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter marks out of 100 : ");
            float marks = sc.nextFloat();
            
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            }
            else if(marks>=60 && marks<90){
                System.out.println("This is also Good");
            }
            else if(marks>=0 && marks<60){
                System.out.println("This is Good as well");
            }
            else{
                System.out.println("Invalid");
            }

            System.out.println("Enter number 1 for continue review or number 0 for exit : ");
            input = sc.nextInt();
            
        }while(input==1);
        sc.close();
    }
}
