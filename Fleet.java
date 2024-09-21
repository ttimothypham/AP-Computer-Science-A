// Name: Timothy Pham
// Period: 2nd

import java.util.ArrayList;
public class Fleet
{
	private ArrayList<Truck> list;
	
	public Fleet(int num)
	{
		list = new ArrayList<Truck>();
		for (int i = 0; i < num; i++)
		{
			Truck truck = new Truck((int)(Math.random() * 100000 + 1),(int)(Math.random() * 65 + 1),(int)(Math.random() * 65 + 1));
			list.add(truck);
		}	
	}
	
	public int numSpeeders()
	{
		int numOfSpeeders = 0;
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).isSpeeding())
			{
				numOfSpeeders = numOfSpeeders + 1;
			}
		}
		return numOfSpeeders;
	}
	
	public String toString()
	{
		for (int i = 1; i < 11; i++)
		{
			double truckCost = list.get(i).getCost();
			int truckMPH = list.get(i).getMph();
			int truckSL = list.get(i).getSpeedLimit();
			System.out.println("Truck #" + i + " costs " + truckCost + " and is going at a speed of " + truckMPH + " on a road with a speed limit of " + truckSL);
		}
		return "";
	}
}
	
	

	
	

	


