// Name: Timothy Pham
// Period: 2nd
import java.util.ArrayList;
public class Array2DHelper 
{

//Part #1
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

//Part #2
public static boolean has0(int num)
{
	boolean zeroChecker = false;
	int digit;
	if (num == 0)
	{
		zeroChecker = true;
	}
	while (num > 0)
	{
		digit = num % 10;
		if (digit == 0)
		{
			zeroChecker = true;
		}
		num = num / 10;
	}
	return zeroChecker;
}

public static ArrayList<Integer> listZeroDigits(int[][] zeroMat)
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	for (int i = 0; i < zeroMat.length; i++)
	{
		for (int x = 0; x < zeroMat[i].length; x++)
		{
			int num = zeroMat[i][x];
			if (has0(num))
			{
				list.add(num);
			}
		}
	}
	return list;
}

public static int[][] doubleMat(int[][] mat)
{
	int row = mat.length;
	int column = mat[row - 1].length;
	int[][] doubleMat = new int[row][column];
	for (int i = 0; i < mat.length; i++)
	{
		for (int x = 0; x < mat[i].length; x++)
		{
			doubleMat[i][x] = mat[i][x] * 2;
		}
	}
	return doubleMat;
}

public static int[][] transpose(int[][] mat)
{
	int row = mat.length;
	int column = mat[row - 1].length;
	int[][] transpose = new int[column][row];
	for (int i = 0; i < column; i++)
	{
		for (int x = 0; x < row; x++)
		{
			transpose[i][x] = mat[x][i];
		}
	}
	return transpose;
}

public static int[][] listToMatrix(ArrayList<Integer> nums, int rows, int cols)
{
	int[][] listToMatrix = new int[rows][cols];
	int digit = 0;
	for (int i = 0; i < rows; i++)
	{
		for (int x = 0; x < cols; x++)
		{
			listToMatrix[i][x] = nums.get(digit);
			digit = digit + 1;
		}
	}
	return listToMatrix;
}

public static String[][] charMat(ArrayList<String> starList)
{
	int rows = starList.size();
	int cols = starList.get(0).length();
	String[][] charMat = new String[rows][cols];
	for (int i = 0; i < charMat.length; i++)
	{
		for (int x = 0; x < charMat[i].length; x++)
		{
			charMat[i][x] = starList.get(i).substring(x,x+1);
		}
	}
	return charMat;
}

public static ArrayList<Integer> copyLastXOdds(int[][] matrix, int num)
{
	ArrayList<Integer> lastOdds = new ArrayList<Integer>();
	for (int i = matrix.length - 1; i >= 0; i--)
	{
		for (int x = matrix[i].length - 1; x >= 0; x--)
		{
			if (num > 0)
			{
				if (matrix[i][x] % 2 == 1)
				{
					lastOdds.add(matrix[i][x]);
					num = num - 1;
				}
			}
		}
	}
	return lastOdds;
}

public static ArrayList<Integer> copyFirstXEvens(int[][] matrix, int num)
{
	ArrayList<Integer> firstEvens = new ArrayList<Integer>();
	for (int i = 0; i < matrix.length; i++)
	{
		for (int x = 0; x < matrix[i].length; x++)
		{
			if (num > 0)
			{
				if (matrix[i][x] % 2 == 0 && matrix[i][x] != 0)
				{
					firstEvens.add(matrix[i][x]);
					num = num - 1;
				}
			}
		}
	}
	return firstEvens;
}

}


