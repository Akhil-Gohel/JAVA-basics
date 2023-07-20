package objectorientedprogramming.objects.initializeobjects.throughconstructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Akhil");
        Student s2 = new Student(102,"Aman");

        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
