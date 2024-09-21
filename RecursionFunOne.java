//Name - Timothy Pham
//Date - 2/28/2023
//Class - 2nd
//Lab  - Recursion Lab #1

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int digit;
		if (num == 0)
		{
			return 0;
		}
		digit = num % 10;
		if (digit % 2 == 1)
		{
			return 1 + countOddDigits(num / 10);
		}
		else
		{
			return countOddDigits(num / 10);
		}
	}
}
