package finalkeyword.finalvariable;

public class Bike {
    final int speedLimit = 90;

    // speedLimit = 100; you cannot change the value of final variable(It will be constant).

    void getSpeedLimit()
    {
        System.out.println("Speed Limit is = "+speedLimit);
    }
}
