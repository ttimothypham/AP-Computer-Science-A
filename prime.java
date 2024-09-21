// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class prime {
	
	public static void main (String args[]) {
		
		//User number input
		Scanner numInput = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = numInput.nextInt();
		int primeChecker = 0 ;
		
		
		for (int i = 1 ; i <= num ; i++)
		{
			if (num % i == 0)
			{
				primeChecker = primeChecker + 1;
			}
			/*else if (num % i == 1)
			{
				primeChecker = primeChecker + 1;
				System.out.print(primeChecker);
			}*/
		}
		
		if (primeChecker == 2)
		{
			System.out.println(num + " is a prime number");
		}
		else if (primeChecker > 2)
		{
			System.out.println(num + " is not a prime number");
		}
		
	
			

}
}


