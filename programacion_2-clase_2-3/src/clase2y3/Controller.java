package clase2y3;


public class Controller {
	public static void main(String[] args) {
		
		ContactBook miCB = null;
	
	//System.out.println("considere que para guardar un contacto primero tiene que crear la libreta de contactos");
	//System.out.println("");
	
	do{		
		int conBookReceived = View.menu();
		//System.out.println(conBookReceived);
			
		if(conBookReceived == 1) {
			miCB = View.createContactBook(new ContactBook());
				System.out.println(miCB);
				System.out.println("");
			}
		else if (conBookReceived == 2) {				
			ContactBook miCon = View.addingContactBook(miCB);
				System.out.println(miCon);
				DataModel.saveCB(miCon);
				//String st_contacts = MiContact.toStringSeparador("#");		
			}
		else if (conBookReceived == 3) {
			
			
			String CBName = "unicaLibreta.txt";
			ContactBook list = DataModel.loadCB(CBName);
			View.listContactBook(list);
			System.out.println("");
			}
		}while(true);	
	
	}
}
