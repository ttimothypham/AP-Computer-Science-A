// Name: Timothy Pham
// Period: 2nd

public class Bus {
	
	private int currentStop;
	private int numOfStops;
	private int i = 1;
	
	public Bus(int s)
	{
		numOfStops = s;
		currentStop = 1; 
	}
	
	public int getCurrentStop()
	{
		return currentStop;
	}
	
	public int move()
	{
		currentStop = currentStop + i;
		if (currentStop == numOfStops)
		{
			i = -1;
			return currentStop;
		}
		if (currentStop == 1)
		{
			i = 1;
			return currentStop;
		}
		return currentStop;
	}
	
	public int getNumOfStops()
	{
		return numOfStops;
	}
	

}

