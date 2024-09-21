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

public static ArrayList<Integer> first5Evens(ArrayList<Integer> list4)
{
	ArrayList<Integer> first5Evens = new ArrayList<Integer>();
	for (int i = 0; i < list4.size(); i++)
	{
		if (list4.get(i) % 2 == 0)
		{
			first5Evens.add(i);
		}
	}
	return first5Evens;
}

//ArrayListHelper Part #3
public static ArrayList<Integer> downOrder(ArrayList<Integer> list5)
{
	ArrayList<Integer> downOrder = new ArrayList<Integer>();
	downOrder.add(list5.get(0));
	for (int i = 1; i < list5.size(); i++)
	{
		if (list5.get(i) < list5.get(i - 1))
		{
			downOrder.add(list5.get(i));
		}
	}
	return downOrder;
}

public static ArrayList<Integer> mathFib(int[] digits)
{
	ArrayList<Integer> mathFib = new ArrayList<Integer>();
	for (int i = 0; i < digits.length - 1; i++)
	{
		mathFib.add(digits[i] + digits[i + 1]);
	}
	return mathFib;
}

public static int sum(int numeral)
{
	int digit;
	int sum = 0;
	while (numeral > 0)
	{
		digit = numeral % 10;
		sum = sum + digit;
		numeral = numeral / 10;
	}
	return(sum);
}

public static ArrayList<Integer> total110(ArrayList<Integer> sum10)
{
	ArrayList<Integer> total110 = new ArrayList<Integer>();
	for (int i = 0; i < sum10.size(); i++)
	{
		 
		if (sum(sum10.get(i)) == 10)
		{
			total110.add(sum10.get(i));
		}
	}
	return total110;
}

public static boolean isEven(int tally)
{
	boolean isEven = false;
	if (tally % 2 == 0)
	{
		isEven = true;
	}
	return isEven;
}

public static void changeCase(ArrayList<String> wordz)
{
	for (int i = 0; i < wordz.size(); i++)
	{
		if (wordz.get(i).length() % 2 == 0)
		{
			wordz.set(i,wordz.get(i).toUpperCase());
		}
		else
		{
			wordz.set(i,wordz.get(i).toLowerCase());
		}
	}

}
}
