package Project04;

public class TreeNode<E> {
	/**
	 * TreeNode for Binary Search Tree
	 * @param <E>
	 */

	        
	        private E data;
	        private TreeNode<E> left;
	        private TreeNode<E> right;
	        
	        public TreeNode() {
	        	// data= null;
	        	// left=null;
	        	// right=null;
	 	       
	        	this(null, null, null);
	        	
	    
	        }
	        
	       public TreeNode(E data) {
//	    	   this.data= data;
//	    	   this.left=null;
//	    	   this.right=null;
//	    	  
	               this(data, null, null);
	        }
	       
	       public TreeNode(E data, TreeNode<E> left, TreeNode<E> right) {
	   		this.data = data;
	   		this.left = left;
	   		this.right = right;
	   	}
	        
	        public E getData() {
	        	return this.data;
	        }
	        
	        
	        void setData( E data) {
	        	this.data= data;
	        }
	        
	        public TreeNode<E> getLeft(){
	        	return this.left;
	        }
	        
	        public TreeNode<E> getRight(){
	        	return this.right;
	        }
	        
	        public void setRight(TreeNode<E> right){
	        	this.right=right;
	        	
	        }
	        
	        public void setLeft(TreeNode<E> left){
	        	this.left=left;
	        	
	        }
	        
	        
	        
	

	



}
