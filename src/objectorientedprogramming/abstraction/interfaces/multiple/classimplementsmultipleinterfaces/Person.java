package objectorientedprogramming.abstraction.interfaces.multiple.classimplementsmultipleinterfaces;

public class Person implements Student, Employee{
    public void showBranch()
    {
        System.out.println("Branch is CE");
    }
    public void getSalary()
    {
        System.out.println("Salary is 30000");
    }
}
