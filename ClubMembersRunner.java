/**
 * @(#)ClubMembersRunner.java
 *
 *
 * @author 
 * @version 1.00 2022/3/20
 */
import java.util.ArrayList;

public class ClubMembersRunner {
        
	public static void main(String[] args)
	{
		MemberInfo[] members = {new MemberInfo("SMITH, JANE", 2019, false),
	                new MemberInfo("FOX, STEVE", 2018, true),
	                new MemberInfo("XIN, MICHAEL", 2017, false),
	                new MemberInfo("GARCIA, MARIA", 2020, true)};
	
		ClubMembers club = new ClubMembers(members);
	
		ArrayList<MemberInfo> newList = club.removeMembers(2018);
		System.out.println("New list = " + newList + " Club list = " + club);
	}
}
