import java.util.Date;

public class Payment {
    private String paymentId;
    private double amount;
    private String paymentMethod;
    private Date date;

    public Payment(String paymentId, double amount, String paymentMethod, Date date) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.date = date;
    }

    public String generateReceipt() {
        return "Receipt: Payment ID " + paymentId + ", Amount: " + amount;
    }

    public boolean validatePaymentDetails() {
        return amount > 0 && paymentMethod != null;
    }
}
