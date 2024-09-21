//Name : Timothy Pham
//Period : 2nd

public class Item implements Product
{
    private String itemDescription;
    private double unitPrice;

    public Item(String description, double price) {
        itemDescription = description;
        unitPrice = price;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setPrice(double price) {
        unitPrice = price;
    }

    public String getDescription() {
        return itemDescription;
    }
}


