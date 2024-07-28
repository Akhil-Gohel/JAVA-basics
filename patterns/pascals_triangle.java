package patterns;

//     1              1          
//    1 1            2 3
//   1 2 1          4 5 6 
//  1 3 3 1        7 8 9 10
// 1 4 6 4 1      11 12 13 14


public class pascals_triangle {
    public static int coEff(int n,int r){
        int coeff = 1;

        if(r > n-r)
        r = n-r;

        for(int i=0; i<r; i++){
            coeff = coeff * (n-i);
            coeff = coeff / (i+1);
        }
        return coeff;
    }
    public static void main(String[] args) {
        int n = 6;
        for(int i=0; i<n; i++){
            //Spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(coEff(i,j)+" ");
            }

            // int c = 1;
            // for(int j=1; j<=i; j++){
            //     System.out.print(c + " ");
            //     c = c * (i-j) / j;
            // }

            // c(n,r) = n! / (n-r)! * r!
            // c(n,r-1) = n! / (n-r+1)! * (r-1)!

            // c(n,r) = c(n,r-1) * (n-r+1) / r

            System.out.println();
        }
    }
}
