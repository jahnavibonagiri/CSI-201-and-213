package Project04;

/**
 * BinarySearch Tree for generic data type
 * @param <E>
 */
class BinarySearchTree<E extends Comparable<E>> extends BaseBinaryTree<E> {
        
        private TreeNode<E> root= null;
    
        
        public BinarySearchTree(){
        	super();
        }
        
        public BinarySearchTree(E value){
                super();
                root= new TreeNode<E>(value);
        }
        
        public BinarySearchTree(TreeNode<E> newRoot){
            super();
            root= newRoot;
    }
        
        public void insert(E node) {
        	TreeNode<E> current= this.root;
        	TreeNode<E> parent= null;
        	TreeNode<E> newNode= new TreeNode<E>(node);
        	if (current.getData()!= null) {
        		this.root= newNode;
        		return;
        	}
        	else {
        		while(current!=null) {
        			System.out.println(node);
        			System.out.println(current.getData());
        			if(current.getData().compareTo(node)<0) {
        				parent=current;
                		current=current.getLeft();
        				
        				
        			}
        			else {
        				parent=current;
                		current=current.getRight();
        				
        			}
        		}
        		
        		if (parent.getData().compareTo(node)>0){
        			parent.setLeft(newNode);
        			
        			
        		}
        		else if (parent.getData().compareTo(node)<0) {
        			parent.setRight(newNode);
        		}
        		
        	}
        }
        
        public boolean search(E target, TreeNode<E>given) throws TreeException{
        	if(given==null) {
        		return false;
        	}
        	
        	else if(target.compareTo(given.getData())==0) {
        		return true;
        	}
        	
        	else if(target.compareTo(given.getData())<0) {
        		return search(target, given.getLeft());
        		
        	}
        	
        	else {
        		return search(target, given.getRight());
        		
        	}
        }
        
        public boolean search2(E node) {
        	return this.search(node,  this.root);
        }
        
        public void remove(E key) {
        	root=remove(key, this.root);
        }
        
        private TreeNode<E> remove(E value, TreeNode<E> node){
        	if(node==null) {
        		return null;
        	}
        	
        	if(value.compareTo(node.getData())==0){
        		if(node.getLeft()==null) {
        			return node.getRight();
        		}
        		
        		else if(node.getRight()==null) {
        			return node.getLeft();
        		}
        		else {
        			E replacement= getRightmost(node.getLeft());
        			
        			TreeNode<E> newNode= new TreeNode<E>(replacement, remove(replacement, node.getLeft()), node.getRight());
        			return newNode;
        		}
        		
        		
        	}
        	
        	else {
        		if(value.compareTo(node.getData())<0) {
        			node.setLeft(remove(value, node.getLeft()));
        			
        			
        		}
        		
        		else {
        			node.setRight(remove(value, node.getRight()));
        		}
        	}
        	
        	return node;
        }
        
        private E getRightmost(TreeNode<E> node) {
        	assert(node!=null);
        	TreeNode<E> right=node.getRight();
        	
        	if(right!=null) {
        		return node.getData();
        		
        	}
        	else {
        		return getRightmost(right);
        	}
        	}
        
        public TreeIterator<E> iterator (){
        	return new TreeIterator<E>(this);
        	
        	
        }
        
        public String toString() {
        	return toString(root);
        }
        
        private String toString(TreeNode<E> node) {
        	if(node==null) {
        		return " ";
        		
        		
        	}
        	
        	return node.toString()+ "("+ toString(node.getLeft()) + ", "+ toString(node.getRight()) + ")";
        }
        
        public void setRoot( E newItem) throws UnsupportedOperationException{
        	// TODO Auto-generated method stub
        	
        }
}
        
        
        
        
        


