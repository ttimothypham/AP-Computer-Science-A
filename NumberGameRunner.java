// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class NumberGameRunner {
	
	public static void main (String args[]) {
		int random = (int)(Math.random() * 900000 + 100000);
		NumberGame play = new NumberGame(random);
		
		for (int i = 19; i >= 0; i--)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter your guess: ");
			int guess = keyboard.nextInt();
			int checker = play.checkSecretNumber(guess);
			if (checker != 6)
			{
				System.out.println("You guessed " + checker + " digits right.");
				System.out.println("You have " + i + " guesses remaining.");
				System.out.println();
			}
			if (checker == 6)
			{
				System.out.println("Congratulations! Your guess is correct.");
				i = -1;
			}
			if (i == 0)
			{
				System.out.println("Game Over! The number random number was... " + random );
			}
		}
		
	}
}

