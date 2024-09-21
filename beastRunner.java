// Name: Timothy Pham
// Period: 2nd

import java.util.ArrayList;
public class beastRunner {
	
	public static void main (String args[]) {
		
		Titan zeke = new Titan();
		System.out.println(zeke.getSize());
		System.out.println(zeke.sayStuff());
		System.out.println(zeke.eatsMeat());
		
		System.out.println();
		
		Human King = new Human();
		System.out.println(King.getSize());
		System.out.println(King.sayStuff());
		System.out.println(King.eatsMeat());
		
		System.out.println();
		
		Monkey Bobby = new Monkey();
		System.out.println(Bobby.getSize());
		System.out.println(Bobby.sayStuff());
		System.out.println(Bobby.eatsMeat());
		
		ArrayList<Beast> list = new ArrayList<Beast>();
		for (int i = 0; i < 10; i++)
		{
			int rand = (int)(Math.random() * 3);
			if (rand == 0)
			{
				Titan titan = new Titan();
				list.add(titan);
			}
			if (rand == 1)
			{
				Human human = new Human();
				list.add(human);
			}
			if (rand == 2)
			{
				Monkey monkey = new Monkey();
				list.add(monkey);
			}
		}
		
		System.out.println();
		
		for (int index = 0; index < list.size(); index++)
		{
			System.out.println(list.get(index));
		}
		
		System.out.println();
		
		for (int x = 0; x < list.size(); x++)
		{
			int idx = x + 1;
			System.out.println("Beast #" + idx);
			System.out.println(list.get(x).getSize());
			System.out.println(list.get(x).sayStuff());
			System.out.println(list.get(x).eatsMeat());
			System.out.println();
		}
		
	}
}

