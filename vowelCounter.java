// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class vowelCounter {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = keyboard.nextLine();
		int count = 0;
		
		for (int i = sentence.length()-1; i >= 0; i--)
		{
			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u')
			{
				count = count +1;
			}
		}
		System.out.println(count);
		
	}
}

