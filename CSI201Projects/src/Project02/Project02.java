package Project02;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * This program reads various inputs from the reader regarding name, cost, length and width of carpet. Using the information, the program calculates the final cost of the carpet including cost with tax and displays the output to the user.
 * @author Jahnavi Bonagiri
 * @version 1.0
 * 
 */

public class Project02 { private static final Double TAX = 8.50;
/**
 * Reads input from user on name, cost, length and width and calculates the total cost of carpet, generates customer ID and displays output to screen. 
 * @param args A reference to a string array containing command-line arguments
 */

	public static void main(String[] args) {
		
	//Summary: Calculate the cost of carpet with tax and display output to screen using various inputs of length, width, cost and name from user.	
	
		// 1. Declare all variables in the beginning of code.
		String concatenatedName, firstName, lastName, finalWidth, finalLength, finalArea, finalCost, Tax;
		String finalCarpetCost, finalTaxCost, finalTotal, name, firstLetter, remainingLetters;
		String name1, firstLetter1, remainingLetters1;
		int carpetLength, carpetWidth, area; 
		int result;
		double carpetCost, cost, taxCost, total;
		
		
		Scanner scanner = new Scanner(System.in);

		//2. Reads first name from user.
		System.out.println("Enter First Name: ");

		firstName = scanner.nextLine();
		
		//3. Reads last name from user.
		
		System.out.println("Enter Last Name: ");

		lastName = scanner.nextLine();

		//4. Reads the length of carpet. 
		System.out.println("Enter length of carpet(feet): ");

		carpetLength = scanner.nextInt();
		
		//5. Reads the width of carpet from user.

		System.out.println("Enter the width of carpet(feet): ");

		carpetWidth = scanner.nextInt();
		
		//6. Reads the cost of carpet per square foot.
		System.out.println("Enter the cost per square foot: ");

		carpetCost = (double) scanner.nextDouble();
		
		//7. Calculates the area by multiplying the width and length of carpet.
		area = carpetLength * carpetWidth;
		
		//8. Calculates the cost by multiplying the area and the cost of carpet per square foot.
		cost= area*carpetCost;
		
		//9. Calculates the tax cost by multiplying the cost of carpet by the tax.
		taxCost=(cost*(TAX/100));

		//10. Calculates the total cost by adding the tax cost and the cost of the carpet.
		total=cost+taxCost;
		
		//11. Format all the variables according to their proper formatting rules.
		
		DecimalFormat df = new DecimalFormat("000");
		finalWidth = df.format(carpetWidth);
		finalLength = df.format(carpetLength);
		finalArea = df.format(area);
		
		DecimalFormat dn = new DecimalFormat("#00.00");
		finalCost= dn.format(carpetCost);
		
		DecimalFormat dm= new DecimalFormat("##0.00");
		Tax= dm.format(TAX);
		
		DecimalFormat ds = new DecimalFormat("0000.00");
		finalCarpetCost= ds.format(cost);
		finalTaxCost= ds.format(taxCost);
		finalTotal= ds.format(total);
		
		//12. Take the first name from user and separate the first letter.
		name = firstName;
		firstLetter = name.substring(0, 1).toUpperCase();
		
		//13. Have the remaining letters stored in another variable as well.
		remainingLetters = name.substring(1, name.length()).toLowerCase();

		//16. Combine the first capitalized letter with the remaining lower cased letters of the first name and store it in variable.  
		name = firstLetter + remainingLetters;
		
		
		name1 = lastName;
		
		//17. Repeat the same steps with the last name. Take the last name from user and separate the first letter.
		firstLetter1 = name1.substring(0, 1).toUpperCase();
		
		//18. Have the remaining letters stored in another variable as well.
		remainingLetters1 = name1.substring(1, name1.length()).toLowerCase();
		
		//21. Combine the first capitalized letter with the remaining lower cased letters of the last name and store it in variable.  
		name1 = firstLetter1 + remainingLetters1;
		
		//22. Get the concatenated combined name by using the first name capitalized letter and the lower cased last name with five characters.
		concatenatedName = name.charAt(0) + name1.substring(0, 5);

		//23. Get a random value from 10-99 inclusive for the customer ID. This will produce a random value from 10-99. Store the value in variable result.

		Random generator= new Random();
		result= generator.nextInt(90)+10; //[10,99]
		//24. Display the customer values. Display the last name, first name and customer ID.
		
		
		System.out.println("\n"+"CUSTOMER");
		System.out.println("Last Name:  "+ name1);
		System.out.println("First Name: "+ name);
		System.out.println("ID: "+concatenatedName+result+"\n");
		
		//25. Display the measurement values. Display the length, width and the area of carpet. 
		System.out.println("MEASUREMENT");
		System.out.println("Length: "+finalLength+" feet");
		System.out.println("Width: "+finalWidth+" feet");
		System.out.println("Area: " + finalArea+" square feet");
		
		//26. Display the charges values. Display the cost of carpet per square foot, the cost of carpet, the tax, the tax cost and the total carpet cost with tax added. 
		System.out.println("\n"+"CHARGES");
		System.out.println("Description"+"\t\t"+"Cost/Sq.Ft."+"\t\t"+"Charges");
		System.out.println("-----------"+"\t\t"+"-----------"+"\t\t"+"---------");
		System.out.println("Carpet"+"\t\t\t"+finalCost+"\t\t\t"+"$"+finalCarpetCost); 
		System.out.println("Tax"+"\t\t\t "+Tax+"%"+"\t\t\t "+finalTaxCost);
		System.out.println("-----------");
		System.out.println("Total"+"\t\t\t\t\t\t"+"$"+finalTotal);
		
		scanner.close();

	}

	

}
