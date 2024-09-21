// Name: Timothy Pham
// Period: 2nd
public class staticPractice2Runner 
{
	
	public static void main (String[] args) 
	{	
		//Here are two examples of calling the methods
		//You can call the method and print
		System.out.println(staticPractice2.midTwo("string"));
		
		//Or you can call the method and store the results in a variable
		String answer = staticPractice2.midTwo("code");
		System.out.println(answer);
		
		//Call the rest of the methods
		System.out.println(staticPractice2.midTwo("Practice"));
		System.out.println();
		System.out.println(staticPractice2.endsWithLy("oddly"));
		System.out.println(staticPractice2.endsWithLy("y"));
		System.out.println(staticPractice2.endsWithLy("oddy"));
		System.out.println();
		System.out.println(staticPractice2.firstTwo("hello"));
		System.out.println(staticPractice2.firstTwo("hi"));
		System.out.println(staticPractice2.firstTwo("h"));
		System.out.println();
		System.out.println(staticPractice2.garThere("hi garcia"));
		System.out.println(staticPractice2.garThere("boo!gar"));
		
	}
}

