/* A1 */

public class Game
{
  private Level levelOne;
  private Level levelTwo;
  private Level levelThree;
  private boolean bonus;
  private int score;
    
  /** Postcondition: All instance variables have been initialized. */
  public Game(boolean b)
  {
	bonus = b;
	score = 0;  
  }

  /** Returns true if this game is a bonus game and returns false otherwise */
  public boolean isBonus()
  { 
	if (bonus == true)
	{
		return true;
	}
	else
	{
		return false;
    }
   }

  /** Simulates the play of this Game (consisting of three levels) and updates all relevant
   *  game data
   */
  public void play()
  {
    levelOne = GameTest.getNextLevel();
    levelTwo = GameTest.getNextLevel();
    levelThree = GameTest.getNextLevel();
  }

  /* Part (a) */

  /** Returns the score earned in the most recently played game, as described in part (a) */
  public int getScore()
  { 
	if (levelOne.goalReached())
	{
		score = score + levelOne.getPoints();
	}
	if (levelTwo.goalReached())
	{
		score = score + levelTwo.getPoints();
	}
	if (levelThree.goalReached())
	{
		score = score + levelThree.getPoints();
	}
	if (isBonus())
	{
		score = score * 3;
	}
	if (!(levelOne.goalReached()))
	{
		score = 0;
		return score;
	}
	if (!(levelTwo.goalReached()))
	{
		return score;
	}
	if (!(levelThree.goalReached()))
	{
		return score;
	}
	return score;
  }

  /* Part (b) */

  /** Simulates the play of num games and returns the highest score earned, as
   *  described in part (b)
   *  Precondition: num > 0
   */
  public int playManyTimes(int num)
  { 
	int highest = 0;
	for (int i = 0; i < num; i++)
	{
		play();
		if(getScore() > highest)
		{
			highest = getScore();
		}
	}
	return highest;
  }      
}

