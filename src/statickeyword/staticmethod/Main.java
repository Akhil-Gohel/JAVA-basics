package statickeyword.staticmethod;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Akhil");
        Student s2 = new Student(102,"Aman");
        Student s3 = new Student(103,"Mitesh");

        s1.display();
        s2.display();

        Student.changeCollege();
        s3.display();
    }
}
