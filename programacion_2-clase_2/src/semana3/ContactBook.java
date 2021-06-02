package semana3;

public class ContactBook extends Contact{
	private String nameList;
	
	public ContactBook(String name, String email, String mobil, boolean topList, String nameList) {
		super(name, email, mobil, topList);
		this.nameList = nameList;
	}


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
}
