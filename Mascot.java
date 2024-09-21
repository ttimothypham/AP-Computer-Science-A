// Name: Timothy Pham
// Period: 2nd

public class Mascot {
	
	private String name;
	private String type;
	private final int year;
	
	public Mascot(String n,String t,int y)
	{
		name = n;
		type = t;
		year = y;
	}
	
	public String toString()
	{
		return name + " the " + type + " was born in " + year;
	}
	
	public Mascot()
	{
		name = "Bobby";
		type = "Bobster";
		year = 2023;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String setName(String n)
	{
		String temp = name;
		name = n;
		return temp;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String setType(String t)
	{
		String temp = type;
		type = t;
		return temp;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String chant()
	{
		return "Go " + type + "s";
	}
	
	public int getAge()
	{
		return 2023 - year;
	}
	
	public boolean olderThanMe()
	{
		boolean olderThanMe = false;
		if ((2023 - year) > 15)
		{
			olderThanMe = true;
		}
		return olderThanMe;
	}
	

	

}

