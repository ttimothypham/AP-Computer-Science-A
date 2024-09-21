// Name: Timothy Pham
// Period: 2nd

public class RPSrunner {
	
	public static void main (String args[]) {
		
		Player Timothy = new Player("Timothy");
		System.out.println(Timothy.getWins());
		Timothy.win();
		System.out.println(Timothy.getWins());
		Timothy.reset();
		System.out.println(Timothy.getWins());
		
		System.out.println("");
		RPS game = new RPS();
		System.out.println(game.play(3));
		
		
		
	}
}

