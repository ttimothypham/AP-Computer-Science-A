// Name: Timothy Pham
// Period: 2nd

public class Player{
	
	private String name;
	private int wins;
	
	public Player(String n)
	{
		name = n;
		wins = 0;
	}

	public String getName()
	{
		return name;
	}

	public int getWins()
	{
		return wins;
	}

	public void win()
	{
		wins = wins + 1;
	}

	public void reset()
	{
		wins = 0;
	}

	public String pick(String[] things)
	{
		return things[(int)(Math.random() * 3)];
	}
	
	public String toString()
	{
		return name + " has " + wins + "!";
	}
}

