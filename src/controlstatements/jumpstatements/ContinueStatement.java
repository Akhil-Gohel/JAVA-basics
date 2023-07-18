package controlstatements.jumpstatements;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();

        aa:for(int i=1; i<=3; i++)
        {
            bb:for(int j=1; j<=3; j++){
                if(i==2 && j==2)
                {
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println();

        aa:for(int i=1; i<=3; i++)
        {
            bb:for(int j=1; j<=3; j++){
                if(i==2 && j==2)
                {
                    continue bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
