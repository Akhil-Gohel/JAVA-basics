package methods.instancemethods.accessormutatormethods;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Akhil");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        s1.display();
    }
}
