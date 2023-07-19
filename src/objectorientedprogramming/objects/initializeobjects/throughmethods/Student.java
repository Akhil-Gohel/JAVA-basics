package objectorientedprogramming.objects.initializeobjects.throughmethods;

public class Student {
    int id;
    String name;

    void insert(int i, String n)
    {
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println(id + " " + name);
    }
}
