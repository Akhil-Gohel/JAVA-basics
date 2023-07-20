package thiskeyword.passasargumentinconstructor;

public class Student {
    int id;
    String name;
    String branch;

    Student(int id, String name, String branch)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
        Branch b1 = new Branch(this);
        b1.displayBranch();
    }

    public void display()
    {
        System.out.println(id+" "+name+" "+branch);
    }
}
