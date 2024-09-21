// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class subsection {
	
	public static void main (String args[]) {
		//Main code
		Scanner sentenceInput = new Scanner(System.in);
		System.out.print("Type in a sentence : ");
		String sentence = sentenceInput.nextLine();
		Scanner firstNumInput = new Scanner(System.in);
		System.out.print("Type in any number (has to be less than the number of characters in the sentence) : ");
		int firstNum = firstNumInput.nextInt();
		Scanner secondNumInput = new Scanner(System.in);
		System.out.print("Type in any number, but it has to apply to the same rules as above and be greater than the number above: ");
		int secondNum = secondNumInput.nextInt();
		System.out.println("");
		
		// Extra Challenge
		if (firstNum > secondNum)
		{
			System.out.println("Invalid input, the first number entered should be less than the second.");
		}
		if (secondNum > sentence.length())
		{
			System.out.println("Invalid input, the second number entered should be less than the total sentence length.");
		}
		
		System.out.println(sentence.substring(firstNum,secondNum));
		
		
	}
}

