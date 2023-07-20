package thiskeyword.returncurrentclassobject;

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

    Student getStudent()
    {
        return this;
    }

    public void display()
    {
        System.out.println(id+" "+name+" "+branch);
    }
}
