package Project04;

public class AddressBook implements ADTAddressBook {
	
	/**
	 * Address class
	 * 
	 */
			private BinarySearchTree<Contact> tree;
			int count;
			
	       public BinarySearchTree<Contact> getTree(){
	    	   return tree;
	       }
	       
	       public void setTree(BinarySearchTree<Contact> tree) {
	    	   this.tree=tree;
	       }
	       
	       public AddressBook() {
	    	   this.tree= new BinarySearchTree<Contact>();
	    	   this.count=0;
	    	   
	       }
	       
	       public AddressBook(BinarySearchTree<Contact> tree) {
	    	   this.count=0;
	    	   this.tree= new BinarySearchTree<Contact>();
	       }
	       
	       public void insert(Contact insertName) {
	    	   this.tree.insert(insertName);
	    	   this.count++;
	       }
	       
	       public void remove( Contact removeName) {
	    	   this.remove(removeName);
	    	   this.count--;
	       }
	       
	       public boolean search(Contact searchName) {
	    	   if(this.count==0) {
	    		   return false;
	    	   }
	    	   
	    	   else {
	    		   return this.tree.search2(searchName);
	    	   }
	       }
	       
	       public Contact getReference(String getName) throws TreeException{
	    	   if(this.count==0) {
	    		   throw new TreeException("List is Empty");
	    	   }
	    	   
	    	   else {
	    		   TreeIterator<Contact> iterator= tree.iterator();
	    		   while (iterator.hasNext()) {
	    			   Contact temp= iterator.next();
	    			   if(temp.gettName().equals(getName)) {
	    				   return temp;
	    			   }
	    			   
	    		   }
	    		   
	    		   return null;
	    	   }
	    	   
	       }
	       
	       public boolean isEmpty() {
	    	   if(this.count==0)
	    		   return true;
	    	   
	    	   return false;
	       }
	       
	       public void removeAll() {
	    	   tree.makeEmpty();
	       }
}
	       

