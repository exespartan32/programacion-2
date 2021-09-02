package semana_1;

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
		String tmp="";
		for (int i=0;i<contacts.size();i++) {
			tmp = tmp+contacts.get(i).toString();
		}
		if (tmp == "") {
			return "the name of the contact book is:  "+ this.name;
		}else {
			return "the name of the contact book is:  "+ this.name+" "+tmp;
		}	
	}	
	
	public String toString(String sep) {
		String st_CB="";
		for(int i =0;i<contacts.size();i++) {
			if(i==this.contacts.size()-1) {
				st_CB = st_CB + this.contacts.get(i).toString("#");
			}else {
				st_CB = st_CB + this.contacts.get(i).toString("#")+sep;
			}
		}
		return st_CB;
	}	
}
