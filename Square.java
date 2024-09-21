// Name: Timothy Pham
// Period: 2nd

public class Square extends Rectangle {
	
	public Square(int side)
	{
		super(side,side);
	}
	
	public void setDimensions(int side)
	{
		super.setDimensions(side,side);
	}
	
	public int getArea()
	{
		int len = super.getLength();
		int wid = super.getWidth();
		return len * wid;
	}
	
	public int getPerimeter()
	{
		int len = super.getLength();
		return len * 4;
	}
	
	public String toString()
	{
		int sideLen = super.getLength();
		return "Side Length: " + sideLen;
	}
	
	


}

