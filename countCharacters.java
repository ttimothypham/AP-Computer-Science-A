// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class countCharacters {
	
	public static void main (String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in a sentence...");
		String sentence = keyboard.nextLine();
		
		int upperNum = 0;
		int lowerNum = 0;
		int numChar = 0;
		int specialChar = 0;
		
		//Upper case counter
		for (int i = 0; i < sentence.length(); i++)
		{
			if ((sentence.charAt(i) >= 65) && (sentence.charAt(i) <= 90))
			{
				upperNum = upperNum + 1;
			}
		}
		
		//Lower case counter
		for (int i = 0; i < sentence.length(); i++)
		{
			if ((sentence.charAt(i) >= 97) && (sentence.charAt(i) <= 122))
			{
				lowerNum = lowerNum + 1;
			}
		}
		
		//Numerical character counter
		for (int i = 0; i < sentence.length(); i++)
		{
			if ((sentence.charAt(i) >= 48) && (sentence.charAt(i) <= 57))
			{
				numChar = numChar + 1;
			}
		}
		
		
		//Special character counter
		for (int i = 0; i < sentence.length(); i++)
		{
			if ((sentence.charAt(i) >= 33 && sentence.charAt(i) <= 47) || (sentence.charAt(i) >= 58 && sentence.charAt(i) <= 64) || (sentence.charAt(i) >= 91 && sentence.charAt(i) <= 96) || (sentence.charAt(i) >= 123 && sentence.charAt(i) <= 126))
			{
				specialChar = specialChar + 1;
			}
		}
		
		System.out.println("\nThere are " + upperNum + " upper case letters in your sentence.");
		System.out.println("There are " + lowerNum + " lower case letters in your sentence.");
		System.out.println("There are " + numChar + " numerical characters in your sentence.");
		System.out.println("There are " + specialChar + " special characters in your sentence.");
		
		
		

		
	}
}

