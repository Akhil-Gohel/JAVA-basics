package thiskeyword.passasanargumentinmethod;

public class Student {
    int id;
    String name;
    String branch;

    Student(int id, String name, String branch)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public void checkBranch()
    {
        displayBranch(this);
    }

    public void displayBranch(Student s)
    {
        System.out.println("Branch = "+s.branch);
    }
}
