// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class daysInMonth {
	
	public static void main (String args[]) {
		
		//Part 1
		Scanner monthInput = new Scanner(System.in);
		System.out.println("Enter any month as a number. ");
		int month = monthInput.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			System.out.println("\nThere are 31 days in this month.");
		}else if (month == 4 || month == 6 || month == 9 || month == 11){
			System.out.println("\nThere are 30 days in this month.");
		}
		
		//Part 2
		Scanner yearInput = new Scanner(System.in);
		System.out.println("\nEnter any year. ");
		int year = yearInput.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println();
			System.out.println(year + " is a leap year.");
		}else{
			System.out.println();
			System.out.println(year + " is NOT a leap year.");
		}
		
		if (month == 2 & year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("There are 29 days of February in the year " + year);
		}else if (month == 2){
			System.out.println("There are 28 days of February in the year " + year);
		}
			
		}
		
		
	
	}


