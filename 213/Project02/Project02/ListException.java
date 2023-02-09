package Project02;

/**
 * Exception when know elements are present 
 * @author  Jahnavi Bonagiri
 * @version 1.0
 */

public class ListException extends RuntimeException{
		
		/**
		 * Constructs an object with specific message
		 * @param message A string literal specifying the details of this exception
		 */
		public ListException(String message) {
			super(message);
		}

}
