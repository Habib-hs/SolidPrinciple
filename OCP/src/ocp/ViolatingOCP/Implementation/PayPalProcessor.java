package ocp.ViolatingOCP.Implementation;

import ocp.ViolatingOCP.Interface.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
    public void checkPayPalBalance() {
        System.out.println("Checking PayPal balance...");
    }
}