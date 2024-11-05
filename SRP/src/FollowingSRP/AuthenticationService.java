package FollowingSRP;

public class AuthenticationService {
    private EmailService emailService;

    public AuthenticationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public boolean login(User user, String username, String password) {
        boolean isLoggedIn = user.getUsername().equals(username) && user.getPassword().equals(password);
        if (isLoggedIn) {
            emailService.sendWelcomeEmail(user);
        }
        return isLoggedIn;
    }
}