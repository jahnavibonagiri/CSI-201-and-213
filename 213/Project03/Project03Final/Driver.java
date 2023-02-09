package Project03;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Demonstrates the use of the stack and its methods.
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class Driver {
	
	/**
	 * Tests the Stack and infix expressions.
	 * @param args A reference to a string array that can store command-line arguments\
	 * @throws IOException when there is a failure during reading, writing, and searching file or directory operations.
	 */
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
	//Prints the Postfix and its Evaluation.
	System.out.println("Infix Expression"+"       Postfix Expression "+"       Evaluation Result" );
    System.out.println("\n"+  "--------------------------------------------------------------");
    System.out.println();
    
    //Reads the file
    String file = "/Users/jahnavibonagiri/eclipse-workspace/CSI 213/src/Project03/Expressions";

    File fileName = new File(file);
    Scanner inputScan = new Scanner(fileName);

    //Reads the file in a while loop. 
    while (inputScan.hasNext())
    {
    	
    	//Tests the methods and prints the results.
        String expression = inputScan.nextLine();
        System.out.printf("%-20s", expression);
        Expression evaluator = new Expression(expression);
        System.out.printf("%-30s" , evaluator.infixtoPostfix());
        System.out.printf("%-30s" , evaluator.Evaluator());
        System.out.println();
    }
    
    //Closes the file
    inputScan.close();
}
}
	


 


