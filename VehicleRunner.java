// Name: Timothy Pham
// Period: 2nd

public class VehicleRunner {
	
	public static void main (String args[]) {
		
		Vehicle lexus = new Vehicle("Lexus","ES350",2007);
		System.out.println(lexus.getMake());
		System.out.println(lexus.getModel());
		System.out.println(lexus.getYear());
		System.out.println(lexus.toString());
		
		System.out.println();
		Ford ford = new Ford("Mustang",2006,"White");
		System.out.println(ford.getMake());
		System.out.println(ford.getModel());
		System.out.println(ford.getYear());
		System.out.println(ford.getColor());
		ford.repaint("Electric Blue");
		System.out.println(ford.getColor());
		System.out.println(ford.toString());
	}
}

