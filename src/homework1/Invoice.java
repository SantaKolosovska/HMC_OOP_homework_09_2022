package homework1;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private int itemPrice;

    public Invoice() {
    }

    public Invoice(String partNumber, String partDescription, int quantity, int itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    // "Provide a set and a get method for each attribute. In addition, provide a method named getInvoiceAmount that
    // calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as
    // an int value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it
    // should be set to 0." - Not clear if this should be done in setters or in this method, so I chose to do it here.
    public int getInvoiceAmount() {
        if (this.quantity < 0) {
            this.quantity = 0;
        }
        if (this.itemPrice < 0) {
            this.itemPrice = 0;
        }

        return this.quantity * this.itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Invoice: " +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", itemPrice=" + itemPrice;
    }
}
