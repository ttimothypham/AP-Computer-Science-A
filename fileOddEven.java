// Name: Timothy Pham
// Period: 2nd

import java.io.*;
import java.util.Scanner;

public class fileOddEven {
	
	public static void main (String args[]) throws IOException {
		
		Scanner file = new Scanner(new File("oddoreven.txt"));
		int size = file.nextInt();
		int sum = 0;
		int oddCount = 0;
		int evenCount = 0;
	
		for (int i = 0; i < size; i++)
		{
			int number = file.nextInt();
			
			if (number % 2 == 1)
			{
				oddCount = oddCount + 1;
			}
			
			if (number % 2 == 0)
			{
				evenCount = evenCount + 1;
			}
			
			sum = sum + number;
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Odd Numbers: " + oddCount);
		System.out.println("Even Numbers: " + evenCount);

}
}

