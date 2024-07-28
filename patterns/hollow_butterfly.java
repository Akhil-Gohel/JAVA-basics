package patterns;

// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *

public class hollow_butterfly {
    public static void main(String[] args) {
        int n = 5;
        //upper half
        for(int i=1; i<=n; i++){
            //1st part
            for(int j=1; j<=i; j++){
                if(j==i || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1; i--){
            //1st part
            for(int j=1; j<=i; j++){
                if(j==i || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
