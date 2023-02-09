package Project03;
import java.util.Stack;
/**
 * Specifications on the design of operations of an stack. 
 * @author Jahnavi Bonagiri
 * @version 1.0 
 */


public interface EvaluatorInterface<E> {
	

	  /**
	   * Adds an item to the top of a stack.
	   * @param An newItem to be added
	   */
	

	 public void push(E o);
	 
	 /**
     * Removes the top of a stack.
     * @return The item that was most recently added to this stack
     * @throws StackException If the stack is empty.
     */
		   
	 public E pop() throws StackException;
	 
	 /**
	   * Returns a reference to the top item of a stack.
	   * @return A reference to the item that was added most recently or null if stack is empty
	   * @throws StackException If the stack is empty.
	   */
	 public E peek();
	 
	 /**
	   * Determines whether the stack is empty.
	   * @return A boolean value specifying if this stack is empty
	   */
	 public boolean isEmpty();
	 
	 /**
	   * Determines the size of the stack
	   * @return the size of the stack
	   */
	 
	 public int size();
	 
	 /**
     * Removes all elements from the stack
     * @throws StackException If the stack is empty.
     */
	 
	 public void popAll() throws StackException;

}

	



 



