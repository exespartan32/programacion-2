package semana3;

public class ContactBook {
	private String nameList;

	/*public ContactBook(String nameList) {
		super();
		this.nameList = nameList;
	}
	*/
	public String getName() {
		return nameList;
	}
	public void setName(String name) {
		this.nameList = nameList;
	}
	
	public void addContact (Contact c) {
		return ;
	}
	public void delContact (Contact c) {
		return;
	}
	public boolean isTheContact (Contact c) {
		return false;
	}
	@Override
	public String toString() {
		return "the name of the contact book is:  "+ nameList;
	}
	
	
}
