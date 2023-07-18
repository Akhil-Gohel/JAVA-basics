package controlstatements.loopstatements;

public class WhileLoops {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        System.out.println();

        i=1;
        aa:while(i<=3)
        {
            int j=1;
            bb:while(j<=3)
            {
                System.out.println(i+" "+j);
                if(i==2 && j==2)
                {
                    break aa;
                }
                j++;
            }
            i++;
        }
    }
}
