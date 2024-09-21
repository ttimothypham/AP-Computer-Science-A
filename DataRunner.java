// Name: Timothy Pham
// Period: 2nd
public class DataRunner 
{
	
  public static void main(String[] args)
  {
    Data data = new Data();
    data.grid = new int[4][8];
    
    data.repopulate();
    
    //This nested loop should print the grid with random numbers
    //as specified
    for (int r = 0; r < data.grid.length; r++)
    {
      for (int c = 0; c < data.grid[0].length; c++)
        System.out.print(data.grid[r][c] + " ");
      System.out.println();
    }

    data.grid = new int[][] {
      {10, 50, 40},
      {20, 40, 20},
      {30, 50, 30}
    };

    System.out.println(data.countIncreasingCols());//should print 1

    data.grid = new int[][] {
      {10, 540, 440, 440},
      {220, 450, 440, 190}
    };

    System.out.println(data.countIncreasingCols());//should print 2

    data.grid = new int[][] {
      {10, 540, 440, 440}
    };

    System.out.println(data.countIncreasingCols());//should print 4
  }
}

