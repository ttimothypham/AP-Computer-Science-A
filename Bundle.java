//Name : Timothy Pham
//Period : 2nd

import java.util.ArrayList;
public class Bundle implements Product
{
    private ArrayList<Product> products;

    public Bundle()
    {
        products = new ArrayList<Product>();
    }

    public void add(Product p)
    {
        products.add(p);
    }

    public double getPrice()
    {
        double total = 0.0;
        for (int i = 0; i < products.size(); i++)
        {
            total = total + products.get(i).getPrice();
        }
        return total;
    }
}

