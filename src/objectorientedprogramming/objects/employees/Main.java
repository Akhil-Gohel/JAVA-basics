package objectorientedprogramming.objects.employees;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insert(101,"Akhil",50000);
        e2.insert(102,"Aman",60000);
        e3.insert(103,"Mitesh",40000);

        e1.display();
        e2.display();
        e3.display();
    }
}
