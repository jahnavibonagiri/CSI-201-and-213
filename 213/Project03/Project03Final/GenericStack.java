package Project03;


import java.util.ArrayList;


import java.util.Scanner;

/**
 * An implementation of a stack using an ArrayList. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 */


public class GenericStack <E> implements EvaluatorInterface<E> {
	 
	 /**
	   * The ArrayList containing the items of this stack
	   */
	 private ArrayList<E> data;

	  /**
	   * Constructs a default constructor
	   */
	
	 public GenericStack(){
			this.data = new ArrayList<E>();
		}
	 
	  /**
	   * Adds an item to the top of a stack.
	   * @param An newItem to be added
	   */
	
	 public void push(E o) {
		 
			 this.data.add(0,o);

	 }
	 
	 
	 /**
     * Removes the top of a stack.
     * @return The item that was most recently added to this stack
     * @throws StackException If the stack is empty.
     */
		   
	 public E pop() throws StackException {
		 
		 
		  if (!isEmpty()) {
			  E temp= this.data.get(0);
			  this.data.remove(0);
			  return temp;
			
		    } else {
		      throw new StackException("StackException on pop and stack is empty");
		    }
	}
	 /**
     * Removes all elements from the stack
     * @throws StackException If the stack is empty.
     */
	 
	 public void popAll() throws StackException {
		 if (!isEmpty()) {
			  this.data = new ArrayList<E>();
		   
		    } else {
		      throw new StackException("StackException on pop and stack is empty");
		    }
		 
	 }
	 
	  /**
	   * Returns a reference to the top item of a stack.
	   * @return A reference to the item that was added most recently or null if stack is empty
	   * @throws StackException If the stack is empty.
	   */

	 public E peek() {
		

		 if (!isEmpty()) {
			 //return this.data.get(size()-1);
			 return this.data.get(0);
	
		    }else {
		    	throw new StackException("StackException on peek and stack is empty");
		    }
	}
	 
	 /**
	   * Determines whether the stack is empty.
	   * @return A boolean value specifying if this stack is empty
	   */
	 
	 public boolean isEmpty() {
		 return this.size()==0;
	}
	 /**
	   * Determines the size of the stack
	   * @return the size of the stack
	   */
	 
	 public int size() {
		return this.data.size();
	}

}
