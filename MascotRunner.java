// Name: Timothy Pham
// Period: 2nd

public class MascotRunner {
	
	public static void main (String args[]) {
		
		Mascot UT = new Mascot("Bevo","Longhorn",1916);
		System.out.println(UT.toString());
		Mascot MichiganSt = new Mascot("Sparty","Spartan",1989);
		System.out.println(MichiganSt.toString());
		Mascot Bobby = new Mascot();
		System.out.println(Bobby.toString());
		
		System.out.println("");
		System.out.println(UT.getName());
		System.out.println(MichiganSt.getName());
		System.out.println(Bobby.getName());
		
		System.out.println("");
		UT.setName("Orangey");
		MichiganSt.setName("Greeny");
		Bobby.setName("Bobber");
		System.out.println(UT.toString());
		System.out.println(MichiganSt.toString());
		System.out.println(Bobby.toString());
		
		System.out.println("");
		System.out.println(UT.getType());
		System.out.println(MichiganSt.getType());
		System.out.println(Bobby.getType());
		
		System.out.println("");
		UT.setType("Cow");
		MichiganSt.setType("Knight");
		Bobby.setType("Bobblet");
		System.out.println(UT.toString());
		System.out.println(MichiganSt.toString());
		System.out.println(Bobby.toString());
		
		System.out.println("");
		System.out.println(UT.getYear());
		System.out.println(MichiganSt.getYear());
		System.out.println(Bobby.getYear());
		
		System.out.println("");
		System.out.println(UT.chant());
		System.out.println(MichiganSt.chant());
		System.out.println(Bobby.chant());
		
		System.out.println("");
		System.out.println(UT.getAge());
		System.out.println(MichiganSt.getAge());
		System.out.println(Bobby.getAge());
		
		System.out.println("");
		System.out.println(UT.olderThanMe());
		System.out.println(MichiganSt.olderThanMe());
		System.out.println(Bobby.olderThanMe());
	}
}

