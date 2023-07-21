package finalkeyword.staticblankfinalvariable;

public class Bike {
    static final int speedLimit; // static final blank variable
    static
    {
        speedLimit = 90;
    }

    public static void main(String[] args) {
        System.out.println("Speed Limit = "+Bike.speedLimit);
    }
}
