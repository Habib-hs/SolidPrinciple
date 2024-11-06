package ocp.ViolatingOCP.Implementation;

import ocp.ViolatingOCP.Interface.PaymentProcessor;

public class CryptoProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
    public void confirmCryptoTransaction() {
        System.out.println("Confirming cryptocurrency transaction...");
    }

}