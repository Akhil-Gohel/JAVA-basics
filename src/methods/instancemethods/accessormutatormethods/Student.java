package methods.instancemethods.accessormutatormethods;

public class Student {
    private int id;
    private String name;

    public int getId()//Accessor method
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void display()
    {
        System.out.println(id+" "+name);
    }
}
