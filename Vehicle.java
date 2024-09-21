// Name: Timothy Pham
// Period: 2nd

public class Vehicle {
	
	private String make;
	private String model;
	private int year;
	
	public Vehicle(String ma, String mo, int yr)
	{
		make = ma;
		model = mo;
		year = yr;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String toString()
	{
		return year + " " + make + " " + model;
	}
		
	}


