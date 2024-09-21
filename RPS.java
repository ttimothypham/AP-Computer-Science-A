// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class RPS {
	
	Player player1;
	Player player2;
	public static final String[] Choices = new String[]{"ROCK","PAPER","SCISSORS"}; 
	private int p1Wins = 0;
	private int p2Wins = 0;
	private String winner = "";

	public RPS()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name for Player 1 :: ");
		String name1 = scan.next();
		player1 = new Player(name1);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter a name for Player 2 :: ");
		String name2 = scan2.next();
		player2 = new Player(name2);
	}
	
	public String play(int numOfWins)
	{
		do
		{
			String PL1pick = player1.pick(Choices);
			String PL2pick = player2.pick(Choices);
			System.out.println("");
			System.out.println(player1.getName() + " picks " + PL1pick);
			System.out.println(player2.getName() + " picks " + PL2pick);
			
			if(PL1pick.equals("ROCK") && PL2pick.equals("SCISSORS"))
			{
				p1Wins = p1Wins + 1;
			}
			if(PL1pick.equals("PAPER") && PL2pick.equals("ROCK"))
			{
				p1Wins = p1Wins + 1;
			}	
			if(PL1pick.equals("SCISSORS") && PL2pick.equals("PAPER"))
			{
				p1Wins = p1Wins + 1;
			}
			if(PL2pick.equals("ROCK") && PL1pick.equals("SCISSORS"))
			{
				p2Wins = p2Wins + 1;
			}
			if(PL2pick.equals("PAPER") && PL1pick.equals("ROCK"))
			{
				p2Wins = p2Wins + 1;
			}	
			if(PL2pick.equals("SCISSORS") && PL1pick.equals("PAPER"))
			{
				p2Wins = p2Wins + 1;
			}
			if (p1Wins == 3)
			{
				winner = player1.getName() + " is the winner! :D";
			}
			if (p2Wins == 3)
			{
				winner = player2.getName() + " is the winner! :D";
			}
			
			System.out.println(p1Wins + " - " + p2Wins);	
			System.out.println("");		
		}
		while ((p1Wins != numOfWins) && (p2Wins != numOfWins));
		return winner;
	}
	
	

		
}

