package semana3;

public class Controller {
	public static void main(String[] args) {
	
	int conBookReceived = View.menu();
	System.out.println(conBookReceived);
	
	
	if(conBookReceived == 1) {
		ContactBook miCB = View.createContactBook(new ContactBook());
	System.out.println(miCB);
	}
	else if (conBookReceived == 2) {
		Contact miCon = View.addingContactBook(new Contact());
	System.out.println(miCon);
		}
	}
}
