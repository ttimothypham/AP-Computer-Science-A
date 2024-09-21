// Name: Timothy Pham
// Period: 2nd
public class staticPractice2 
{
	//Given a string of even length, this method will return a new 
	//string made of the middle two chars of the original string. 
	//Pre-condition: The string length will be at least 2.
	//Examples:
		//midTwo("string") would return "ri"
		//midTwo("code") would return "od"
		//midTwo("Practice") would return "ct"
	public static String midTwo(String word) 
	{
		String middle = word.substring((word.length()-1)/2,word.length()/2 + 1);
		return middle;
	}

	//Given a string of even length, this method will return true
	//it ends with in "ly"
	
	//Examples:
		//endsWithLy("oddly") would return true
		//endsWithLy("y") would return false
		//endsWithLy("oddy") would return false
	public static boolean endsWithLy(String word) 
	{
		boolean bool;
		
		if (word.contains("ly"))
		{
			bool = true;
		}
		else
		{
			bool = false;
		}
		return bool;
	}

	
	//Given a string, this method returns a string length 2 made of its 
	//first 2 chars. If the string length is less than 2, 
	//use '@' for the missing chars.
	//Examples:
		//firstTwo("hello") would return "he"
		//firstTwo("hi") would return "hi"
		//firstTwo("h") would return "h@"
	public static String firstTwo(String word) 
	{
		String twoChars;
		
		if (word.length() < 2)
		{
			twoChars = word.substring(0,1) + "@";
		}
		else
		{
		    twoChars = word.substring(0,2);
		}
		return twoChars;
	}
	
	//This method will return true if the given string contains an 
	//appearance of "gar" where the gar is not directly preceeded 
	//by an exclamation mark (!). So "hi garcia" counts but "boo!gar" does not.
	public static boolean garThere(String str) 
	{
		boolean garBool = false;
		
		if ((str.contains("gar")) && (str.indexOf("!")) < (str.indexOf("gar")))
		{
			garBool = false;
		}
		if ((str.contains("gar")) && (str.indexOf("!")) > (str.indexOf("gar")))
		{
			garBool = true;
		}
		if ((str.contains("gar")) && (!(str.contains("!"))))
		{
			garBool = true;
		}
		if (!(str.contains("gar")))
		{
			garBool = false;
		}
		return garBool;
	}
	
	//EXTRA CHALLENGE
	//We'll say that a String is sg-balanced if for all the 's' chars in 
	//the string, there exists a 'g' char somewhere later in the string. 
		//Example: So "ssg" is balanced, but "sgs" is not. 
	//One 'g' can balance multiple 's's.
	//Return true if the given string is gs-balanced.
	
	//Examples:
		//sgBalance("aasbbg") returns true
		//sgBalance("aasbb") returns false
		//sgBalance("gaasbb") returns false
	public static boolean sgBalance(String str) 
	{
		return false;
	}
}
