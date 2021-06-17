package semana3;

import java.util.ArrayList;

public class ContactBook {
	private String name;
	private ArrayList<Contact> contacts;
	
	public ContactBook() {
		//super();
		//this.name = name;
		contacts = new ArrayList<Contact>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addContact (Contact c) {
		contacts.add(c);
		
		return ;
	}
	public void delContact (Contact c) {
		contacts.remove(c);
		return;
	}
	public boolean isTheContact (Contact c) {
		//contacts.;
		return false;
	}
	@Override
	public String toString() {
		String tmp = null;
		for (int i=0;i<contacts.size();i++) {
			tmp = tmp+contacts.get(i).toString();
		}	
			
		return "the name of the contact book is:  "+ this.name+" "+tmp;
	
	}	
	
}
