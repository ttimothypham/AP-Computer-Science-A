// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class season {
	
	public static void main (String args[]) {
		
		//User date input
		Scanner monthNum = new Scanner(System.in);
		System.out.println("Enter any month as a number.");
		int month = monthNum.nextInt();
		Scanner dayNum = new Scanner(System.in);
		System.out.println("Enter any day as a number");
		int day = dayNum.nextInt();
		
		//Date Validation
		if (month > 12 || month < 1){
			System.out.println("\nInvalid date entered.");
			System.exit(0);
		}else if (day > 30 && month == 4 ||month == 6 || month == 9 || month == 11){
			System.out.println("\nInvalid date entered.");
			System.exit(0);
		}else if (day > 28 && month == 2){
			System.out.println("\nInvalid date entered.");
			System.exit(0);
		}else if (day > 31 && month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			System.out.println("\nInvalid date entered.");
			System.exit(0);
		}
		
		//User date input is printed
		String date = month + "/" + day;
		System.out.print("\nYour date is ");
		System.out.print(date);
		
		//Seasons
		if (month == 12 && day >= 16 || month >= 1 && month <= 3 && day <= 15){ //Winter
			System.out.println("\nWinter");
			}else if (month == 6 && day <= 15 || month >= 3 && month <=5 && day >= 16){ //Spring
				System.out.println("\nSpring");
			}else if (month == 9 && day <= 15 || month >=6 && month <=8 && day >= 16){ //Summer
				System.out.println("\nSummer");
			}else if (month == 12 && day <= 15 || month >=9 && month <=11 && day >= 16){ //Fall
				System.out.println("\nFall");
			}
			}
				
		
	}


