package Project02;

import java.util.Scanner;

import Project01.ListException;

import java.lang.Iterable;
import java.util.LinkedList;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
/**
 * Helper class for the driver program. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 */



public class Helper {
	
	/**
	 * Tests the array based list.
	 * @throws ListException if length()==0
	 * @throws ListIndexOutofBoundsIf Index,0 or index>length()
	 * @throws FileNotFoundException if a file not found
	 */
		public static void start() throws FileNotFoundException, ListException{
			
			ArrayList<LinkedString> arr=new ArrayList<LinkedString>();
			//Create 
			fillList(arr);
			//Display
			displayList(arr);
			
		}
		
		/**
		 * Creates a list of charges.
		 * @param array A reference to a list of data
		 * @throws ListException if length()==0
		 * @throws FileNotFoundException if a file not found
		 * @throws ListIndexOutofBoundsIf Index,0 or index>length()
		 */
		private static void fillList(ArrayList<LinkedString> arr) throws FileNotFoundException, ListException{
			Scanner input = new Scanner(new File("/Users/jahnavibonagiri/eclipse-workspace/CSI 213/src/Project02/datalist.txt"));

			//Takes in input as a string
			while(input.hasNext()) {
				String str= input.nextLine();
				LinkedString temp = new LinkedString(str);
				
				arr.add(temp);
				
			}
			//Takes in input as a char and adds it to the array
			while(input.hasNext()) {
				char [] list1= input.nextLine().toCharArray();
				LinkedString temp2 = new LinkedString(list1);
				arr.add(temp2);
				
			}
			
		
			input.close();
		}
		/**
		 * Displays data in order. 
		 * @param an ArrayList of names
		 * @throws ListException if length()==0
		 * @throws ListIndexOutofBoundsIf Index,0 or index>length()
		 */
		

		private static void displayList(ArrayList<LinkedString> arr)throws ListException, IndexOutOfBoundsException {
			
			
			
		LinkedString conCat= new LinkedString("hello");

		for(LinkedString x: arr) {

		
			LinkedString value = arr.get(0);
			LinkedString value1 = arr.get(1);
			LinkedString value3= value.concat(value1);
			char value4= value.charAt(0);
			int value5= value.length();
			LinkedString value6= value.substring(0, value5-1);
			System.out.println(x);
			System.out.println("Is this list empty? " + x.isEmpty());
			System.out.println("The length of this data element is "+ x.length());
			int i= (int)(Math.random()*x.length());
			System.out.println("The character at index "+ i+ " is " + x.charAt(i));
			System.out.println(x+ " says "+x.concat(conCat));
			System.out.println("0 Substring to "+i+x.substring(0,i));
			System.out.println("Length "+ x.length());
			System.out.println();
			
		}
					
			}
			 
			}




