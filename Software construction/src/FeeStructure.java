public class FeeStructure {
    private String id;
    private String structureType;
    private double amount;

    public FeeStructure(String id, String structureType, double amount) {
        this.id = id;
        this.structureType = structureType;
        this.amount = amount;
    }

    public void setupFee() {
        System.out.println("Setting up fee structure: " + structureType + ", Amount: " + amount);
    }

    public void updateFeeStructure(double newAmount) {
        this.amount = newAmount;
        System.out.println("Fee structure updated. New Amount: " + amount);
    }
}
