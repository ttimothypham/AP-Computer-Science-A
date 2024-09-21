// Name: Timothy Pham
// Period: 2nd

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle( int len, int wid)
	{
		length = len;
		width = wid;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setDimensions(int len, int wid)
	{
		length = len;
		width = wid;
	}
	
	public String toString()
	{
		return "Length: " + length + "\n" + "Width: " + width;
	}

}

