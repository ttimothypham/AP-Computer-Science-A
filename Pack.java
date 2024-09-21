//Name : Timothy Pham
//Period : 2nd

public class Pack implements Product
{
    private int quantity;
    private Product product;

    public Pack(int q, Product p)
    {
        quantity = q;
        product = p;
    }

    public double getPrice()
    {
        return product.getPrice() * quantity;
    }
}

