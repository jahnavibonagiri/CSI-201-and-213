package Project04;
import java.util.LinkedList;

public class TreeIterator<E> implements java.util.Iterator<E>{
	private BaseBinaryTree<E> tree;
	
	private LinkedList <TreeNode<E>> list;
	
	public TreeIterator( BaseBinaryTree<E> tree) {
		this.tree=tree;
		this.list= new  LinkedList<TreeNode<E>>();
	}
	
	public boolean hasNext() {
		return !this.list.isEmpty();
	}
	public E next() throws java.util.NoSuchElementException{
		return this.list.remove().getData();
	}
	public void remove() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public void setPreorder() {
		this.list.clear();
		this.preOrder(this.tree.root);
	}
	
	public void setInorder() {
		this.list.clear();
		this.inorder(this.tree.root);
	}
	
	private void preOrder (TreeNode<E> treeNode) {
		if(treeNode != null) {
			this.list.add(treeNode);
			preOrder(treeNode.getLeft());
			preOrder(treeNode.getRight());
			
		}
		
	}
	
	private void inorder(TreeNode<E> treeNode) {
		if(treeNode != null) {
			
			inorder(treeNode.getLeft());
			this.list.add(treeNode);
			inorder(treeNode.getRight());
			
		}
	}
	
	private void postorder(TreeNode<E> treeNode) {
		if(treeNode != null) {
			
			postorder(treeNode.getLeft());
			this.list.add(treeNode);
			postorder(treeNode.getRight());
			
		}
	}
	
}


