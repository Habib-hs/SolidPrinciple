package lsp.FollowingLSP.Implementation;

import lsp.FollowingLSP.Interface.DepositAccount;
import lsp.FollowingLSP.Interface.WithdrawAccount;

public class BasicAccount implements DepositAccount, WithdrawAccount {
    protected double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
