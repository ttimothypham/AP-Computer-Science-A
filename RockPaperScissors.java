// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class RockPaperScissors {
	
	public static void main (String args[]) {
		
		int i = 1;
		
		Scanner roundInput = new Scanner(System.in);
		System.out.println("How many rounds do you want to play?");
		int rounds = roundInput.nextInt();
		
		do
		{
			int generator = (int)((Math.random() * 3 + 1));
			Scanner userInput = new Scanner(System.in);
			System.out.println("\nEnter the number corresponding to your choice...");
			System.out.println("Rock(1), Paper(2), Scissors(3)");
			int choice = userInput.nextInt();
			System.out.println();
			
			if (generator == choice)
			{
				System.out.println("TIE GAME");
				i++;
			}
			if ((generator == 1) && (choice == 2))
			{
				System.out.println("Computer chose rock, you win!");
				i++;
			}
			if ((generator == 1) && (choice == 3))
			{
				System.out.println("Computer chose rock, you lost.");
				i++;
			}
			if ((generator == 2) && (choice == 1))
			{
				System.out.println("Computer chose paper, you lost.");
				i++;
			}
			if ((generator == 2) && (choice == 3))
			{
				System.out.println("Computer chose paper, you win!");
				i++;
			}
			if ((generator == 3) && (choice == 1))
			{
				System.out.println("Computer chose scissors, you win!");
				i++;
			}
			if ((generator == 3) && (choice == 2))
			{
				System.out.println("Computer chose scissors, you lost.");
				i++;
			}
	
	}
	while (i <= rounds);

	
	}
}

