package isp;
import isp.FollowingISP.SmartSecuritySystem;
import isp.ViolatingISP.SmartFan;
import isp.ViolatingISP.SmartLight;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Using devices violating ISP
        System.out.println();
        System.out.println("Using devices violating ISP");
        SmartLight smartLight = new SmartLight();
        smartLight.turnOn();
        smartLight.controlLight(75);
        
        SmartFan smartFan = new SmartFan();
        smartFan.turnOn();
        smartFan.controlFan(3);

        // Using devices following ISP
        System.out.println();
        System.out.println("Using devices following ISP");
        SmartSecuritySystem securitySystem = new SmartSecuritySystem();
        securitySystem.turnOn();
        securitySystem.activateSecurity(true);
    }
}