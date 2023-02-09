package Project02;


/**
 * Defines an exception that is thrown when an index is out of bound.
 * @author Jahnavi Bonagiri
 * @version 1.0
 */
public class ListIndexOutofBoundsException extends IndexOutOfBoundsException{
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs an object with specific message
	 * @param message A string literal specifying the details of this exception
	 */
	public ListIndexOutofBoundsException(String message) {
		super(message);
	}

}
