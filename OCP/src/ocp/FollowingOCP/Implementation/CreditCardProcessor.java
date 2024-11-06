package ocp.FollowingOCP.Implementation;
import ocp.FollowingOCP.Interface.PaymentProcessor;

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}