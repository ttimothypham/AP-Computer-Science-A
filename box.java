// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class box {
	
	public static void main (String args[]) {
		
		//User word input
		Scanner wordInput = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = wordInput.next();
		System.out.println();
		int i = 0;
		
		//while loop
		while (i < word.length()){
			System.out.println(word);
			i++;
		}
		
	}
}

