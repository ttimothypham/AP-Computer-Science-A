// Name: Timothy Pham
// Period: 2nd

public class NumberGame extends Game {
	
	private int secretNumber;
	
	public NumberGame(int num)
	{
		secretNumber = num;
		int digit;
		int[] array = new int[6];
		for (int i = 5; i >= 0; i--)
		{
			digit = num % 10;
			array[i] = digit;
			num = num / 10;
		}
		super.setBoard(array);
	}
	
	public int getSecretNumber()
	{
		return secretNumber;
	}
	
	public int checkSecretNumber(int num)
	{
		int correctPlace = 0;
		int digit;
		int temp = num;
		
		for (int i = 5; i >= 0; i--)
		{
			digit = temp % 10;
			if (super.getBoardPos(i) == digit)
			{
				correctPlace = correctPlace + 1;
				temp = temp / 10;
			}
			else
			{
				temp = temp / 10;
			}
		}
		return correctPlace;
	}
	
	

}

