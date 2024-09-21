/* A3 */

import java.util.ArrayList;

public class ReviewAnalysis
{
  /** All user reviews to be included in this analysis */
  private Review[] allReviews;

  /** Initializes allReviews to contain all the Review objects to be analyzed */
  public ReviewAnalysis(Review[] x) 
  { 
	  allReviews=x;
  }

  /* Part (a) */
  
  /** Returns a double representing the average rating of all the Review objects to be
   *  analyzed, as described in part (a)
   *  Precondition: allReviews contains at least one Review.
   *  No element of allReviews is null.
   */
  public double getAverageRating()
  {
		double total = 0;
		for (int i = 0; i < allReviews.length; i++)
		{
			total = total + allReviews[i].getRating();
		}
		double average = total / allReviews.length;
		return average;
  }

  /* Part (b) */

  /** Returns an ArrayList of String objects containing formatted versions of
   *  selected user comments, as described in part (b)
   *  Precondition: allReviews contains at least one Review.
   *  No element of allReviews is null.
   *  Postcondition: allReviews is unchanged.
   */
  public ArrayList<String> collectComments()
  {
	ArrayList<String> list = new ArrayList<String>();
	for (int i = 0; i < allReviews.length; i++)
	{
		if (allReviews[i].contains("!"))
		{
			list.add(i + "-" + allReviews[i]);
		}
	}
	return list;
  }
}
