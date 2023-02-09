package Project05;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Tests Shape, Rectangle, Circle, Triangle, and Exception class. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class Helper{
	
	/**
	 * Variables Scanner in and Scanner input declared
	 */
	private static Scanner in;
	private static Scanner input1;


	/**
	 * Creates a list of Shapes, and creates them in order. 
	 * @param arg A reference to a string array containing command-line arguments
	 */
	public static void start() throws FileNotFoundException{
		//Create a list of Shapes

		ArrayList<Shape> shapes= new ArrayList<Shape>();
		//Create shapes

		create(shapes);
		//Display shapes

		display(shapes);

	}

	/**
	 * Creates a list of Shapes and reads from a file with the data values
	 * @param lists a reference to a list of Shapes
	 */
	public static void create(ArrayList<Shape> shapes) throws FileNotFoundException {


		//Declares all variables
		double length1=0;
		double width1=0;
		double radius1=0;
		double side1=0;
		double side2=0;
		double side3=0;
		File file;
		String search, name, length, width, input, radius, sideOne, sideTwo, sideThree;

		//Reads the file name
		in = new Scanner(System.in);
		System.out.println("What is the filename you want to read?");
		input = in.nextLine();
		file = new File(input);

		input1 = new Scanner(file);

		//Reads file contents
		while(input1.hasNext()) {
			search = input1.nextLine();
			//Searches for Rectangle Shape and reads its following information
			if (search.equalsIgnoreCase("Rectangle")) {
			
				name = input1.nextLine();
				length= input1.nextLine();
				width = input1.nextLine();

				//Converts length and width to a double
				length1 = Double.parseDouble(length);
				width1 = Double.parseDouble(width);

				//Sends information to Rectangle constructor
				shapes.add(new Rectangle(width1, length1, name));
	


			} 
			
			//Searches for Circle and reads its following information
			else if (search.equalsIgnoreCase("Circle")) {
			
				name = input1.nextLine();
				radius= input1.nextLine();
			
				//Converts radius to a double
				radius1 = Double.parseDouble(radius);
				
				//Sends information to Circle constructor
				shapes.add(new Circle(radius1, name));
	
			}
			
			//Searches for the Triangle and reads its following information 
			else if (search.equalsIgnoreCase("Triangle")) {
			
				name = input1.nextLine();
				sideOne= input1.nextLine();
				sideTwo= input1.nextLine();
				sideThree= input1.nextLine();

				//Converts the sides to a double
				side1 = Double.parseDouble(sideOne);
				side2 = Double.parseDouble(sideTwo);
				side3 = Double.parseDouble(sideThree);
				
				//Sends information to the Triangle constructor

				shapes.add(new Triangle(side1, side2, side3, name));
			}
			
		}

	}

	/**
	 * Displays a list of Shapes.
	 * @param lists A reference to a list of Shapes
	 */

	public static void display(ArrayList<Shape> shapes) {
		System.out.println("The list of Shapes:"+"\n");

		for (int i=0;i<shapes.size(); i++) {
		
			System.out.println(shapes.get(i));
			System.out.println();

		}
		System.out.println();
	}
	
}





