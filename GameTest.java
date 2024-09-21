/* A1 */

/* Test */

public class GameTest
{
  private static Level[] levels = {
    new Level(true, 200), new Level(true, 100), new Level(true, 500),
    new Level(true, 200), new Level(true, 100), new Level(false, 500),
    new Level(true, 200), new Level(false, 100), new Level(true, 500),
    new Level(false, 200), new Level(true, 100), new Level(true, 500),
    new Level(true, 75), new Level(false, 100), new Level(false, 100),
    new Level(true, 50), new Level(false, 100), new Level(false, 100),
    new Level(true, 90), new Level(false, 100), new Level(false, 100),
    new Level(true, 20), new Level(false, 100), new Level(false, 100)};

  private static boolean[] bonuses = {true, false, true, false, false, false, false, false}; 
  private static int levelIndex = 0;
  private static int bonusIndex = 0;

  public static Level getNextLevel()
  {
    return levels[levelIndex++];
  }

  public static boolean getNextBonus()
  {
    return bonuses[bonusIndex++];
  }

  public static void main(String[] args)
  {
	  System.out.println("This file is just to test your code. If your code is written correctly then it should match the examples in the FRQ.\n");
	  
    Game game = new Game(true);
    for (int i = 0; i < 4; i++)
    {
      game.play();
      System.out.println("Play #"+(i+1)+" Score calculation: "+game.getScore() + " ");
    }
    System.out.println();

    System.out.println("Play many times: "+game.playManyTimes(4));
  }
}
