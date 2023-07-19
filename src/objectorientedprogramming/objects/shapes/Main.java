package objectorientedprogramming.objects.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.insert(10,5);
        r2.insert(15,20);

        r1.calculateArea();
        r2.calculateArea();
    }
}
