//Timothy Pham
//2nd

public class HiddenWord {
	
	private String word = "";
	private String guess = "";
	
	public HiddenWord(String w)
	{
		word = w;
	}
	
	public String getHint(String g)
	{
		guess = g;
		String returnStr = "";
		for (int i = 0; i < word.length(); i++)
		{
			if (guess.charAt(i) == (word.charAt(i)))
			{
				returnStr = returnStr + guess.charAt(i);
			}
			else if (word.contains(guess.substring(i,i + 1)))
			{
				returnStr = returnStr + "+";
			}
			else
			{
				returnStr = returnStr + "*";
			}
		}
		return returnStr;
	}
	
		
}

