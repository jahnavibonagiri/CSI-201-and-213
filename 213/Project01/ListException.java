package Project01;

/**
 * Is an exception that is thrown when the index is out of bounds. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class ListException extends RuntimeException{
	
	/**
	 * Creates a message to be displayed when the Exception is called
	 * @param message displayed
	 */
	public ListException(String message) {
		super(message);
	}

}
