//Name - Timothy Pham
//Date - 3/2
//Class - 2nd
//Lab  - Recursion Lab #3

public class RecursionFunThree
{
	public static boolean isPalindrome(String word)
	{
		int len = word.length();
		String cap = word.toUpperCase();
		
		if (len == 1)
		{
			return true;
		}
		else if (cap.charAt(0) == 32)
		{
			return isPalindrome(cap.substring(2,len - 1));
		}
		else if (cap.charAt(len - 1) == 32)
		{
			return isPalindrome(cap.substring(1,len - 2));
		}
		else if (cap.charAt(0) != cap.charAt(len - 1))
		{
			return false;
		}
		else if ((cap.charAt(0) == 32) && (cap.charAt(len - 1) == 32))
		{
			return isPalindrome(cap.substring(1,len - 1));
		}
		else
		{
			return isPalindrome(cap.substring(1,len - 1));
		}
	}
}
