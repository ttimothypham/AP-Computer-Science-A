//Timothy Pham
//2nd

import java.util.Scanner;
public class HiddenWordRunner {
	
	public static void main (String[] args) {
		
		HiddenWord puzzle = new HiddenWord("BEARS");
		Scanner game = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++)
		{
			System.out.print("Type in your guess (ALL CAPS) : ");
			String userGuess = game.next();
			System.out.println(puzzle.getHint(userGuess));
			
			if (!(puzzle.getHint(userGuess).contains("*")) && (!(puzzle.getHint(userGuess).contains("+"))))
			{
				i = 6;
			}
		}
		
	
		
		
	}
}

