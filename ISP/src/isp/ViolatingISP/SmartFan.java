package ViolatingISP;

public class SmartFan implements SmartHomeDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart fan turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart fan turned off.");
    }

    @Override
    public void controlLight(int brightness) {
        throw new UnsupportedOperationException("SmartFan does not support controlling lights.");
    }

    @Override
    public void controlFan(int speed) {
        System.out.println("Setting fan speed to " + speed + ".");
    }

    @Override
    public void activateSecurity(boolean isActive) {
        throw new UnsupportedOperationException("SmartFan does not support security activation.");
    }
}