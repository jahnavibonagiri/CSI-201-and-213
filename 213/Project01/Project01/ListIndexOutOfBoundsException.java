package Project01;

/**
 * An Exception for when an index is out of bounds. 
 * @author Jahnavi Bonagiri
 *
 */
public class ListIndexOutOfBoundsException extends IndexOutOfBoundsException {
	
	/**
	 * Creates/displays a message
	 * @param a message being displayed. 
	 */
	public ListIndexOutOfBoundsException(String message) {
		super(message);
	}

}
