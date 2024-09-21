// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class higherOrLower {
	
	static int num;
	
	public static void main (String args[]) {
		
		int randomNum = (int)((Math.random() * 100 + 100));
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.println("Guess a number (100-199)");
			num = keyboard.nextInt();
			
			if (num == randomNum)
			{
				System.out.println("Yay! You guessed correctly :)");
			}
			if (num < randomNum)
			{
				System.out.println("Higher");
			}
			if (num > randomNum)
			{
				System.out.println("Lower");
			}
		    }while (num != randomNum);
			
			
		 

		
		
		
		
	}
}

