//package Project03;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintStream;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Stack;
//
//import Project01.ADTBagList;
//import Project01.ListException;
//import Project01.ListIndexOutOfBoundsException;
//
//
//
//public class Helper  {
//	
//	
//	public static void start() throws FileNotFoundException{
//	    //Create a stack of novels
//		Expression stack = new Expression();;
//		fillList(stack);
//		
//		stack.pop();
//		
//	    //Display them
//		displayList(stack);
//	}
//	
//	/**
//	 * Creates a list of novels.
//	 * @param list A reference to a list of data
//	 */
//	public static void fillList(Expression stack) throws FileNotFoundException{
//		//Scanner input = new Scanner(new File("./src/data/novels.txt"));
//		Scanner input = new Scanner(new File("/Users/jahnavibonagiri/eclipse-workspace/CSI 213/src/Project03/Expressions"));
//		while(input.hasNext()){
//			stack.push(input.nextLine());
//		}
//		input.close();
//	}
//	
//	/**
//	 * Displays a list of novels in order. 
//	 * @param list A reference to a list of data
//	 */
//	public static void displayList(Expression stack){
//		System.out.println("The stack has ");
//		while (!stack.isEmpty()) {
//			System.out.println(stack);
//					//.pop());
//		}
//	}
//
//}
