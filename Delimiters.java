/* A3 */

import java.util.ArrayList;

public class Delimiters
{
  /** The open and close delimiters. */
  private String openDel;
  private String closeDel;

  /** Constructs a Delimiters object where open is the open delimiter and close is the
   *  close delimiter.
   *  Precondition: open and close are non-empty strings.
   */
  public Delimiters(String open, String close)
  {
    openDel = open;
    closeDel = close;
  }

  /******************************** Part (a) ********************************/
  
  /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
  public ArrayList<String> getDelimitersList(String[] tokens)
  { 
	ArrayList<String> list = new ArrayList<String>();
	int i = 0;
	do
	{
		if (tokens[i].equals(openDel))
		{
			list.add(tokens[i]);
			i++;
		}
		else
		{
			i++;
		}
	}
	while (i < tokens.length);
	
	for (int x = 0; x < tokens.length; x++)
	{
		if (tokens[x].equals(closeDel))
		{
			list.add(tokens[x]);
		}
	}
	return list;	
  }

  /******************************** Part (b) ********************************/
  
  /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
  * Precondition: delimiters contains only valid open and close delimiters.
  */
  public boolean isBalanced(ArrayList<String> delimiters)
  { 
	int count = 0;
	for (int i = 0; i < delimiters.size(); i++)
	{
		if (delimiters.get(i).equals(openDel))
		{
			count++;
		}
		if (delimiters.get(i).equals(closeDel))
		{
			count--;
		}
		if (count < 0)
		{
			return false;
		}
	}
	return true;
}
}
