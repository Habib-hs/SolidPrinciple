package lsp.ViolatingLSP;

public class LoanAccount extends BasicAccount {
    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Cannot deposit to a loan account.");
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Cannot withdraw from a loan account.");
    }

    // Custom method for loan payments
    public void makePayment(double amount) {
        balance -= amount;
        System.out.println("Payment made: " + amount);
    }
}