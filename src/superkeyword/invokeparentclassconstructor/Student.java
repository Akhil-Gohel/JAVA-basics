package superkeyword.invokeparentclassconstructor;

public class Student extends Person {
    String branch;

    Student(int id, String name, String branch)
    {
        super(id,name); // Reuse Person Constructor
        this.branch = branch;
    }

    void display()
    {
        System.out.println(id+" "+name+" "+branch);
    }
}
