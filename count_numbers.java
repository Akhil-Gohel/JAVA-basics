import java.util.Scanner;

public class count_numbers {
    public static void main(String[] args) {
        int i = 1;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            if(num > 0){
                pos++;
            }
            else if(num < 0){
                neg++;
            }
            else{
                zero++;
            }
            System.out.println("Enter 1 for continue or 0 for stop : ");
            i = sc.nextInt();
        }while(i==1);
        System.out.println("Positive numbers entered = "+pos);
        System.out.println("Negative numbers entered = "+neg);
        System.out.println("Zeros entered = "+zero);
    }
}
