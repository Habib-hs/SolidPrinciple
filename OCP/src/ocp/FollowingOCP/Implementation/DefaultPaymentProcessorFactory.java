package ocp.FollowingOCP.Implementation;
import ocp.FollowingOCP.Interface.PaymentProcessor;
import ocp.FollowingOCP.Interface.PaymentProcessorFactory;

public class DefaultPaymentProcessorFactory implements PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor(String type) {
        return switch (type.toLowerCase()) {
            case "credit" -> new CreditCardProcessor();
            case "paypal" -> new PayPalProcessor();
            case "crypto" -> new CryptoProcessor();
            default -> throw new IllegalArgumentException("Unknown payment type: " + type);
        };
    }
}
