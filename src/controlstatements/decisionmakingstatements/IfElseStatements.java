package controlstatements.decisionmakingstatements;

public class IfElseStatements {
    public static void main(String[] args) {
        // simple if statement
        int a = 10;
        int b = 20;
        int c = 30;
        if (a < b) {
            System.out.println(a + " is less than " + b);
        }

        // if-else statement
        if (a > b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }

        // if-else-if ladder
        if (a == b) {
            System.out.println("a and b are equal");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }

        // nested if statement
        if (a < b)
        {
            if(a < c)
            {
                System.out.println("a is smallest");
            }
            else
            {
                System.out.println("c is smallest");
            }
        }
        else
        {
            if (b < c)
            System.out.println("b is smallest");
        }
    }
}
