package semana3;

public class Controller {
	public static void main(String[] args) {
		
		ContactBook miCB = null;
	
		do{
		
	int conBookReceived = View.menu();
	//System.out.println(conBookReceived);
	
	
	if(conBookReceived == 1) {
		miCB = View.createContactBook(new ContactBook());
	System.out.println(miCB);
	}
	else if (conBookReceived == 2) {	
				
	ContactBook miCon = View.addingContactBook(miCB);
	System.out.println(miCon);
		
	}
		}while(true);
	}
}
