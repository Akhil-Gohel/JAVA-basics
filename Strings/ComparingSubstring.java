package Strings;

public class ComparingSubstring {
    public static void main(String[] args) {
        String name1 = "Tony Stark";
        String name2 = "Steve Rogers";

        String n1 = name1.substring(5);
        String n2 = name2.substring(6);

        System.out.println(n1+n2);
        System.out.println(n1.compareTo(n2));

        if(n1.compareTo(n2)==0){
            System.out.println("Strings are Equals");
        }
        else{
            System.out.println("Strings are NOT Equals");
        }

        if(n1.equals(n2)){
            System.out.println("Strings are Equals");
        }
        else{
            System.out.println("Strings are NOT Equals");
        }
        
    }
}
