package Project03;
import java.util.Scanner;
/**
 * This program calculates the difference between two dates with no negative difference. Then, displays the output for the user. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 * 
 */

public class Project03 {
	/**
	 * This program reads input of two different dates and uses mathematical operations and decision structure to calculate the date difference.
	 * @param args A reference to a string array containing command-line arguments
	 */

	//Summary: This program calculates the difference between two dates and displays the difference to the user. 
	public static void main(String[] args) {
	
	//1. Declare variables in the beginning of program.
	double year1=0;
	double year2=0;
	String month1, month2;
	double month1number=0;
	double month2number=0;
	int monthsdifference=0;
	int yearsdifference = 0;
	
	Scanner scanner = new Scanner(System.in); 
	
	//2. Reads the first month as string.
	System.out.println("For the first date,");

	System.out.println("Enter month: ");
	month1 = scanner.nextLine();
	//.3 Reads the first year date as a double.
	System.out.println("Enter year: ");
	year1 = scanner.nextDouble();
	
	scanner.nextLine();
	
	System.out.println("For the second date,");
	//4. Reads the second month as a string.
	System.out.println("Enter month: ");
	
	month2 = scanner.nextLine();
	//5. Reads the second year date as a double.
	System.out.println("Enter year: ");
	year2 = scanner.nextDouble();
	
	//6. Uses if and else if statements to assign a integer number to the first string month.
	
	if (month1.equalsIgnoreCase("January")) {
		month1number= 1;
	}else if(month1.equalsIgnoreCase("February")) {
		month1number=2;
	}else if(month1.equalsIgnoreCase("March")) {
		month1number=3;
	}else if(month1.equalsIgnoreCase("April")) {
		month1number=4;	
	}else if(month1.equalsIgnoreCase("May")) {
		month1number=5;
	}else if(month1.equalsIgnoreCase("June")) {
		month1number=6;
	}else if(month1.equalsIgnoreCase("July")) {
		month1number=7;
	}else if(month1.equalsIgnoreCase("August")) {
		month1number=8;
	}else if(month1.equalsIgnoreCase("September")) {
		month1number=9;
	}else if(month1.equalsIgnoreCase("October")) {
		month1number=10;
	}else if(month1.equalsIgnoreCase("November")) {
		month1number=11;	
	}else if(month1.equalsIgnoreCase("December")) {
		month1number=12;	
	}
	
	//7. Uses if and else if statements to assign a integer number to the second string month.
	if (month2.equalsIgnoreCase("January")) {
		month2number= 1;
	}else if(month2.equalsIgnoreCase("February")) {
		month2number=2;
	}else if(month2.equalsIgnoreCase("March")) {
		month2number=3;
	}else if(month2.equalsIgnoreCase("April")) {
		month2number=4;	
	}else if(month2.equalsIgnoreCase("May")) {
		month2number=5;
	}else if(month2.equalsIgnoreCase("June")) {
		month2number=6;
	}else if(month2.equalsIgnoreCase("July")) {
		month2number=7;
	}else if(month2.equalsIgnoreCase("August")) {
		month2number=8;
	}else if(month2.equalsIgnoreCase("September")) {
		month2number=9;
	}else if(month2.equalsIgnoreCase("October")) {
		month2number=10;
	}else if(month2.equalsIgnoreCase("November")) {
		month2number=11;	
	}else if(month2.equalsIgnoreCase("December")) {
		month2number=12;
	}


	
	
	//8. If first year is greater than or equal to the second year, there will be a subset of decision structures to follow. 
	if(year1>=year2) {
		
		//9. If first year is greater than or equal to second year and month 1 is greater than or equal to second month, calculate the month difference and year difference. 
		if(month1number>=month2number && year1>=year2) {
				monthsdifference=(int) (month1number-month2number);
				yearsdifference=(int) (year1-year2);
			} 
		}
		
		//10. If first year is greater than or equal to second year and month 1 is less than second month, calculate the month difference and year difference.
		if(month1number<month2number && year1>=year2) {

				monthsdifference=(int) (month2number-month1number);
				yearsdifference=(int) (year1-year2);
			}
	
	//11. If first year less than the second year, there will be a subset of decision structures to follow. 

	if(year1<year2) {
		
		//12. If first year less than second year and month 1 greater than second month, calculate the month difference and year difference. 
		//13. Add +=12 to month difference to make the month difference non-negative
		//14. Subtract 1 from yearsdifference to calculate the correct difference.


		if(month1number>month2number && year1<year2) {

				monthsdifference=(int) (month2number-month1number);
				monthsdifference +=12;
				yearsdifference=(int) (year2-year1)-1;

			} 
		}
		//15. If first year less than second year and month 1 less than second month, calculate the month difference and year difference. 

		if(month1number<month2number && year1<year2) {
			
				monthsdifference=(int) (month2number-month1number);
				yearsdifference=(int) (year2-year1);
			
		}
	
	//16. Display the difference between the two dates. 
	System.out.println("These two dates are "+yearsdifference+" years and "+monthsdifference+" months apart." );

	scanner.close();
	
	}
}


	



