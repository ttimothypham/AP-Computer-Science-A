// Name: Timothy Pham
// Period: 2nd

public class Book2
{
  /** The title of the book */
  private String title;

  /** The price of the book */
  private double price;

  /** Creates a new Book with given title and price */
  public Book2(String bookTitle, double bookPrice)
  {
    title = bookTitle;
    price = bookPrice;
  }

  /** Returns the title of the book */
  public String getTitle()
  { return title; }

  public double getPrice()
  { return price; }
  
  /** Returns a string containing the title and price of the Book */
  public String getBookInfo()
  {
    return title + "-" + price;
  }
}

