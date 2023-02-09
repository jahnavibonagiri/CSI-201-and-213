package Project01;
import java.lang.Object;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * Different methods that perform different operations on the ADT Bag List implementing the List Interface where the methos are listed.. 
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class ADTBagList implements ListInterface{
	
		//Declare Variables of max capacity which is can hold up to 100 items in list, rand  and the count
	
	   private static Random rand = new Random();
	   private final int CAPACITY = 100;
	   private int count;  
	   
	   /**
	    * Refers to an Array of data called bag
	    */
	   private Object[] bag;
	   
	   /**
	    * Constructs the ADT Bag so it can hold up to 100 grocery list items. 
	    */
	   
	   public ADTBagList()
	   
	   {
	      this.count = 0;
	      this.bag = new Object[CAPACITY];
	   }
	   
	   /**
	    * Inserts a list of items into the ADT Bag List and has multiple exceptions thrown if it is out of bounds.
	    * @param items that are added to the bag
	    * @throws ListIndexOutOfBoundsException if index < 0 or index > size()
	    
	    */
	   
	   public void insert (Object item) throws ListIndexOutOfBoundsException
	   {
	      if (this.count <= this.bag.length) {
	    	  this.bag[this.count] = item;
		      System.out.println(item+ " was added to the bag");
		      this.count++;
	      }
	   		else if(this.size() < 0 || this.size() > this.bag.length){
           throw new ListIndexOutOfBoundsException("The count value must be between 0 and " +this.count);
	   		}
	   }
	      
	   /**
	    * Removes a random item from the ADT bag and displays that a random item was removed. 
	    * @throws ListIndexOutOfBoundsException if index < 0 or index > size()
	    * @throws ListException if size() is 0
	    */
	   
	   public void removeRandom() throws ListIndexOutOfBoundsException, ListException
	   {

		  int rand= (int)(Math.random()*count);
		  
	      if (this.count==0) {
	    	  throw new ListException("The list is empty");
	     
	      }else if(this.count< 0 || this.count > this.bag.length){
	           throw new ListIndexOutOfBoundsException("The count value must be between 0 and " +this.count);
	      } else{
	        	   System.out.println("This random item was removed: " +this.bag[rand]);  
	        
	   
	      }
	      
	      	Object box= this.bag[rand];
	      	this.bag[rand]=this.bag[count-1];
	      	this.bag[count-1]= box;
	        this.removeLast();
	   }
	    

	   /**
	    * Returns the length of the ADT Bag List
	    * @Return an integer that specifies the length of a list
	    */
	   public int size() {
		   return this.count;
	   }
	   
	   /**
	    * Removes a the last item from the ADT bag and displays that the last item was removed. 
	    * @throws ListIndexOutOfBoundsException if index < 0 or index > size()
	    * @throws ListException if size() is 0
	    */
	   
	   public void removeLast()throws ListIndexOutOfBoundsException, ListException{
		      
		
			if(this.count==0)
			{
				throw new ListException("List is empty, no elements can be removed");
			}
			else if (this.count< 0 || this.size() > this.bag.length){
	            throw new ListIndexOutOfBoundsException("The count value must be between 0 and " +this.count);
	        }else {
	        	
	    
					this.bag[size()-1]=null;
					this.count--;
					
	       
	            System.out.println("Last item was removed");
	        }

		
	        System.out.println("Here is the number of items left in the bag: "+this.count);
	   }



			
	   /**
	    * Determines if the ADT Bag List is empty or not.
	    * @Return a boolean value determining if the list is empty or not. 
	    */
	   
	   public boolean isEmpty() {
		   
		   if (this.count==0){
	            System.out.println("This bag is empty");
	            return true;
	        }
	        return false;
	   }
	   
	   /**
	    * Makes the bag empty and displays that the bag is now empty
	    */
	   
	   
	   public void makeEmpty()
	   
	   {
		  
	      this.bag = new String[CAPACITY];
	      this.count = 0;
	      System.out.println("Bag is empty");
	   }
	   
	   /**
	    * Returns a Object item at a index value.
	    * @param an integer called index that specifies the position of the item.
	    * @throws ListIndexOutOfBoundsException if count < 0 or count > size()
	    * @throws ListException  if size() is 0

	    */
	   
	   public Object getIndex(int index) throws ListIndexOutOfBoundsException, ListException{
			  if(this.count== 0){
				  throw new ListException("The list is empty, no elements can be removed");
			  }else if(index < 0 || index > this.count){
				  throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (count-1));
			  }else{
				  return this.bag[index];
			  }
			  
		  }

	   /** Get a reference to an Object item's first appearance in the bag.
	    * @param an Object called item in the bag.
	    * @throws ListException  if size() is 0
	    * @throws ListIndexOutofBoundsException
	    */
	   
	   public int getReference(Object item) throws ListIndexOutOfBoundsException, ListException {
		   
		
	       if(this.count == 0){
	           throw new ListException("The list is empty");
	       }else {
		   for (int i=0; i<= this.size(); i++) 
		   {
			   try {
				   if(this.bag[i].equals(item)) 
				   return i; 
			   }
			  	catch(NullPointerException e) {
			  		
			  	}
		   }

		   throw new ListException("Item not found");
}
	   }
}
	   
	   		

