package objectorientedprogramming.abstraction.interfaces.nestedinterface;

public class Programmer implements Employee, Employee.Address{
    public void getSalary()
    {
        System.out.println("Salary is 30000");
    }
    public void getAddress()
    {
        System.out.println("Address: Ahmedabad Gujarat India");
    }
}
