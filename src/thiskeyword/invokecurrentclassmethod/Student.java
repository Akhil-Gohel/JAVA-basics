package thiskeyword.invokecurrentclassmethod;

public class Student {
    int id;
    String name;
    String branch;

    Student(int id, String name, String branch)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.display(); //invoking the display method
    }

    public void display()
    {
        System.out.println(id+" "+name+" "+branch);
    }
}
