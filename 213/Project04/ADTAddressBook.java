package Project04;

public interface ADTAddressBook {
	
	public void insert(Contact insertName);
	public void remove( Contact removeName);
	public boolean search(Contact searchName) ;
	public Contact getReference(String getName) throws TreeException;
	public boolean isEmpty();
	public void removeAll() ;
	
	
	
	
	
	

}
