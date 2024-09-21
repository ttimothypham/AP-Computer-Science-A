import java.util.*;
import java.util.Arrays;
// Timothy Pham
// 2nd

public class ChickenRunner 
{ 
	public static int totalEggs(Chicken[] chickenCoop)
	{
		int total = 0;
		for (int i = 0; i < 10; i++)
		{
			total = total + chickenCoop[i].eggsLaid();
		}
		return total;
	}
	
	public static void main(String[] args) 
	{

		Chicken chick = new Chicken();
		System.out.println(chick);
		Chicken chick1 = new Chicken(7, "Triton");
		System.out.println(chick1);
		Chicken chick2 = new Chicken("Aidan",4);
		System.out.println(chick2);
		Chicken chick3 = new Chicken(9);
		System.out.println(chick3);
		Chicken chick4 = new Chicken("Brian");
		System.out.println(chick4);
		
		System.out.println("");
		System.out.println(chick1.getAge()); 
		System.out.println(chick2.getName()); 
		chick3.setAge(10); 
		System.out.println(chick3.getAge());
		chick4.setName("Parker"); 
		System.out.println(chick4.getName());
		System.out.println("");
		
		System.out.println(chick);
		System.out.println(chick1);
		System.out.println(chick2);
		System.out.println(chick3);
		System.out.println(chick4);
		System.out.println("");
		
		System.out.println((Chicken.roosterCrow())); 
		System.out.println(Chicken.getLegs(5));
		System.out.println(""); 
		
		ArrayList<Chicken> list = new ArrayList<Chicken>();
		Chicken chicken1 = new Chicken("Tyler",15);
		Chicken chicken2 = new Chicken("Parker",14);
		Chicken chicken3 = new Chicken("Matthew",13);
		Chicken chicken4 = new Chicken("Jack",12);
		Chicken chicken5 = new Chicken("Brian",11);
		Chicken chicken6 = new Chicken("Aidan",10);
		Chicken chicken7 = new Chicken("Triton",9);
		Chicken chicken8 = new Chicken("Taevin",8);
		Chicken chicken9 = new Chicken("Cayden",7);
		Chicken chicken10 = new Chicken("Joey",6);
		
		list.add(chicken1);
		list.add(chicken2);
		list.add(chicken3);
		list.add(chicken4);
		list.add(chicken5);
		list.add(chicken6);
		list.add(chicken7);
		list.add(chicken8);
		list.add(chicken9);
		list.add(chicken10);
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("");
		for (int i = 0; i < list.size(); i++)
		{
			Chicken tempChick = list.get(i);
			tempChick.addBreederName("Pham");
			System.out.println(tempChick);
		}
		
		System.out.println("");
		Chicken[] chickenCoop = new Chicken[10];
		chickenCoop[0] = chicken1;
		chickenCoop[1] = chicken2;
		chickenCoop[2] = chicken3;
		chickenCoop[3] = chicken4;
		chickenCoop[4] = chicken5;
		for (int i = 0; i < 5; i++)
		{
			System.out.println(chickenCoop[i]);
		}
		
		System.out.println("");
		System.out.println(Arrays.toString(chickenCoop));
		System.out.println("");
		chickenCoop[5] = chick;
		chickenCoop[6] = chick1;
		chickenCoop[7] = chick2;
		chickenCoop[8] = chick3;
		chickenCoop[9] = chick4;
		System.out.println(Arrays.toString(chickenCoop));
		System.out.println("");
		for (int i = 0; i < 10; i++)
		{
			chickenCoop[i].getOlder();
			System.out.println(chickenCoop[i]);
		}
		System.out.println("");
		System.out.println(totalEggs(chickenCoop));

		

	}
}
