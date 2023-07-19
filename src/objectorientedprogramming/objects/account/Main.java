package objectorientedprogramming.objects.account;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(101010,"Akhil",5000);
        a1.display();
        a1.checkBalance();
        a1.deposit(2000);
        a1.checkBalance();
        a1.withdraw(3000);
        a1.checkBalance();
    }
}
