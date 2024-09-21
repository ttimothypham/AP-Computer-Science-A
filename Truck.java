// Name: Timothy Pham
// Period: 2nd

public class Truck {
	
	private double cost;
	private int mph;
	private int speedLimit;
	
	public Truck(double c, int m, int s)
	{
		cost = c;
		mph = m;
		speedLimit = s;
	}
	
	/*public Truck()
	{
		cost = (int)(Math.random() * 100000 + 1);
		mph = (int)(Math.random() * 65 + 1);
		speedLimit = (int)(Math.random() * 65 + 1);
	}
	* */
	
	public void increaseSpeed(int speed)
	{
		mph = mph + speed;
	}
	
	public void decreaseSpeed(int speed)
	{
		mph = mph - speed;
	}
	
	public void setSpeedLimit(int speed)
	{
		speedLimit = speed;
	}
	
	public boolean isSpeeding()
	{
		if (mph > speedLimit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public int getMph()
	{
		return mph;
	}
	
	public int getSpeedLimit()
	{
		return speedLimit;
	}
	


}

