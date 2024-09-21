// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class september23 {
	
	public static String multiString(String word,int number)
	{
		String holder = "";
		
		for (int i = number; i > 0; i--)
		{
			holder = holder + word;

		}
		return holder;
	}
	
	public static void main (String args[]) {
		
		System.out.println(multiString("bruh ",5000));
		
		
	}
}

