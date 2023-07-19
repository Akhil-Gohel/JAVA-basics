package objectorientedprogramming.objects.initializeobjects.throughreferencevariable;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 101;
        s1.name = "Akhil";
        s2.id = 102;
        s2.name = "Aman";

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
