
public class ReviewAnalysisTester {
	
  public static void main(String[] args)
  {
    
    Review[] x = new Review[] {
      new Review(4, "Good! Thx"),
      new Review(3, "OK site"),
      new Review(5, "Great!"),
      new Review(2, "Poor! Bad."),
      new Review(3, "")
    };
    
    ReviewAnalysis analysis = new ReviewAnalysis(x);
    
    System.out.println(analysis.getAverageRating());
    System.out.println(analysis.collectComments());
      
  }
}

