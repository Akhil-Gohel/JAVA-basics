package statickeyword.staticvariable;

public class Student {
    int id;
    String name;

    static String college = "LJ";

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void display()
    {
        System.out.println(id+" "+name+" "+college);
    }
}
