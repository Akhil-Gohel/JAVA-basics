package objectorientedprogramming.objects.initializeobjects.throughmethods;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.insert(101,"Akhil");
        s2.insert(102,"Aman");

        s1.display();
        s2.display();
    }
}
