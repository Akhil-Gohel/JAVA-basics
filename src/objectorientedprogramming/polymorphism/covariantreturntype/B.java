package objectorientedprogramming.polymorphism.covariantreturntype;

public class B extends A{
    B get(){return this;}
    void print(){
        System.out.println("Welcome to class B");
    }
}
