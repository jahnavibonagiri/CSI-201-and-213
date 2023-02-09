package Project04;

import java.io.File;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Helper {
	public static void start() throws FileNotFoundException{
		create();
	}
	
	public static void create() throws FileNotFoundException{
		Scanner input= new Scanner( new File("/Users/jahnavibonagiri/eclipse-workspace/CSI 213/src/Project04/ContactList"));
		AddressBook newBook= new AddressBook();
		while(input.hasNextLine()) {
			String read= input.nextLine();
			StringTokenizer token= new StringTokenizer( read, "\t");
			String firstName= token.nextToken();
			String lastName= token.nextToken();
			String street= token.nextToken();
			String city= token.nextToken();
			String state= token.nextToken();
			String zipcode= token.nextToken();
			String phone= token.nextToken();
			String fullName= firstName+ " " + lastName;
			Address newAddress= new Address(street, city, state, zipcode);
			Contact newContact= new Contact(fullName, newAddress, phone);
			newBook.insert(newContact);
		}
		
		input.close();
		
		TreeIterator<Contact> newBookOne= new TreeIterator<Contact>(newBook.getTree());
		newBookOne.setInorder();
		newBookOne.hasNext();
		while(newBookOne.hasNext()) {
			
		}
		
		
		
			
			
		}
	
	

}
