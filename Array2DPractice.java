// Name: Timothy Pham
// Period: 2nd

public class Array2DPractice {
	
	public static void main (String args[]) {
		
		int[][] digits = new int[4][6];
		String[][] words = new String[5][10];
		digits[0][0] = 1;
		digits[0][1] = 2;
		digits[0][2] = 3;
		digits[0][3] = 4;
		digits[0][4] = 5;
		
		for (int i = 0; i < digits.length; i++)
		{
			for (int x = 0; x < digits[i].length; x++)
			{
				System.out.print(digits[i][x] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 0; row < words.length; row++)
		{
			for (int column = 0; column < words[row].length; column++)
			{
				words[row][column] = "bears";
				System.out.print(words[row][column] + " ");
			}
			System.out.println();
		}
		
	}
}

