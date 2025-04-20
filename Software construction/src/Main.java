import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create Admin and Parent Users
        Admin admin = new Admin("A1", "Alice", "alice@school.com", "admin123");
        Parent parent = new Parent("P1", "Bob", "bob@home.com", "parent123");

        // Login Actions
        admin.login();
        parent.login();

        // Admin Actions
        admin.setupFeeStructure();
        admin.viewReports();
        admin.sendReminders();

        // Parent Actions
        parent.viewDashboard();
        parent.submitFee("Credit Card");

        // Payment Actions
        Payment payment = new Payment("P001", 5000.0, "Credit Card", new Date());
        if (payment.validatePaymentDetails()) {
            System.out.println(payment.generateReceipt());
        } else {
            System.out.println("Invalid payment details.");
        }

        // Notifications
        Notification notification = new Notification();
        notification.sendEmail(parent.email, "Your fee has been successfully submitted.");
        notification.sendSMS("1234567890", "Fee payment confirmed.");

        // Logout Actions
        admin.logout();
        parent.logout();
    }
}
