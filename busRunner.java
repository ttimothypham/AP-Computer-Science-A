// Name: Timothy Pham
// Period: 2nd

import java.util.ArrayList;
public class busRunner {
	
	public static void main (String args[]) {
		
		System.out.println("First part of Bus lab.");
		Bus bus1 = new Bus(3);
		System.out.println(bus1.getCurrentStop());
		bus1.move(); //stop 2
		System.out.println(bus1.getCurrentStop());
		bus1.move(); //stop 3
		System.out.println(bus1.getCurrentStop());
		bus1.move(); //back to stop 2
		System.out.println(bus1.getCurrentStop());
		bus1.move(); //back to stop 1
		bus1.move(); // moves to stop 2
		System.out.println(bus1.getCurrentStop());
		System.out.println(bus1.getCurrentStop());
		Bus bus2 = new Bus(5);
		System.out.println(bus1.getCurrentStop());
		System.out.println(bus2.getCurrentStop());
		
		System.out.println("\n//////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Number of stops each bus has.");
		ArrayList<Bus> list = new ArrayList<Bus>();
		Bus busNum1 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum1.getNumOfStops());
		Bus busNum2 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum2.getNumOfStops());
		Bus busNum3 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum3.getNumOfStops());
		Bus busNum4 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum4.getNumOfStops());
		Bus busNum5 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum5.getNumOfStops());
		Bus busNum6 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum6.getNumOfStops());
		Bus busNum7 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum7.getNumOfStops());
		Bus busNum8 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum8.getNumOfStops());
		Bus busNum9 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum9.getNumOfStops());
		Bus busNum10 = new Bus((int)(Math.random() * 9 + 2));
		System.out.println(busNum10.getNumOfStops());
		list.add(busNum1);
		list.add(busNum2);
		list.add(busNum3);
		list.add(busNum4);
		list.add(busNum5);
		list.add(busNum6);
		list.add(busNum7);
		list.add(busNum8);
		list.add(busNum9);
		list.add(busNum10);
		
		System.out.println("");
		System.out.println("After moving 5 times, each bus is at position...");
		for (int i = 0; i < list.size(); i++)
		{
			for (int x = 0; x < 5; x++)
			{
				list.get(i).move();
			}
			System.out.println(list.get(i).getCurrentStop());
		}
		


		

	}
}

