package Project04;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.text.DecimalFormat; 

/**
 * This program calculates the average test score for a group of 4 students by passing different arguments into different methods and having the option of displaying it to screen, sending to a file and quitting the program. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 * 
 */

public class Project04 {
	
	/**
	 * This program passes array of 4 student test score values and displays there letter grade and the average. It utilizes a switch statement that allows the user to send to the screen, send to a file and quit the program.
	 * @param args A reference to a string array containing command-line arguments
	 */
	
	// Summary: This program passes array of 4 student test score values and displays there letter grade and the average. It utilizes a switch statement that allows the user to send to the screen, send to a file and quit the program.


	public static void main(String[] args) throws IOException{
		
	//1. Declare variables
		
		int choice=0;
		int[] test1= new int[4];
		int[] test2= new int[4];
		double[] average1= new double[test1.length];
		char [] grade11= new char[test1.length];
		String fileName;
		PrintWriter outputFile;
		Scanner scan = new Scanner(System.in);
		DecimalFormat score= new DecimalFormat("000");
		DecimalFormat average= new DecimalFormat("000.0");

	do{
	
	//2. Asks user what choice they want the program to do and if they want to send it to a screen, file or quit
		System.out.println("\n"+"Welcome to Grade Center!");
		System.out.println("Enter 1 to generate and display a grade report");
		System.out.println("Enter 2 to generate a grade report and save it into a file.");
		System.out.println("Enter 3 to quit");

		choice=scan.nextInt();

		final int GRADE_REPORT = 1;
		final int GRADE_REPORT_IN_FILE = 2;
		final int EXIT = 3;
	
		switch (choice){
			
			//3. Choice 1 sends the program to a screen.
			case GRADE_REPORT:	
				System.out.println("For Test 1,");
				
				// 4. Reads the user test score input and creates an array by using a for loop to store user values in 4 index places for test 1.
				for (int index=0; index<test1.length; index++) {
					System.out.print("Enter score " + (index+1) + ": ");
					test1[index] = scan.nextInt(); 
				}
				
				// 5. Reads the user test score input and creates an array by using a for loop to store user values in 4 index places for test 2.
				System.out.println("For Test 2,"); 
				for (int index=0; index<test2.length; index++) {
					System.out.print("Enter score " + (index+1) + ": "); 
					test2[index] = scan.nextInt();
					
			
				}
				
				// 6. Calls the methods of average and lettergrade
				average1= average(test1, test2);
				grade11= lettergrade(average1); 
				
				System.out.println("\n"+"Test 1"+"\t\t"+"Test 2"+"\t\t"+"Average"+"\t\t"+"Grade");
				System.out.println("------"+"\t\t"+"------"+"\t\t"+"-------"+"\t\t"+"------");
				
				//7. Displays the test 1 scores, test 2 scores, average score and the letter grade with proper decimal formatting
				for(int index=0; index<test1.length; index++) {
					
			
					System.out.println(score.format(test1[index])+ "\t\t" +score.format(test2[index])+ "\t\t"+ average.format(average1[index])+"\t\t"+grade11[index]);

				}
				break;
			//8. Choice 2 displays the output to the screen and sends information to a file
			case GRADE_REPORT_IN_FILE:
				
				//9. Utilizes same repeated steps of reading the user test score input and creates an array by using a for loop to store user values in 4 index places for test 1.
				for (int index=0; index<test1.length; index++) {
					System.out.print("Enter score " + (index+1) + ": ");
					test1[index] = scan.nextInt(); 
				}
				
				//10. Utilizes same repeated steps of reading the user test score input and creates an array by using a for loop to store user values in 4 index places for test 2.
				System.out.println("For Test 2,"); 
				for (int index=0; index<test2.length; index++) {
					System.out.print("Enter score " + (index+1) + ": "); 
					test2[index] = scan.nextInt();
					
			
				}
				
				//11. Calls the average and lettergrade method.
				average1= average(test1, test2);
				grade11= lettergrade(average1); 
				
				//12. Displays the test 1 scores, test 2 scores, average score and the letter grade with proper decimal formatting.

				System.out.println("\n"+"Test 1"+"\t\t"+"Test 2"+"\t\t"+"Average"+"\t\t"+"Grade");
				System.out.println("------"+"\t\t"+"------"+"\t\t"+"-------"+"\t\t"+"------");
				for(int index=0; index<test1.length; index++) {
					System.out.println(score.format(test1[index])+ "\t\t" +score.format(test2[index])+ "\t\t"+ average.format(average1[index])+"\t\t"+grade11[index]);

				}
				
				//13. Reads the file name the user wants to send the information to.
				System.out.print("\n"+"Enter the filename: ");
				scan.nextLine();
			    fileName = scan.nextLine();
			    
			    // 14. See if file exists or not.
			    File file = new File(fileName);
			      if (file.exists()){
			         System.out.println("The file " + fileName + " already exists.");
			         System.exit(0);
			      }
		
			     //15. Open the file that the user wants to write to 
			    outputFile = new PrintWriter(fileName);

			    //16.  Get data and write it to the file.
				outputFile.println("\n"+"Test 1"+"\t\t"+"Test 2"+"\t\t"+"Average"+"\t\t"+"Grade");
				outputFile.println("------"+"\t\t"+"------"+"\t\t"+"-------"+"\t\t"+"------");
			    for(int index=0; index<test1.length; index++) {
					outputFile.println(score.format(test1[index])+ "\t\t" +score.format(test2[index])+ "\t\t"+ average.format(average1[index])+"\t\t"+grade11[index]);
				
			    
			      }
			    System.out.println("\n"+"Report written into a file: "+ fileName);
			    
			    //17. Close the file
				outputFile.close();
			
				break;
			
			//18. Choice 3 is exit the program. 
			case EXIT:
				System.out.println("Nothing to print");
				break;
		
		}
		
	}
	
	//19. Uses a do-while loop to execute the program as long as the user doesn't enter the choice 3 which exits the program.
	while( choice!=3);
	
	scan.close();
}
	
	/**
	 * This method uses the two test 1 and test 2 arrays and calculates the average and returns the average value. 
	 * @param args A reference to two integer arrays of test 1 and test 2
	 * @return A double average value is called to the lettergrade method and is also called in the main method
	 */
	
	// Summary: This method uses the two test 1 and test 2 arrays and calculates the average and returns the average value. 
	//1. Create method that has test 1 and test 2 array in parameter of method header. 
	public static double []average(int[] test1,int[] test2) { 
		
		//2. Creates a double average array that is the length of test 1 array of 4 index places
		double[] average1= new double[test1.length];
		
		//3. Creates a for loop to execute the average value for each value in array
		for(int index = 0; index<test1.length; index++)	{
			average1[index] = (double)(test1[index] + test2[index])/(2);
		}
		//4. Returns the average value
		return average1;
	}
	
	/**
	 * This method uses the average array value from another method as a parameter and assigns a letter grade to the value and return a letter grade value. 
	 * @param args A reference to the double average array.
	 * @return A letter grade is returned to the main method that calls it.
	 */
	
	//Summary: This method uses the average value from another method as a parameter and assigns a letter grade to the value and return a grade value. 

	//1. Uses the average array as a parameter to assign letter grade.
	public static char [] lettergrade(double[] average1) { 
		
		//2. Creates a grade array that is the length of the average array.
		char [] grade11= new char[average1.length];
		//2. Creates a for loop the size of the average array to assign a letter grade based on average. 
		for(int index = 0; index<average1.length; index++) {
			if(average1[index]>=90) {
				grade11[index]= 'A'; 
			} else if(average1[index]>=80) {
				grade11[index]= 'B'; 
			} else if(average1[index]>=70) {
				grade11[index]= 'C'; 
			} else
				grade11[index]= 'F'; 
		}
		//3. Returns the grade value.
		return grade11;

	}
	
}



	

	
	
		
	
			
	
		


	



