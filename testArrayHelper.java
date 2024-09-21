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
		int target;

		testArray = new int[] { 1,7, 8, 5, 10, -5, -3};
		numbs = new int[] {3,5,6,3,7,8,3,7,7,4,7};
		numbers = new int[] {10,8,7,6,5,4,3,2,1};
		array1 = new int[] {1,2,3,4,5};
		array2 = new int[] {6,7,8};
		
		System.out.println( Arrays.toString( testArray ));
		System.out.println(arrayHelper.contains(testArray, 7));
		System.out.println(arrayHelper.count(testArray, 10));
		System.out.println(arrayHelper.mostOccur(numbs));
		System.out.println(Arrays.toString(arrayHelper.combine(array1,array2)));
		System.out.println(Arrays.toString(arrayHelper.combineOdds(array1,array2)));
		System.out.println(arrayHelper.findLargest(numbers));
		System.out.println(arrayHelper.findSmallest(numbers));
		

	

    }
}
