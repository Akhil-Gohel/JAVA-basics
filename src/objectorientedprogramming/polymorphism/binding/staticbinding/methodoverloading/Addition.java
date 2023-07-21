package objectorientedprogramming.polymorphism.binding.staticbinding.methodoverloading;

public class Addition {
    int add(int n1, int n2){return n1+n2;}
    int add(int n1, int n2, int n3){return n1+n2+n3;}

    public static void main(String[] args) {
        Addition a1 = new Addition(); // compiler did not check type of object in static binding
        System.out.println(a1.add(10,20)); // it just checked only method call through which reference variable
        System.out.println((a1.add(10,20,30)));
    }
}
