package ocp.FollowingOCP.Interface;

public interface PaymentProcessorFactory {
    PaymentProcessor createProcessor(String type);
}
