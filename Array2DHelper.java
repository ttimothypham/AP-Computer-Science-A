// Name: Timothy Pham
// Period: 2nd
public class Array2DHelper 
{

public static int countEvens(int[][] mat)
{
	int count = 0;
	for (int i = 0; i < mat.length; i++)
	{
		for (int x = 0; x < mat[i].length; x++)
		{
			if (mat[i][x] % 2 == 0)
			{
				count = count + 1;
			}
			if (mat[i][x] == 0)
			{
				count = count - 1;
			}
		}
	}
	return count;
}

public static void addOneToAllEvens(int[][] mat)
{
	for (int i = 0; i < mat.length; i++)
	{
		for (int x = 0; x < mat[i].length; x++)
		{
			if ((mat[i][x] % 2 == 0) && (mat[i][x] != 0))
			{
				mat[i][x] = mat[i][x] + 1;
				System.out.print(mat[i][x] + " ");
			}
			else
			{
				System.out.print(mat[i][x] + " ");
			}
		}
		System.out.println();
	}
}

public static boolean fourOdds(int[][] test)
{
	int oddCount = 0;
	boolean fourOddsChecker = false;
	for (int i = 0; i < test.length; i++)
	{
		for (int x = 0; x < test[i].length; x++)
		{
			if (test[i][x] % 2 == 1)
			{
				oddCount++;
			}
		}
	}
	if (oddCount == 4)
	{
		fourOddsChecker = true;
	}
	return fourOddsChecker;
}

public static int findSmallest(int[][] mat)
{
	int smallest = mat[0][0];
	for (int i = 0; i < mat.length; i++)
	{
		for (int x = 0; x < mat[i].length; x++)
		{
			if (mat[i][x] < smallest)
			{
				smallest = mat[i][x];
			}
		}
	}
	return smallest;
}

public static int findSmallestOdd(int[][] digits)
{
	int smallest = digits[0][0];
	for (int i = 0; i < digits.length; i++)
	{
		for (int x = 0; x < digits[i].length; x++)
		{
			if ((digits[i][x] % 2 == 1) && (digits[i][x] < smallest))
			{
				smallest = digits[i][x];
			}
		}
	}
	return smallest;
}

public static int findLargest(int[][] mat)
{
	int largest = mat[0][0];
	for (int i = 0; i < mat.length; i++)
	{
		for (int x = 0; x < mat[i].length; x++)
		{
			if (mat[i][x] > largest)
			{
				largest = mat[i][x];
			}
		}
	}
	return largest;
}

public static int findLargestEven(int[][] digits)
{
	int largestEven = digits[0][0];
	for (int i = 0; i < digits.length; i++)
	{
		for (int x = 0; x < digits[i].length; x++)
		{
			if ((digits[i][x] > largestEven) && (digits[i][x] % 2 == 0) && (digits[i][x] != 0))
			{
				largestEven = digits[i][x];
			}
		}
	}
	return largestEven;
}

public static boolean has10Before5(int[][] matrix)
{
	boolean tenBeforeFive = false;
	for (int i = 0; i < matrix.length; i++)
	{
		for (int x = 0; x < matrix[i].length; x++)
		{
			if (matrix[i][x] == 10)
			{
				for (int index = x + 1; index < matrix[i].length; index++)
				{
					if (matrix[i][index] == 5)
					{
						tenBeforeFive = true;
					}
				}
			}
		}
	}
	return tenBeforeFive;
}
}

