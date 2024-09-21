// Name: Timothy Pham
// Period: 2nd

public class TruckRunner {
	
	public static void main (String args[]) {
		
		Truck red = new Truck(212.45,30,55);
		red.increaseSpeed(10);
		System.out.println(red.isSpeeding()); //returns false
		red.increaseSpeed(24);
		red.setSpeedLimit(60);
		System.out.println(red.isSpeeding()); //returns true
		red.decreaseSpeed(17);
		red.setSpeedLimit(50);
		System.out.println(red.isSpeeding()); //returns false
		
		System.out.println("");
		Fleet fleet = new Fleet(11);
		System.out.println(fleet.numSpeeders());
		System.out.println(fleet.toString());
		

	}
}

