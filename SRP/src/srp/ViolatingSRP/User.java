package srp.ViolatingSRP;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Violates SRP: Handles authentication and email sending
    public boolean login(String username, String password) {
        boolean isLoggedIn = this.username.equals(username) && this.password.equals(password);
        if (isLoggedIn) {
            sendWelcomeEmail();
        }
        return isLoggedIn;
    }

    private void sendWelcomeEmail() {
        System.out.println("Welcome email sent to " + this.username);
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password changed for " + this.username);
    }
}