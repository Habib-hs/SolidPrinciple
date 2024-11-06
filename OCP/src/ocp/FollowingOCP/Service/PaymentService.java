package ocp.FollowingOCP.Service;

import ocp.FollowingOCP.Interface.PaymentProcessor;
import ocp.FollowingOCP.Interface.PaymentProcessorFactory;

public class PaymentService {
    private final PaymentProcessorFactory factory;

    public PaymentService(PaymentProcessorFactory factory) {
        this.factory = factory;
    }

    public void executePayment(String paymentType, double amount) {
        PaymentProcessor processor = factory.createProcessor(paymentType);
        processor.processPayment(amount);
    }
}