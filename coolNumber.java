// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class coolNumber {
	
	//User number input
	public static void main (String args[]) {
		Scanner numInput = new Scanner(System.in);
		System.out.println("Enter any number that is bigger than 10 but less than 100000");
		int num  = numInput.nextInt();
		int coolNum = 0;
		
		//for loop used
		for (int i = num; i >= 6; i--)
		{
			if ((i % 3 == 1) && (i % 4 == 1) && (i % 5 == 1) && (i % 6 == 1))
			{
				coolNum = coolNum + 1;
			}
		}
		//prints out total amount of cool numbers
		System.out.println();
		System.out.println(coolNum + " cool numbers between 6 - " + num);
	}
}

