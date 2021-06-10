package semana3;

public class Controller {
	public static void main(String[] args) {
	
	int conBookReceived = View.menu();
	System.out.println(conBookReceived);
	
	ContactBook miCB = View.createContactBook(new ContactBook());
	System.out.println(miCB);
	
	/*View.addingContactBook(null);
	*/
	
	
	}
}
