public class Admin extends User {

    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void setupFeeStructure() {
        System.out.println("Admin is setting up the fee structure.");
    }

    public void viewReports() {
        System.out.println("Admin is viewing reports.");
    }

    public void sendReminders() {
        System.out.println("Admin is sending reminders.");
    }

    public void manageUsers() {
        System.out.println("Admin is managing users.");
    }
}

