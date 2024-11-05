package FollowingISP;


public class SmartFan implements Switchable, FanControl {
    @Override
    public void turnOn() {
        System.out.println("Smart fan turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart fan turned off.");
    }

    @Override
    public void controlFan(int speed) {
        System.out.println("Setting fan speed to " + speed + ".");
    }
}