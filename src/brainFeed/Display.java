package brainFeed;

import java.util.ArrayList;

public class Display {

	public static void main(String[] args) {
		Contact newContact = new Contact("Anthony Gathogo", "105 Plano", "Tony@yahoo.com", "3245654");
		newContact.singleContact();
		
		 showALLContacts();
		
		
	}
	static  ArrayList<Contact> showALLContacts() {
		System.out.println("ALL THE CONTACTS\n");
		ArrayList<Contact> contact = new ArrayList<>();
		contact.add(new Contact("Michael Gathogo", "105 london", "me@yahoo.com", "3245654"));
		contact.add(new Contact("John Njenga", "9 Kiambu", "jo@yahoo.com", "3245654"));
		contact.add(new Contact("Anthony Gathogo", "105 Plano", "Tony@yahoo.com", "3245654"));
		contact.add(new Contact("Catherine Wanjiku", "19 Kutus", "cath@yahoo.com", "3245654"));
		contact.add(new Contact("Michael Gathogo", "105 london", "me@yahoo.com", "3245654"));
		contact.stream().forEach(System.out::println);
		return contact;
		
	}

}
