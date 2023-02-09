package Project04;



public class Contact implements java.lang.Comparable<Contact> {
	/**
	 * Contact class to store firstName, lastName address and Phone number
	 * 
	 */

	    
	    private String Name;
	    private Address address;
	    private String phoneNumber;
	        
	    /**
	     * Contact constructor
	     * set contact's firstName, lastName, address and phoneNumber
	     * 
	     * @param firstName
	     * @param lastName
	     * @param address
	     * @param phoneNumber
	     */
	        public Contact(String Name, Address address, String phoneNumber) {
	        	this.Name=Name;
	        	this.address = address;
	                this.phoneNumber = phoneNumber;
	              //  this.address = new Address();
	                
	        }

	    
	    public String gettName() {
	        return this.Name;
	    }

	   
	    public Address getAddress() {
	        return this.address;
	    }
	    public String getPhoneNumber() {
	        return this.phoneNumber;
	    }
	
	    
	    @Override
	    public int compareTo(Contact c){
	    	//TODO Auto-generated method stub
	    	return 0;
	                //return (this.getName() + this.getLastName()).compareTo(c.getFirstName() + c.getLastName());
	        }
	}



