//Timothy Pham

public class CombinedTable
{	
  private SingleTable table1;
  private SingleTable table2;
  
  public CombinedTable(SingleTable t1, SingleTable t2)
  {
    table1 = t1;
    table2 = t2;
  }
  
  public boolean canSeat(int n)
  {
    int totalSeats = table1.getNumSeats() + table2.getNumSeats();
    return (n <= totalSeats);
  }
  
  public double getDesirability()
  {
    double avgViewQuality = (table1.getViewQuality() + table2.getViewQuality()) / 2;
    return avgViewQuality;
  }
}



