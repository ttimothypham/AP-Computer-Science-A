// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class backwards {
	
	public static void main (String args[]) {
		
		Scanner wordInput = new Scanner(System.in);
		System.out.print("Enter any word : ");
		String word = wordInput.next();
		int i = word.length() - 1;
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(word.length() - 1));
		
		while (i >= 0)
		{
			System.out.print(word.charAt(i));
			i = i - 1;
		}

		
		
	}
}

