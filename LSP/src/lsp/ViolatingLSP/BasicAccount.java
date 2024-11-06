package lsp.ViolatingLSP;

public class BasicAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}