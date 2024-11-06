package ocp.ViolatingOCP.Implementation;
import ocp.ViolatingOCP.Interface.PaymentProcessor;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
    public void validateCreditCard() {
        System.out.println("Validating credit card...");
    }
}