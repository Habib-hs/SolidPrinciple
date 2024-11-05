package FollowingISP;

public class SmartSecuritySystem implements Switchable, SecurityControl {
    @Override
    public void turnOn() {
        System.out.println("Security system activated.");
    }

    @Override
    public void turnOff() {
        System.out.println("Security system deactivated.");
    }

    @Override
    public void activateSecurity(boolean isActive) {
        System.out.println("Security is now " + (isActive ? "active." : "inactive."));
    }
}