// Name: Timothy Pham
// Period: 2nd

import java.util.Scanner;
public class letterGrade {
	
	//Part 1
	public static void main (String args[]) {
		Scanner gradeInput = new Scanner(System.in);
		System.out.println("Type in your grade for the recent summative.");
		int grade = gradeInput.nextInt();
		
		if (grade < 0){
			System.out.println("\nInvalid grade entered.");
			System.exit(0);
		}else if (grade > 110){
			System.out.println("\nInvalid grade, reported for cheating.");
			System.exit(0);
		}else if (grade >= 90 && grade <= 100){
			System.out.println("\nYou got an A on the summative");
		}else if (grade >= 80 && grade < 90){
			System.out.println("\nYou got a B on the summative");
		}else if (grade >= 70 && grade < 80){
			System.out.println("\nYou got a C on the summative");
		}else if (grade >= 60 && grade < 70){
			System.out.println("\nYou got a D on the summative");
		}else if (grade < 60 && grade >= 0){
			System.out.println("\nYou got an F on the summative"); 
		}else if (grade > 100 && grade <= 110){
			System.out.println("\nYou got an A+++ on the summative");
		}
		
		//Part 2
		
		String yes = "y";
		String no = "n";
		
		Scanner funModeInput = new Scanner(System.in);
		System.out.println("Would you like to see your grade in fun mode (y/n)?");
		String funMode = funModeInput.next();
		
		if (funMode.equals(yes) && (grade >= 90 && grade <= 100)){
			System.out.println("\nExcellent job you got an A :-)");
		}else if (funMode.equals(yes) && (grade >= 80 && grade <= 90)){
			System.out.println("\nGood job you got a  B :-O");
	    }else if (funMode.equals(yes) && (grade >= 70 && grade <= 80)){
			System.out.println("\nYou got a C, maybe consider tutorials? :-|");
		}else if (funMode.equals(yes) && (grade >= 60 && grade <= 70)){
			System.out.println("\nYou got a D, you should go to tutorials. :-/");
		}else if (funMode.equals(yes) && (grade <= 60 && grade >= 0)){
			System.out.println("\nYou failed the summative, were you asleep or something? :'-(");
		}else if (funMode.equals(yes) && (grade >= 100 && grade <= 110)){
			System.out.println("\nWOW EXTRA CREDIT TOO?? SPECTACULAR JOB A+++");
			
		if (funMode.equals(no)){
			System.exit(0);
		}
}
}
}

			

			 
			
		
		
	


		
		
	


