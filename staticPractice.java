// Name: Timothy Pham
// Period: 2nd
public class staticPractice
{
	public static void main (String[] args) 
	{
		//Instructions:
			//1) Finish writing the four methods below.
				//Test that your methods work by calling them inside of main()
				//The calls for the first method are already given.
			
			//2) Write the complete rotateLeft() method as described below
		
			//3) An extra challenge is given below if time permits.
		
		System.out.println("doubleNumber() calls");
		System.out.println(staticPractice.doubledNumber(10));//explicit call
		System.out.println(doubledNumber(75));				//implicit call
		System.out.println(doubledNumber(10245));
		System.out.println("\n\n");
		System.out.println(addOink("hello"));
		System.out.println(daEnd("Boomshakalaka"));
		System.out.println(firstHalf("hotdog"));
		System.out.println(rotateLeft("coding"));
		
	}
	
	//This method will return the double of the variable number
	public static int doubledNumber(int number)
	{
		return number * 2;
	}
	
	//This method will return a new version of the word with "oink"
	//added to the orginal word
	public static String addOink(String word)
	{
		return word + "oink";
	}
	
	//This method will return a new string made of 3 copies of the 
	//last 2 chars of the original string. 
	//Pre-condition: The string length will be at least 2.
	public static String daEnd(String word) 
	{
		char last = word.charAt(word.length()-1);
		char secondLast = word.charAt(word.length()-2);
		return word + secondLast + last + secondLast + last + secondLast + last;
	}
	
	//This method will return the first half. 
	//So the string "WooHoo" yields "Woo".
	//Pre-condition: The string length will be even
	public static String firstHalf(String word) 
	{
		String firstHalfOfWord = word.substring(0,word.length() / 2);
		return firstHalfOfWord;
	}
	
	
	//The rotateLeft() method will be given a string. Return a "rotated left 2" 
	//version where the first 2 chars are moved to the end. 
		//So the string "Computers" yields "mputersCo"
	//Pre-condition: The string length will be at least 2.
	
	//Write the method rotateLeft() method
	public static String rotateLeft(String word)
	{
		String firstTwo = word.substring(0,2);
		String restOfWord = word.substring(2,word.length());
		return restOfWord + firstTwo;
	}
	
	//EXTRA CHALLENGE
	//This method will return true if the given string contains a "bob"
	//but where the middle 'o' char can be any char. 
	//Note: Be careful to not get an out of bounds error
	public static boolean findBob(String word) 
	{
		return false;
	}
}

