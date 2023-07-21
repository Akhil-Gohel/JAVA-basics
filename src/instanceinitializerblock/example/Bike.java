package instanceinitializerblock.example;

import objectorientedprogramming.inheritance.multipleinheritance.B;

public class Bike {
    int speed;

    Bike()
    {
        System.out.println("Speed = "+speed);
    }

    {speed = 30;}

    public static void main(String[] args) {
        Bike b1 = new Bike();
    }
}
