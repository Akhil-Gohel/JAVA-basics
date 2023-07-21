package finalkeyword.finalparameter;

public class Bike {
    int speedLimit;
    void setSpeedLimit(final int speed) // final parameter
    {
        // speed = speed + 10; cannot be changed as speed is final
        speedLimit = speed;
        System.out.println("Speed Limit = "+speedLimit);
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.setSpeedLimit(50);
    }
}
