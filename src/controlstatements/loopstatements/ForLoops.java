package controlstatements.loopstatements;

public class ForLoops {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            System.out.println(i);
        }
        System.out.println();

        // labeled for loops
        aa:for(int i=1; i<=3; i++)
        {
            bb:for(int j=1; j<=3; j++)
            {
                if(i==2 && j==2)
                {
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println();

        aa:for(int i=1; i<=3; i++)
        {
            bb:for(int j=1; j<=3; j++)
            {
                if(i==2 && j==2)
                {
                    break bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
