package srp;
import srp.FollowingSRP.AuthenticationService;
import srp.FollowingSRP.EmailService;
import srp.ViolatingSRP.User;

public class Main {
    public static void main(String[] args) {
        // Demonstrating Violating SRP
        System.out.println("Demonstrating Violating SRP");
        User user1 = new User("john_doe", "password123");
        boolean loggedIn1 = user1.login("john_doe", "password123");
        System.out.println("Logged in (Violating SRP): " + loggedIn1);

        // Demonstrating Following SRP
        System.out.println();
        System.out.println("Demonstrating Following SRP");
        srp.FollowingSRP.User user2 = new srp.FollowingSRP.User("jane_doe", "password456"); // Use fully qualified name here
        EmailService emailService = new EmailService();
        AuthenticationService authService = new AuthenticationService(emailService);
        boolean loggedIn2 = authService.login(user2, "jane_doe", "password456");
        System.out.println("Logged in (Following SRP): " + loggedIn2);
    }
}
