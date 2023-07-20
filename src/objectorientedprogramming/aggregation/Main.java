package objectorientedprogramming.aggregation;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Ahmedabad","Gujarat","India");
        Address a2 = new Address("Sanand","Gujarat","India");
        Address a3 = new Address("Mumbai","Maharastra","India");

        Student s1 = new Student(101,"Akhil",a1);
        Student s2 = new Student(102,"Aman",a2);
        Student s3 = new Student(103,"Mitesh",a3);

        s1.display();
        s2.display();
        s3.display();
    }
}
