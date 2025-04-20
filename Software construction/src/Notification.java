public class Notification {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    public void sendSMS(String phone, String message) {
        System.out.println("Sending SMS to " + phone + ": " + message);
    }
}

