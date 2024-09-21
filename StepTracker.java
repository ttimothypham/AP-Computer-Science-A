// Name: Timothy Pham
// Period: 2nd

public class StepTracker
{
	private int active = 0;
	private int numOfSteps = 0;
	private int minNumSteps;
	private int day = 0;
	
	public StepTracker(int m)
	{
		minNumSteps = m;
	}
	
	public void addDailySteps(int s)
	{
		day++;
		numOfSteps = numOfSteps + s;
		if (s >= minNumSteps)
		{
			active++;
		}
	}
	
	public int activeDays()
	{
		return active;
	}
	
	public double averageSteps()
	{
		if (day == 0)
		{
			return 0.0;
		}
		else
		{
			return numOfSteps / day;
		}
	}
	
	
}

