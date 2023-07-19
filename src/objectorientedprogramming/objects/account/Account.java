package objectorientedprogramming.objects.account;

public class Account {
    int account_no;
    String name;
    float balance;

    void insert(int acc_no, String n, float bal)
    {
        account_no = acc_no;
        name = n;
        balance = bal;
    }

    void checkBalance()
    {
        System.out.println("Balance="+balance);
    }

    void deposit(float amount)
    {
        balance = balance + amount;
        System.out.println(amount+" deposited");
    }

    void withdraw(float amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance = balance - amount;
            System.out.println(amount+" withdrawn");
        }
    }

    void display()
    {
        System.out.println("Account No="+account_no);
        System.out.println("Name="+name);
        System.out.println("Balance="+balance);
    }
}
