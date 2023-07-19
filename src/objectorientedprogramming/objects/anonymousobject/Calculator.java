package objectorientedprogramming.objects.anonymousobject;

public class Calculator {
    void fact(int no)
    {
        int ans = 1;
        for(int i=1; i<=no; i++)
        {
            ans = ans*i;
        }
        System.out.println("factorial="+ans);
    }
}
