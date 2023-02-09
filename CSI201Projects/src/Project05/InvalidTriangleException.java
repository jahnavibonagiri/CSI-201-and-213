package Project05;

/**
 *Representing a Invalid Triangle subclass that extends the class Triangle
 *@author Jahnavi Bonagiri
 *@version 1.0
 */


public class InvalidTriangleException extends Exception {
	
/**
 * Creates a static final variable long
 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructs a newly created Invalid Triangle exception that has super(message).
	 * @param message. The message passed to the exception.
	 */

public InvalidTriangleException(String message) {
		
		super(message);
		 }
}
 