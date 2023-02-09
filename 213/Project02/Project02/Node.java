package Project02;
/**
 * Represents a node in a linked list.
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class Node {
	
	/**
	 * The link to next node
	 */
	Node next;
	/**
	 * The link to previous node
	 */
	Node previous;
	/**
	 * The element of this node
	 */
	Object element;
	/**
	 * The item of this node
	 */
	Object item;
	/**
	 * Constructs a node with an element, a link to next node and a link to the previous node.
	 * @param element A reference to the element of this node
	 */

    public Node(Object newItem, Node n, Node p) {
    	
        setItem(newItem);
        setNext(n);
        setPrevious(p);
        this.element=element;
        this.next=n;
    }
    /**
	 * Constructs a node with an newItem and link to a null node.
	 * @param element A reference to the element of this node
	 */
   
    public Node(Object newItem) {
        this(newItem, null, null);
    }
    /**
   	 * Constructs a default node.
   	 */
    public Node() {
        this(null, null, null);
    }
    /**
	 * Changes the element of this node.
	 * @param A reference to an newItem
	 */
    
    public void setItem(Object newItem) {
        this.item = newItem;
    }
    /**
	 * Changes the next reference of this node
	 * @param next A reference to the next node of this node
	 */
    
    public void setNext(Node newNext) {
        this.next =newNext;
    }
    /**
	 * Returns the element of this node.
	 * @return The element of this node
	 */
    public Object getItem() {
    	Object data = this.item;
        return data;
    }
    /**
	 * Returns the next reference of this node.
	 * @return A reference to the next node of this node
	 */
    public Node getNext() {
        return this.next;
    }
    /**
	 * Returns the previous reference of this node.
	 * @return A reference to the previous node of this node
	 */
   
    public Node getPrevious() {
        return this.previous;
    }
    /**
	 * Changes the previous reference of this node
	 * @param A reference to the previous node of this node
	 */
    
    public void setPrevious(Node newPrevious) {
    	this.previous=newPrevious;
        
    }
    
    /**
	 * Returns if the node is empty or not.
	 * @return a boolean value determining if node is empty or not.
	 */
    public boolean equals(Object value) {
    	if(value==item) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    /**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
    public String toString() {
    	
       
        return (String)item;
    	
    }    
}
