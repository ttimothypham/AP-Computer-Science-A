/* A1 */

public class Level
{
  private boolean reached;
  private int points;

  public Level()
  {
    reached = true;
    points = 200;
  }
  
  public Level(boolean rchd, int pts)
  {
    reached = rchd;
    points = pts;
  }
  
  /** Returns true if the player reached the goal on this level and returns false otherwise */
  public boolean goalReached()
  { return reached; }

  /** Returns the number of points (a positive integer) recorded for this level */
  public int getPoints()
  { return points; }
}