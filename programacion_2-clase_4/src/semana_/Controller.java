package semana_;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		
		ContactBook miCB = null;
		int conBookReceived;
	
		String[] listData = DataModel.ListCB();
		System.out.println("");
	
	do{		
				
		//DataModel.ListCB();	
		
		conBookReceived = 0;
		System.out.println("");
		conBookReceived = View.menu();
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
				
			String name = View.listContactBook(listData);
			
			ContactBook list = DataModel.loadCB(name);
			View.listContact(list);		
		}
		}while(conBookReceived != 0);		
	}
}
