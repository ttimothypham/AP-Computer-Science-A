//Name : Timothy Pham
//Period : 2nd

import java.util.Arrays;
public class arrayHelper
{
	
//arrayHelper #1
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

//arrayHelper #2

public static boolean allMults(int[] num, int mult)
{
	int rayLength = num.length;
	boolean numMults = false;
	int counter = 0;
	
	for (int i = 0; i < rayLength; i++)
	{
		if (num[i] % mult == 0)
		{
			counter = counter + 1;
		}
		if (counter == rayLength)
		{
			numMults = true;
		}
	}
	return numMults;
}

public static double mean(int[] meanArray)
{
	int meanArrayLength = meanArray.length;
	double meanTotal = 0;
	
	for (int i = 0; i < meanArrayLength; i++)
	{
		meanTotal = meanTotal + meanArray[i];
	}
	double average = meanTotal / meanArrayLength;
	return average;
}

public static double trimMean(int[] meanArray)
{
	int largest = findLargest(meanArray);
	int smallest = meanArray[1];
	int trimArrayLength = 3;
	double trimMeanArray = 0;
	
	for (int i = 0; i < meanArray.length; i++)
	{
		if (!(meanArray[i] == largest || meanArray[i] == smallest))
		{
			trimMeanArray = trimMeanArray + meanArray[i];
		}
	}
	
	double average = trimMeanArray / trimArrayLength;
	return average;
}

public static boolean noDupes(int[] array3)
{
	boolean dupesChecker = true;
	int array3Length = array3.length;
	int x = 1;
	int i = 0;
	//array3 = [12,4,7,8,12]
	
	while ((i < array3Length) && (x < array3Length))
	{
		if (array3[i] == array3[x])
		{
			dupesChecker = false;
			i++;
		}
		else if (!(array3[i] == array3[x]))
		{
			x++;
		}
	}
	return dupesChecker;
}

public static boolean noDupes2(int[] array4)
{
	boolean dupesChecker = true;
	int array4Length = array4.length;
	int x = 1;
	int i = 0;
	//array4 = [12,4,7,8,10]
	
	while ((i < array4Length) && (x < array4Length))
	{
		if (array4[i] == array4[x])
		{
			dupesChecker = false;
			i++;
		}
		else if (!(array4[i] == array4[x]))
		{
			x++;
		}
	}
	return dupesChecker;
}

public static boolean noDupes3(int[] array5, int[] array6)
{
	int arrayLength = array5.length + array6.length;
	int x = 0;
	int i = 0;
	boolean dupesChecker = true;
	
	while ((i < array5.length) && (x < array6.length))
	{
		if (array5[i] == array6[x])
		{
			dupesChecker = false;
			i++;
		}
		else if(!(array5[i] == array6[i]))
		{
			x++;
		}
	}
	return dupesChecker;
}

public static void makeAllEven(int[] array7)
{
	int[] evenArray = new int[array7.length];
	for (int i = 0; i < array7.length; i++)
	{
		if (array7[i] % 2 == 1)
		{
			evenArray[i] = array7[i] + 1;
		}
		else
		{
			evenArray[i] = array7[i];
		}
	}
	System.out.println(Arrays.toString(evenArray));
}

public static void tripleUp(int[] array7)
{
	int[] tripleArray = new int[array7.length];
	for (int i = 0; i < array7.length; i++)
	{
		tripleArray[i] = array7[i] * 3;
	}
	System.out.println(Arrays.toString(tripleArray));
}

public static void reverse(int[] array7)
{	
	//array7 = {12,4,7,8,17}
	int x = 4;
	for (int i = 0; i < array7.length && x >= 0; i++)
	{
		array7[i] = array7[x];
		array7[x] = array7[i];
		x--;
	}
	array7[3] = 4;
	array7[4] = 12;
System.out.println(Arrays.toString(array7));
}
}

  
  
  

