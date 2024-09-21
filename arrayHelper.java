//Name : Timothy Pham
//Period : 2nd

public class arrayHelper
{

public static boolean contains(int[] testArray, int target)
{
	boolean bool = false;
	
	for (int i = 0; i < testArray.length; i++)
	{
		if (testArray[i] == target)
		{
			bool = true;
		}
	}
	return bool;
}

public static int count(int[] testArray, int target)
{
	int counter = 0;
	
	for (int i = 0; i < testArray.length; i++)
	{
		if (testArray[i] == target)
		{
			counter = counter + 1;
		}
	}
	return counter;
}

public static int mostOccur(int[] numbs)
{
	int mostNumber = numbs[0];
	int countMost = count(numbs, mostNumber);
	for (int i = 1; i < numbs.length; i++)
	{
		int number = numbs[i];
		int numberCount = count(numbs, number);
		
		if (numberCount > countMost)
		{
			mostNumber = number;
			countMost = numberCount;
		}
	}
	return mostNumber;
}

public static int[] combine(int[] array1, int[] array2)
{
	int arrayLength = array1.length + array2.length;
	int[] mergedArray = new int[arrayLength];
	
	for (int i = 0; i < array1.length; i++)
	{
		mergedArray[i] = array1[i];
	}
	for (int i = 0; i < array2.length; i++)
	{
		mergedArray[(array1.length) + i] = array2[i];
	}
	return mergedArray;
}

public static int[] combineOdds(int[] array1, int[] array2)
{
	int x = 0;
	int z = 0;
	int[] oddArray = new int[4];
	int arrayLength = array1.length + array2.length;
	int[] mergedArray = new int[arrayLength];
	
	for (int i = 0; i < array1.length; i++)
	{
		mergedArray[i] = array1[i];
	}
	for (int i = 0; i < array2.length; i++)
	{
		mergedArray[(array1.length) + i] = array2[i];
	}
	while (x < arrayLength)
	{
		if (mergedArray[x] % 2 == 1)
		{
			oddArray[z] = mergedArray[x];
			x++;
			z++;
		}
		else
		{
			x++;
		}
	}
	return oddArray;
}


public static int findLargest(int[] numbers)
{
	int largest = numbers[0];
	
	for (int i = 0; i < numbers.length; i++)
	{
		if (numbers[i] > largest)
		{
			largest = numbers[i];
		}
	}
	return largest;
}

public static int findSmallest(int[] numbers)
{
	int smallest = numbers[0];
	
	for (int i = 0; i < numbers.length; i++)
	{
		if (numbers[i] < smallest);
		{
			smallest = numbers[i];
		}
	}
	return smallest;
}


  
  
  
}
