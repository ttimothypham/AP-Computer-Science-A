import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
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

//ArrayListHelper Part #2
public static void removeEmAll(ArrayList<String> words3, String targetStr)
{
	for (int i = 0; i < words3.size(); i++)
	{
		if (words3.get(i) == targetStr)
		{
			words3.remove(i);
			i--;
		}
	}
	System.out.println(words3);
}

public static int findLargest(ArrayList<Integer> nums)
{
	Collections.sort(nums);
	int largest = nums.get(nums.size() - 1);
	return largest;
}

public static int findSmallest(ArrayList<Integer> nums)
{
	Collections.sort(nums);
	int smallest = nums.get(0);
	return smallest;
}

public static String getRandomString(ArrayList<String> random)
{
	int randomNum = (int)(Math.random() * (random.size()));
	return random.get(randomNum);
}

public static ArrayList<Integer> first5Evens(ArrayList<Integer> list)
{
	ArrayList<Integer> first5Evens = new ArrayList<Integer>();
	for (int i = 0; i < list.size(); i++)
	{
		if (list.get(i) % 2 == 0)
		{
			first5Evens.add(i);
		}
	}
	return first5Evens;
}
}
