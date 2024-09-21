// Name: Timothy Pham
// Period: 2nd

public class Ford extends Vehicle {
	
	private String paintColor;
	
	public Ford (String model, int year, String color)
	{
		super("Ford",model,year);
		paintColor = color;
	}
	
	public String getColor()
	{
		return paintColor;
	}
	
	public void repaint(String color)
	{
		paintColor = color;
	}
	
	public String toString()
	{
		String make = super.getMake();
		String model = super.getModel();
		int year = super.getYear();
		return year + " " + make + " " + model + "(" + paintColor + ")";
	}
	
		
	
}

