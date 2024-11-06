package lsp;
import lsp.FollowingLSP.Interface.DepositAccount;
import lsp.ViolatingLSP.BasicAccount;
import lsp.ViolatingLSP.LoanAccount;
import lsp.ViolatingLSP.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExample of LSP following..");
        lsp.FollowingLSP.Implementation.BasicAccount account = new lsp.FollowingLSP.Implementation.BasicAccount ();
        LoanAccount loan = new LoanAccount();
        account.deposit(100);
        loan.makePayment(50); // This is specific to loan behavior
        System.out.println("Loan Balance: " + loan.getBalance());

        System.out.println("\nExample of LSP Violation..");
        BasicAccount account1 = new LoanAccount();
         // LSP Violation
        account1.deposit(100); // Will throw an exception
        account1.withdraw(50); // Will throw an exception



    }
}
