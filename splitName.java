// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class splitName {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your full name.");
		String fullName = keyboard.nextLine();
		
		int space = fullName.indexOf(" ");
		char firstInitial = fullName.charAt(0);
		System.out.println(fullName.substring(space,fullName.length()) + "," + firstInitial + ".");
		
	}
}

