package finalkeyword.blankfinalvariable;

public class Bike {
    final int speedLimit; // Blank final variable

    Bike()
    {
        speedLimit = 90;
        System.out.println("Speed Limit = "+speedLimit);
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
    }
}
