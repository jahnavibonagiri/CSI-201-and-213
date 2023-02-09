package Project04;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Project04 {

	public static void main(String[] args) throws IOException{
		
		int choice=0;
		int[] test1= new int[4];
		int[] test2= new int[4];
		double[] average1= new double[test1.length];
		char [] grade11= new char[test1.length];
		String fileName;
		PrintWriter outputFile;

	do{

		System.out.println("Welcome to Grade Center!");
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter 1 to generate and display a grade report");
		System.out.println("Enter 2 to generate a grade report and save it into a file.");
		System.out.println("Enter 3 to quit");

		choice=Scanner.nextInt();

		final int GRADE_REPORT = 1;
		final int GRADE_REPORT_IN_FILE = 2;
		final int EXIT = 3;
	
		switch (choice){
			case GRADE_REPORT:	
				System.out.println("For Test 1,");
				
				for (int index=0; index<test1.length; index++) {
					System.out.print("Enter score " + (index+1) + ": ");
					test1[index] = Scanner.nextInt(); 
				}
					
				System.out.println("For Test 2,"); 
				for (int index=0; index<test2.length; index++) {
					System.out.print("Enter score " + (index+1) + ": "); 
					test2[index] = Scanner.nextInt();
					
			
				}
				average1= average(test1, test2);
				grade11= lettergrade(average1, test1, test2);
				
				System.out.println("\n"+"Test 1"+"\t\t"+"Test 2"+"\t\t"+"Average"+"\t\t"+"Grade");
				System.out.println("------"+"\t\t"+"------"+"\t\t"+"-------"+"\t\t"+"------");
				for(int index=0; index<test1.length; index++) {
					System.out.println(test1[index]+ "\t\t" +test2[index]+ "\t\t"+ average1[index]+"\t\t"+grade11[index]);

				}
				break;
			case GRADE_REPORT_IN_FILE:
				
				
				for (int index=0; index<test1.length; index++) {
					System.out.print("Enter score " + (index+1) + ": ");
					test1[index] = Scanner.nextInt(); 
				}
					
				System.out.println("For Test 2,"); 
				for (int index=0; index<test2.length; index++) {
					System.out.print("Enter score " + (index+1) + ": "); 
					test2[index] = Scanner.nextInt();
					
			
				}
				average1= average(test1, test2);
				grade11= lettergrade(average1, test1, test2);
				
				System.out.println("\n"+"Test 1"+"\t\t"+"Test 2"+"\t\t"+"Average"+"\t\t"+"Grade");
				System.out.println("------"+"\t\t"+"------"+"\t\t"+"-------"+"\t\t"+"------");
				for(int index=0; index<test1.length; index++) {
					System.out.println(test1[index]+ "\t\t" +test2[index]+ "\t\t"+ average1[index]+"\t\t"+grade11[index]);

				}
				
				System.out.print("Enter the filename: ");
				Scanner.nextLine();
			    fileName = Scanner.nextLine();
			    
			    // Open the file.
			    File file = new File(fileName);
			      if (file.exists()){
			         System.out.println("The file " + fileName + " already exists.");
			         System.exit(0);
			      }
		
			    outputFile = new PrintWriter(fileName);

			      // Get data and write it to the file.
				outputFile.println("\n"+"Test 1"+"\t\t"+"Test 2"+"\t\t"+"Average"+"\t\t"+"Grade");
				outputFile.println("------"+"\t\t"+"------"+"\t\t"+"-------"+"\t\t"+"------");
			    for(int index=0; index<test1.length; index++) {
					outputFile.println(test1[index]+ "\t\t" +test2[index]+ "\t\t"+ average1[index]+"\t\t"+grade11[index]);
			    
			      }
				outputFile.close();
			
				break;
			
			case EXIT:
				System.out.println("Nothing to print");
				break;
		
		}
		Scanner.close();
	}
	while( choice!=3);
	}
	

				
	public static double []average(int[] test1,int[] test2) { 
		double[] average1= new double[test1.length];
		for(int index = 0; index<test1.length; index++)	{
			average1[index] = (test1[index] + test2[index])/(2);
		}
		
		return average1;
	}
	public static char [] lettergrade(double[] average1, int [] test1, int []test2) {
		char [] grade11= new char[test1.length];
		for(int index = 0; index<test1.length; index++) {
			if(average1[index]>=90) {
				grade11[index]= 'A'; 
			} else if(average1[index]>=80) {
				grade11[index]= 'B'; 
			} else if(average1[index]>=70) {
				grade11[index]= 'C'; 
			} else
				grade11[index]= 'F'; 
		}
		return grade11;

	}
	
}



	

	
	
		
	
			
	
		


	



