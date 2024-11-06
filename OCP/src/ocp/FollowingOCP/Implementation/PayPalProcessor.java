package ocp.FollowingOCP.Implementation;

import ocp.FollowingOCP.Interface.PaymentProcessor;

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}