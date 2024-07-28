package

public class ArrayOfStringBuilder {
    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0]="Aman";
        arr[1]="Akhil";
        arr[2]="Mitesh";
        arr[3]="Jay";
        arr[4]="Vivek";

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }

        System.out.println("Total length is:"+sb.length());
    }
    
}
