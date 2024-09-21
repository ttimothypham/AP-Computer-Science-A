// Name: Timothy Pham
// Period: 2nd
// This is the counter lab again, but with a static method

import java.util.Scanner;
public class staticCounter {
	
	public static void main (String args[]) {
		
		System.out.println(countNum(321456));
		
	}
	
		public static int countNum(int num)
	{
		int count = 0;
		while (num > 0)
		{
			count = count + 1;
			num = num / 10;
		}
		
		return count;
	}
}

