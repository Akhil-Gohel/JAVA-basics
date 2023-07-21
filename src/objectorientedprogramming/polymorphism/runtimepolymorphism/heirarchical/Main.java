package objectorientedprogramming.polymorphism.runtimepolymorphism.heirarchical;

public class Main {
    public static void main(String[] args) {
        Bank b1;
        b1 = new AXIS();
        System.out.println("AXIS Rate of Interest = "+b1.getRateOfInterest());
        b1 = new ICICI();
        System.out.println("ICICI Rate of Interest = "+b1.getRateOfInterest());
        b1 = new SBI();
        System.out.println("SBI Rate of Interest = "+b1.getRateOfInterest());
    }
}
