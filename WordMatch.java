/**
 * @(#)WordMatch.java
 *
 *
 * @author 
 * @version 1.00 2022/2/7
 */

public class WordMatch {
        
    private String Secret;
    	
    public WordMatch(String word) {
    	Secret = word;
    }
    
    public int scoreGuess(String guess)
    {
		int score = 0;
		int occur = 0;
    	if (Secret.contains(guess))
    	{
			for (int i = 0; i <= Secret.length() - guess.length(); i++)
			{
				if (Secret.substring(i,i + guess.length()).contains(guess))
				{
					occur++;
				}
			}
		}
		return occur * guess.length() * guess.length();
    }
    
    /* Returns the better of two guesses, as determined by 
     * scoreGuess and the rules for a tie-breaker that are
     * described in par (b) 
     */
    public String findBetterGuess(String guess1, String guess2)
    {
		if (scoreGuess(guess1) > scoreGuess(guess2))
		{
			return guess1;
		}
		else
		{
			return guess2;
		}
    }
}
