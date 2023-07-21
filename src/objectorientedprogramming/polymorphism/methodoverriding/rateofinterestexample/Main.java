package objectorientedprogramming.polymorphism.methodoverriding.rateofinterestexample;

public class Main {
    public static void main(String[] args) {
        ICICI i = new ICICI();
        SBI s = new SBI();
        AXIS a = new AXIS();

        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
