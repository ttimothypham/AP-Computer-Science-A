// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class dateBefore {
	
	public static void main (String args[]) {
		
		//Month And Day Inputs
		Scanner monthInputOne = new Scanner(System.in);
		System.out.println("Enter any month (1-12)");
		int monthOne = monthInputOne.nextInt();
		Scanner dayInputOne = new Scanner(System.in);
		System.out.println("Enter any valid day corresponding with the month (1-31)");
		int dayOne = dayInputOne.nextInt();
		Scanner monthInputTwo = new Scanner(System.in);
		System.out.println("Enter another month (1-12)");
		int monthTwo = monthInputTwo.nextInt();
		Scanner dayInputTwo = new Scanner(System.in);
	    System.out.println("Enter another valid day corresponding with the month (1-31)");
	    int dayTwo = dayInputTwo.nextInt();
	    
	    //Determining Which Date Comes First
		if (monthOne < monthTwo){
			System.out.println();
			System.out.println((monthOne + "/" + dayOne) + " comes before " + (monthTwo + "/" + dayTwo));
		}
		if (monthOne > monthTwo){
			System.out.println();
			System.out.println((monthTwo + "/" + dayTwo) + " comes before " + (monthOne + "/" + dayOne));
		}
		if (monthOne == monthTwo && dayOne < dayTwo){
			System.out.println();
			System.out.println((monthOne + "/" + dayOne) + " comes before " + (monthTwo + "/" + dayTwo));
		}
		if (monthOne == monthTwo && dayTwo < dayOne){
			System.out.println();
			System.out.println((monthTwo + "/" + dayTwo) + " comes before " + (monthOne + "/" + dayOne));
	    }
	    
	    
}
}

