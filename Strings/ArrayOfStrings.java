package Strings;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0]="Aman";
        arr[1]="Akhil";
        arr[2]="Mitesh";
        arr[3]="Jay";
        arr[4]="Vivek";

        int totalLength = 0;

        for(int i=0; i<arr.length; i++){
            totalLength += arr[i].length();
        }

        System.out.println("Total length is:"+totalLength);
    }
    
}
