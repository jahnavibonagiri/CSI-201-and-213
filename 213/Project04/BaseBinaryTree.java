package Project04;

public abstract class BaseBinaryTree<E> {
	protected TreeNode<E> root;
	
	
	public BaseBinaryTree() {
		this(null);
	}
	
	public BaseBinaryTree( E rootItem) {
		this.root= new TreeNode<E> (rootItem, null, null);

	}
	
	public boolean isEmpty() {
		return this.root==null;
	}
	
	public void makeEmpty() {
		this.root=null;
	}
	
	public E getRoot() throws TreeException{
		if(this.root==null) {
			throw new TreeException("TreeException: Empty Tree");
			
		}
		else {
			return this.root.getData();
		}
		
		
	}

	  /**
	   * Changes the root element of this binary tree. An UnsupportedOperationException object is 
	   * thrown if operation is not supported.
	   * @param newItem A reference to the new root
	   * @throws  UnsupportedOperationException if operation is not supported.
	   */
	  public abstract void setRoot(E newItem) throws UnsupportedOperationException;
	
	
	
	

}
