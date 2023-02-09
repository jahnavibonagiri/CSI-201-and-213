package Project02;

import java.util.LinkedList;


import Project01.ListException;
import Project01.ListIndexOutOfBoundsException;

import java.util.ArrayList;
/**
 * Implementations of operations a doubly-linked list.
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class LinkedString implements ListInterface {
	
	/**
	 * A reference to an array of data
	 */
	private Node head;
	
	/**
	 * The number of data in this list
	 */
	private int size;


	
	/**
	 * Creates an empty linked list.
	 */

	public LinkedString(){  //no argument constructor

        this(new char[0]);
    }
	
	/**
	 * Adds characters to the linked list.
	 * @param char array value
	 * @throws ListException if no elements are present
	 */

    public LinkedString(char[] value) throws ListException{

    	if(value.length == 0) {
    		Node node = new Node(null, null, null);
    		throw new ListException("The list is empty");
    		
       
    	}
   
        
    	else {
    		Node node = new Node(value[0], null, null);
    		this.head = node;
            size++;
            Node current = this.head;

            for(int nodeIndex = 1; nodeIndex < value.length; nodeIndex++){
                node = new Node (value[nodeIndex]);
                current.setNext(node);
                current = node;
                this.size++;
    	}    
          
        
        }

    }
    
    /**
   	 * Converts the string to a char array.
   	 * @param String data type
   	 */

    public LinkedString(String original){
    	
        this(original.toCharArray());
            
    }
    /**
   	 * Returns a character at a specific index position in list
   	 * @param int index position of character
   	 * @returns  returns a character at a specific index position in a string. 
   	 * @throws ListException if empty
   	 * @throws IndexOutOfBoundsException if out of bounds
   	 */


    public char charAt(int index) throws ListIndexOutofBoundsException, ListException{
    	if(this.length()==0) {
    		throw new ListException("The list is empty");
    			
    	}
    	
    	else if(index<0 || index>this.size) {
    		throw new IndexOutOfBoundsException("The index value must be between 0 and "+ (this.length()-1));
    	}

    	else {
        Node current = this.head;
        
        for(int nodeIndex = 0; nodeIndex < size; nodeIndex++){
        if(nodeIndex == index){
            return (char) current.getItem();
            }
        else{
            current = current.getNext();

        }
        }  
        return (char) current.getItem();
    }
    }
    /**
   	 * Concatenates the string arguments 
   	 * @param is Linked String
   	 * @returns the string arguments to the calling string and returns a new string.
   	 * @throws ListException if no elements present
   	 */

    public LinkedString concat(LinkedString str) throws ListException{
    
    		
        if(str.head == null) {
            throw new ListException("No elements present");
        }
        else if(head == null){
            size = str.length();
            throw new ListException("No elements present");
        }
     
        else{
        	char[] value= new char[size];
        	char[] value2= new char[str.length()];
        	char []value3= new char[size+str.length()];
        	
        	
        	
        	for(int nodeIndex = 0; nodeIndex < size; nodeIndex++){
        		value[nodeIndex] = this.charAt(nodeIndex);
        	   
        }
        	
        	for(int nodeIndex = 0; nodeIndex < str.length(); nodeIndex++){
        		value2[nodeIndex] = str.charAt(nodeIndex);
        	 
        }
        	
        	for(int nodeIndex = 0; nodeIndex < size; nodeIndex++){
        		value3[nodeIndex]=value[nodeIndex];
        	   
        }
        	
            for(int nodeIndex = 0; nodeIndex < str.length(); nodeIndex++){
    		   value3[nodeIndex+size]=value2[nodeIndex];
    	
    		  
    }
            return new LinkedString(value3);
            
        }
        
        }
    /**
	  * Determines whether a list is empty. 
	  * @return A boolean value specifying if this list is empty or not
	  */
        
    public boolean isEmpty(){
    	if(this.length()==0) {
    		return true;
    	}
    	else {
    		return false;
    	}

    }
    /**
	   * Returns the length of a list. 
	   * @return An integer specifying the length of a list
	   */

    public int length(){

        return this.size;
    }
    
    /**
 	 * Returns the substring of a given string. Substring is returned based on the indexes. 
 	 * @param the two Int indexes at which the substring should be derived from
 	 * @return A linked substring from 2 index positions
 	 * @throws IndexOutOfBoundsException if out of bounds
 	 */

    public LinkedString substring(int beginIndex, int endIndex)throws ListIndexOutofBoundsException{
    	
    	if(beginIndex<0 || endIndex<0) {
    		throw new IndexOutOfBoundsException ("The index value must be within bounds");
    	}

    	
    	else {

        String substr = " ";

        for(int nodeIndex = beginIndex; nodeIndex <= endIndex; nodeIndex++) {
            substr=substr+charAt(nodeIndex);
            
    }
        LinkedString linkedSubstring = new LinkedString(substr);
        return linkedSubstring;
    }
    }
    
    /**
	 * Returns a string representation of items displayed.
	 * @return A string representation of the data.
	 */
	
    
    public String toString(){
    	
        String retStr = "";

        Node current = head;
        
        for( int i = 0; i<size; i++) {
        	retStr += current.getItem();
        	current=current.getNext();
            

        }
        
        return retStr;
    }

	@Override
	public void LinkedString(String original) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LinkedString(char[] value) throws ListException {
		// TODO Auto-generated method stub
		
	}
}
