import java.util.ArrayList;
public class ArrayListHelper{

//ArrayListHelper Part #1
public static ArrayList<Integer> arrayToList(int[] numbers)
{
	ArrayList<Integer> arrayToList = new ArrayList<Integer>();
	for (int i = 0; i < numbers.length; i++)
	{
		arrayToList.add(numbers[i]);
	}
	return arrayToList;
}

public static ArrayList<Double> arrayToListDouble(double[] numbers2)
{
	ArrayList<Double> arrayToListDouble = new ArrayList<Double>();
	for (int i = 0; i < numbers2.length; i++)
	{
		arrayToListDouble.add(numbers2[i]);
	}
	return arrayToListDouble;
}
 
public static ArrayList<String> arrayToListString(String[] words)
{
	ArrayList<String> arrayToListString = new ArrayList<String>();
	for (int i = 0; i < words.length; i++)
	{
		arrayToListString.add(words[i]);
	}
	return arrayToListString;
}

public static int count(ArrayList<Integer> numbs, int target)
{
	int count = 0;
	for (int i = 0; i < numbs.size(); i++)
	{
		if (numbs.get(i) == target)
		{
			count = count + 1;
		}
	}
	return count;
} 

public static int countWords(ArrayList<String> words2, String targetStr)  
{
	int count = 0;
	for (int i = 0; i < words2.size(); i++)
	{
		if (words2.get(i) == targetStr)
		{
			count = count + 1;
		}
	}
	return count;
}
}
