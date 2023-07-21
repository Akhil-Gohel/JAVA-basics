package superkeyword.invokeparentclassconstructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Akhil","CE");
        Student s2 = new Student(102,"Aman","IT");

        s1.display();
        s2.display();
    }
}
