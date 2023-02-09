package Project01;

/**
 * The ListInterface for the ADTBagList class that contains all the methods used. 
 * @author Jahnavi Bonagiri
 * @version 1.0 
 */

public interface ListInterface {
	
	/**
	 * Determines if the ADTBagList is empty or not
	 * @return a boolean value saying if it is empty or not. 
	 */

	  public boolean isEmpty();
	  
	  /**
		* Makes the bag empty
		*/
	  
	  public void makeEmpty();
	  
	  
	  /**
	    * Removes a random item from the ADT bag and displays that a random item was removed. 
	    * @throws ListIndexOutOfBoundsException if index < 0 or index > size()
	    * @throws ListException if size() is 0
	    */
	  
	  public void removeRandom() throws ListIndexOutOfBoundsException, ListException;
	  
	  /**
	    * Returns the length of the ADT Bag List
	    * @Return an integer that specifies the length of a list
	    */
	  public int size();	  
	 
	  /**
	    * Removes a the last item from the ADT bag and displays that the last item was removed. 
	    * @throws ListIndexOutOfBoundsException if index < 0 or index > size()
	    * @throws ListException if size() is 0
	    */
	
	  public void removeLast()throws ListIndexOutOfBoundsException, ListException;
	  

	  /**
	    * Returns a Object item at a index value.
	    * @param an integer called index that specifies the position of the item.
	    * @throws ListIndexOutOfBoundsException if count < 0 or count > size()
	    * @throws ListException  if size() is 0

	    */
	   
	  public Object getIndex(int index) throws ListIndexOutOfBoundsException, ListException;
	  
	  /** Get a reference to an Object item's first appearance in the bag.
	    * @param an Object called item in the bag.
	    * @throws ListException  if size() is 0
	    */
	  
	  public int getReference(Object item) throws ListIndexOutOfBoundsException, ListException;

	  
	  /**
	    * Inserts a list of items into the ADT Bag List and has multiple exceptions thrown if it is out of bounds.
	    * @param items that are added to the bag
	    * @throws ListIndexOutOfBoundsException
	    * @throws ListException
	    */
	  
	  public void insert (Object item) throws ListIndexOutOfBoundsException;
	  
	} 
