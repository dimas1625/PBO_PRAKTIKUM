public class ElectricityBill implements Payable {
    private int kwh;
    private String category;

    // Constructor
    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    // Getter for kwh
    public int getKwh() {
        return kwh;
    }

    // Setter for kwh
    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Overriding getPaymentAmount method
    @Override
    public int getPaymentAmount() {
        return kwh * getBasePrice();
    }

    // Method to determine base price based on category
    public int getBasePrice() {
        int basePrice = 0;
        switch (category) {
            case "R-1":
                basePrice = 100;
                break;
            case "R-2":
                basePrice = 200;
                break;
            default:
                basePrice = 0; // Default base price
        }
        return basePrice;
    }

    // Method to get bill information
    public String getBillInfo() {
        return "kWH = " + kwh + "\n" +
               "Category = " + category + " (" + getBasePrice() + " per kWH)\n";
    }
}
