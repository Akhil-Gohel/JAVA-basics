package constructor.copyconstructor;

public class Student {
    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    Student(Student s) //copy constructor
    {
        this.id = s.id;
        this.name = s.name;
    }

    void display()
    {
        System.out.println(id+" "+name);
    }
}
