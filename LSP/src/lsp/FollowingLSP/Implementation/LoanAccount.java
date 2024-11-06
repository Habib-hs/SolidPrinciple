package lsp.FollowingLSP.Implementation;

import lsp.FollowingLSP.Interface.Account;

public class LoanAccount implements Account {
    protected double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    public void makePayment(double amount) {
        balance -= amount;
        System.out.println("Payment made: " + amount);
    }
}