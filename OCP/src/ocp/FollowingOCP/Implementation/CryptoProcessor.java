package ocp.FollowingOCP.Implementation;

import ocp.FollowingOCP.Interface.PaymentProcessor;

class CryptoProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}