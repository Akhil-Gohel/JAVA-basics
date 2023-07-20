package thiskeyword.invokecurrentclassconstructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Akhil","CE");
        Student s2 = new Student(102,"Aman","IT");
        Student s3 = new Student(103,"Mitesh","ICT");

        s1.display();
        s2.display();
        s3.display();
    }
}
