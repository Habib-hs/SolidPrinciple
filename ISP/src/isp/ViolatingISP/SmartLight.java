package isp.ViolatingISP;

public class SmartLight implements SmartHomeDevice {
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

    @Override
    public void controlFan(int speed) {
        throw new UnsupportedOperationException("SmartLight does not support controlling a fan.");
    }

    @Override
    public void activateSecurity(boolean isActive) {
        throw new UnsupportedOperationException("SmartLight does not support security activation.");
    }
}