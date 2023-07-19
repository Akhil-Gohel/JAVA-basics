package constructor.copyconstructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Akhil");
        Student s2 = new Student(s1);
        Student s3 = s1;

        s1.display();
        s2.display();
        s3.display();
    }
}
