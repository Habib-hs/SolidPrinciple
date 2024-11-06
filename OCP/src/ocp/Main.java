package ocp;

import ocp.FollowingOCP.Interface.PaymentProcessorFactory;
import ocp.FollowingOCP.Implementation.DefaultPaymentProcessorFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExample of OCP Violation..");
        // Using the fully qualified name for ViolatingOCP.Service.PaymentService
        ocp.ViolatingOCP.Service.PaymentService violatingPaymentService = new ocp.ViolatingOCP.Service.PaymentService();
        violatingPaymentService.executePayment("credit", 100.0);
        violatingPaymentService.executePayment("paypal", 50.0);
        violatingPaymentService.executePayment("crypto", 75.0);

        System.out.println("\nExample of OCP following..");
        PaymentProcessorFactory factory = new DefaultPaymentProcessorFactory();
        // Using the fully qualified name for FollowingOCP.Service.PaymentService
        ocp.FollowingOCP.Service.PaymentService followingPaymentService = new ocp.FollowingOCP.Service.PaymentService(factory);
        followingPaymentService.executePayment("credit", 100.0);
        followingPaymentService.executePayment("paypal", 50.0);
        followingPaymentService.executePayment("crypto", 75.0);
    }
}
