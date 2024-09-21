/* A3 */

import java.util.ArrayList;

public class ClubMembers
{
	private ArrayList<MemberInfo> memberList;
	
	public ClubMembers()
	{
		memberList = new ArrayList<MemberInfo>();
	}
	
	public ClubMembers(MemberInfo[] members)
	{
		memberList = new ArrayList<MemberInfo>();
		for (MemberInfo member : members)
			memberList.add(member);
	}
	
	/* Part (a) */
	
	/** Adds new club members to memberList, as described in part (a).
	*  Precondition: names is a non-empty array.
	*/
	public void addMembers(String[] names, int gradYear)
	{
		for (int i =0; i < names.length; i++)
		{
			MemberInfo x = new MemberInfo(names[i],gradYear,true);
			memberList.add(x);
		}
	}
	
	/* Part (b) */
	
	/** Removes members who have graduated and returns a list of members who have graduated
	*  and are in good standing, as described in part (b).
	*/
	public ArrayList<MemberInfo> removeMembers(int year)
	{
		ArrayList<MemberInfo> goodGrads = new ArrayList<MemberInfo>();
		for (int i = 0; i < memberList.size(); i++)
		{
			if (memberList.get(i).getGradYear() <= year)
			{
				if (memberList.get(i).inGoodStanding())
				{
					goodGrads.add(memberList.get(i));
					memberList.remove(memberList.get(i));
				}
				if (!(memberList.get(i).inGoodStanding()))
				{
					memberList.remove(memberList.get(i));
				}
			}
		}
		return goodGrads;
	}
	
	/***************** Test *****************/
	
	public String toString()
	{
		return memberList.toString();
	} 
}
