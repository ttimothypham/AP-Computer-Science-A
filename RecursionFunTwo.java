//Name - Timothy Pham
//Date - 3/1/2023
//Class - 2nd
//Lab  - Recursion Lab #2

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		int count;
		 if (word.length() < 7)
		 {		 
			return 0;  
	     }
	     else
	     {
			count = 0;
			int index = word.indexOf("chicken");
			if (index != -1)
			{
				count++;  
				String restOfWord = word.substring(index + 7);
				count = count + countChickens(restOfWord);  
			}
		 }		
        return count;
   }
}
	

