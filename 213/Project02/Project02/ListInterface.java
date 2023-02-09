package Project02;

import Project01.ListException;

/**
 * Specifications on the design of operations of an list. 
 * @author Jahnavi Bonagiri
 * @version 1.0 
 */

public interface ListInterface {
	/**
	 * Constructors
	 * @param char array value
	 * @throws ListException if not elements are present
	 */
	
	public void LinkedString(char[] value) throws ListException;
	 /**
   	 * Converts the string to a char array.
   	 * @param String data type
   	 */
	
	public void LinkedString(String original);
	  /**
   	 * Concatenates the string arguments to the calling string and returns a new string.
   	 * @param LinkedString
   	 * @returns the string arguments to the calling string and returns a new string.
     * @throws ListException if no elements present
   	 */

	public LinkedString concat(LinkedString str)  throws ListException;
	 /**
   	 * Returns a character at a specific index position in a string. 
   	 * @param index position of character
   	 * @returns  returns a character at a specific index position in a string. 
   	 * @throws ListException if empty
   	 * @throws IndexOutOfBoundsException if out of bounds
   	 */
	public char charAt(int index)throws ListIndexOutofBoundsException, ListException;
	 /**
	  * Determines whether a list is empty. 
	  * @return A boolean value specifying if this list is empty or not
	  */
	public boolean isEmpty();
	 /**
	   * Returns the length of a list. 
	   * @return An integer specifying the length of a list
	   */
	public int length();
	  /**
	 	 * Returns the substring of a given string. Substring is returned based on the indexes.
	 	 * @param is the two index values 
	 	 * @return A linked substring between two indexes
	 	 * @throws IndexOutOfBoundsException if out of bounds.
	 	 */

	public LinkedString substring(int beginIndex, int endIndex) throws ListIndexOutofBoundsException, ListException;
    /**
	 * Returns a string representation of items displayed.
	 * @return A string representation of the data.
	 */
	
	public String toString();



	   

}
