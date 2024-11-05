package ViolatingISP;

public interface SmartHomeDevice {
    void turnOn();
    void turnOff();
    void controlLight(int brightness);
    void controlFan(int speed);
    void activateSecurity(boolean isActive);
}