package objectorientedprogramming.polymorphism.covariantreturntype;

public class C extends B{
    C get(){return this;}
    void print(){
        System.out.println("Welcome to class C");
    }
}
