// Name: Timothy Pham
// Period: 2nd

public class Textbook extends Book2 {
	
	private int edition;
	
	public Textbook(String t, double p, int e)
	{
		super(t,p);
		edition = e;
	}
	
	public int getEdition()
	{
		return edition;
	}
	
	public boolean canSubstituteFor(Textbook t)
	{
		if (super.getTitle().equals(t.getTitle()))
		{
			if (edition >= t.getEdition())
			{
				return true;
			}
		}
		return false;
	}
	
	public String getBookInfo()
	{
		return super.getTitle() + " - " + super.getPrice() + " - " + edition;
	}

}

