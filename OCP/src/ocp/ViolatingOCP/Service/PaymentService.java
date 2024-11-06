package ocp.ViolatingOCP.Service;

import ocp.ViolatingOCP.Implementation.CreditCardProcessor;
import ocp.ViolatingOCP.Implementation.CryptoProcessor;
import ocp.ViolatingOCP.Implementation.PayPalProcessor;


public class PaymentService {
    public void executePayment(String paymentType, double amount) {
        if (paymentType.equalsIgnoreCase("credit")) {
            CreditCardProcessor creditCardProcessor = new CreditCardProcessor();
            creditCardProcessor.processPayment(amount);
            creditCardProcessor.validateCreditCard();
        } else if (paymentType.equalsIgnoreCase("paypal")) {
            PayPalProcessor payPalProcessor = new PayPalProcessor();
            payPalProcessor.processPayment(amount);
            payPalProcessor.checkPayPalBalance();
        } else if (paymentType.equalsIgnoreCase("crypto")) {
            CryptoProcessor cryptoProcessor = new CryptoProcessor();
            cryptoProcessor.processPayment(amount);
            cryptoProcessor.confirmCryptoTransaction();
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
    }
}