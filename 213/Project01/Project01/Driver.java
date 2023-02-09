package Project01;

import java.io.FileNotFoundException;
/**
 * Tests all the methods
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class Driver {
	/**
	 * Tests all methods in the different classes and starts the helper
	 * @param args A reference to a string array that can store command-line arguments
	 * @throws ListException If size() == 0
	 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	 * @throws FileNotFoundException if a file is not found
	 */
	public static void main(String[] args) throws FileNotFoundException, ListIndexOutOfBoundsException, ListException {
		Helper.start();
	}

}
