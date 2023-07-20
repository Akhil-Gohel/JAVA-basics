package thiskeyword.invokecurrentclassconstructor;

public class Student {
    int id;
    String name;
    String branch;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, String branch)
    {
        this(id,name); // invoking the constructor and it must be the first line
        this.branch = branch;
    }

    public void display()
    {
        System.out.println(id+" "+name+" "+branch);
    }
}
