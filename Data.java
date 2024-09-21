/* A4 */

// import java.util.ArrayList;

import java.util.Random;

public class Data {
    public static final int MAX = 255;
    public int[][] grid;

    /** 
     * Fills all elements of grid with randomly generated values between 0 and MAX (inclusive).
     * Precondition: grid is not null. grid has at least one element.
     */
    public void repopulate() {
        Random rand = new Random();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = rand.nextInt(MAX + 1);
            }
        }
    }

    /**
     * Returns the number of columns in grid that are in increasing order.
     * Precondition: grid is not null. grid has at least one element.
     */
    public int countIncreasingCols() {
        int count = 0;
        for (int c = 0; c < grid[0].length; c++) {
            boolean increasing = true;
            for (int r = 1; r < grid.length; r++) {
                if (grid[r][c] < grid[r-1][c]) {
                    increasing = false;
                    break;
                }
            }
            if (increasing) {
                count++;
            }
        }
        return count;
    }
}





