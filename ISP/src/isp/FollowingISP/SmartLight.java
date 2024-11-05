package FollowingISP;

public class SmartLight implements Switchable, LightControl {
    @Override
    public void turnOn() {
        System.out.println("Smart light turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart light turned off.");
    }

    @Override
    public void controlLight(int brightness) {
        System.out.println("Setting light brightness to " + brightness + "%.");
    }
}