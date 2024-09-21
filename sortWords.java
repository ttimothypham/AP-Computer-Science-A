// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class sortWords {
	
	public static void main (String args[]) {
		Scanner wordOneInput = new Scanner(System.in);
		System.out.print("Type in any word : ");
		String wordOne = wordOneInput.nextLine();
		Scanner wordTwoInput = new Scanner(System.in);
		System.out.print("Type in another word : ");
		String wordTwo = wordTwoInput.nextLine();
		
		if (wordOne.compareTo(wordTwo) > 0)
		{
			System.out.println(wordTwo + " comes before " + wordOne);
		}
		if (wordOne.compareTo(wordTwo) < 0)
		{
			System.out.println(wordOne + " comes before " + wordTwo);
		}
		if (wordOne.compareTo(wordTwo) == 0)
		{
			System.out.println("You typed in the same words!");
		}
		
	}
}

