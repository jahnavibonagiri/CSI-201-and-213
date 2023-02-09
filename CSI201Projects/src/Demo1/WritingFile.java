package Demo1;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter; // Need this PrintWriter Import
import java.text.DecimalFormat;

/**
 * This program calculates the compound interest and sends the result to the screen and to the file the user inputs.    
 * @author Group 
 * @version 1.0
 * 
 */

public class WritingFile{
	
	/**
	 * This program calculates the compound interest and sends the result to the screen and to the file the user inputs.
	 * @param args A reference to a string array containing command-line arguments
	 */
	

	public static void main(String[] args) throws IOException{
		
		// 1. Declare variables
		
		double principle, rate, time, compounded;
		double result, interestPercentage;
		DecimalFormat resultFormat= new DecimalFormat(".00");
		
		String fileName;
		
		
		//2. Use scanner to read user inputs 
		Scanner scan = new Scanner(System.in);
		
		//3. Reads the starting principle
		System.out.print("Enter the starting principle: ");
		principle=scan.nextDouble();
		
		//4. Reads annual interest rate
		System.out.print("Enter the annual interest rate: ");
		rate=scan.nextDouble();
		
		//5. Reads how many time per year the interest is compounded
		System.out.print("How many times per year is the interest compounded? " );
		compounded=scan.nextDouble();
		
		//6. Reads for how many years the account will earn interest
		System.out.print("For how many years will the account earn interest? ");
		time=scan.nextDouble();

		//7. Converts rate into percentage
		interestPercentage=(rate/100);
		
		
		//8. Calculates the result using the inputs
		result=principle * Math.pow(1 + (interestPercentage/ compounded), compounded * time);
		
		//9. Displays the result
		
		System.out.println("At the end " + time + " years you will have $" + resultFormat.format(result));
		
		//10. Asks the user to enter the file name they want to send it to
		System.out.print("\n"+"Enter the filename: ");
		scan.nextLine();
	    fileName = scan.nextLine();
	    
	    PrintWriter output = new PrintWriter(fileName);
	    
	    // Opens the file
	    // outputFile = new PrintWriter(fileName);
	    
	    //11. output prints the sentence to the file
	    
		output.println("At the end of " + time + " years you will have $" + resultFormat.format(result));
		System.out.println("\n"+"Report written into a file: "+ fileName);
		
		//12. Close file
		output.close();
		
		scan.close();
		

		}

	}







	





			


	

		
				
		



	

