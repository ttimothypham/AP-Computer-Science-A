// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class counter {
	
	public static void main (String args[]) {
		
		Scanner numInput = new Scanner(System.in);
		System.out.println("Enter a whole number");
		int num = numInput.nextInt();
		int count = 0;
		
		while (num > 0)
		{
			count = count + 1;
			num = num / 10;
		}
		
		System.out.println(count);
		
		
		
	}
}

