package Project01;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Contains helper methods for the ADTBagList 
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class Helper {

	 /**
		 * Tests all methods in the different classes. 
		 * @param args A reference to a string array that can store command-line arguments
		 * @throws ListException If size() == 0
		 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
		 * @throws FileNotFoundException if a file is not found
		 */
	
public static void start()throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
	
	 /**
	  * Creates a list of items and displays them in the output. 
	  */ 
	ADTBagList things= new ADTBagList();

	//creates a list
    create(things);
    //calls the size method
    things.size();  
    //displays the items in list
    display(things);
    System.out.println();
    
    //calls the removeLast method
    things.removeLast();//calls removeLast() in bagItems class
    //displays the items after item is removed
    display(things);    
    System.out.println();

    //calls the removeRandom method 
    things.removeRandom();//calls removeRandom() in bagItems class
    //displays the remaining items once item is removed
    display(things);     
    System.out.println();

    //calls isEmpty and makeEmpty methods to empty the bag
    things.isEmpty();    
    things.makeEmpty();  

}

/**
 * Creates a list of items and reads the items in list.
 * @param lists a reference to a list of items in the ADTBagList
 * @throws ListException If size() == 0
 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
 * @throws FileNotFoundException if a file is not found
 */

private static void create(ADTBagList items) throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
	
	/**
	 * Variables Scanner input declared and reads the file with list.
	 */
    Scanner input = new Scanner(new File("/Users/jahnavibonagiri/eclipse-workspace/CSI 213/src/Project01/datalist.txt")); 

    //Reads file contents
  
    while(input.hasNext()){
        items.insert(input.next()); 
    }
    
    //Closes the scanner
    input.close();
}

/**
 * Displays a list of items in ADT Bag
 * @param lists a reference to a list of items in the ADTBagList
 * @throws ListException If size() == 0
 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
 */

private static void display(ADTBagList items) throws ListIndexOutOfBoundsException, ListException{
    for(int i = 0; i < items.size(); i++){
        System.out.println(items.getIndex(i));
    }
}

  

}

