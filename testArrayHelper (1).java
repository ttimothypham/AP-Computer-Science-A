//Name : Timothy Pham
//Period : 2nd

import java.util.Scanner;
import java.util.Arrays;

class testArrayHelper 
{
	public static void main(String[] args) 
	{
		
		int[] testArray;
		int[] numbs;
		int[] numbers;
		int[] array1;
		int[] array2;
		int[] mergedArray;
		int[] num;
		int[] meanArray;
		int[] array3;
		int[] array4;
		int[] array5;
		int[] array6;
		int[] array7;
		int target;
		int mult;

		testArray = new int[] { 1,7, 8, 5, 10, -5, -3};
		numbs = new int[] {3,5,6,3,7,8,3,7,7,4,7};
		numbers = new int[] {10,8,7,6,5,4,3,2,1};
		array1 = new int[] {1,2,3,4,5};
		array2 = new int[] {6,7,8};
		num = new int[] {2,4,6,8,10};
		meanArray = new int[] {12,4,7,8,10};
		array3 = new int[] {12,4,7,8,12};
		array4 = new int[] {12,4,6,8,10};
		array5 = new int[] {12,4,7,8,12};
		array6 = new int[] {3,87,123,23,3,1,5};
		array7 = new int[] {12,4,7,8,17};
		
		//arrayHelper #1
		System.out.println("arrayHelper #1");
		System.out.println( Arrays.toString( testArray ));
		System.out.println(arrayHelper.contains(testArray, 7));
		System.out.println(arrayHelper.count(testArray, 10));
		System.out.println(arrayHelper.mostOccur(numbs));
		System.out.println(Arrays.toString(arrayHelper.combine(array1,array2)));
		System.out.println(Arrays.toString(arrayHelper.combineOdds(array1,array2)));
		System.out.println(arrayHelper.findLargest(numbers));
		System.out.println(arrayHelper.findSmallest(numbers));
		
		//arrayHelper #2
		System.out.println();
		System.out.println("arrayHelper #2");
		System.out.println(arrayHelper.allMults(num, 2));
		System.out.println(arrayHelper.allMults(num, 3));
		System.out.println(arrayHelper.mean(meanArray));
		System.out.println(arrayHelper.trimMean(meanArray));
		System.out.println(arrayHelper.noDupes(array3));
		System.out.println(arrayHelper.noDupes2(array4)); //noDupes2 is the same as noDupes, it was made so it can test an array that would return true.
		System.out.println(arrayHelper.noDupes3(array5,array6)); //a noDupes method that will compare two arrays for dupes, return true.
		arrayHelper.makeAllEven(array7);
		arrayHelper.tripleUp(array7);
		arrayHelper.reverse(array7);
		

    }
}
