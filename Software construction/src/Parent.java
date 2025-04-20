public class Parent extends User {

    public Parent(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void submitFee(String paymentMethod) {
        System.out.println("Fee submitted using: " + paymentMethod);
    }

    public void viewDashboard() {
        System.out.println("Parent dashboard is displayed.");
    }

    public void receiveReceipt() {
        System.out.println("Receipt received via email.");
    }

    public void viewPaymentHistory() {
        System.out.println("Viewing payment history.");
    }
}
