package semana_;

public class Controller_test {
	public static void main(String[] args) {
		ContactBook miCB = new ContactBook();
        int option;
        

		System.out.println("");
		
		do{	
			option = 0;
			option = View_test.menu();
			
			if(option == 1) {
				miCB = View_test.createContactBook(new ContactBook());
				
				ContactBook miCon = View_test.createContact(miCB);
				DataModel.saveCB(miCon);
				
				
	        	//DataModel.saveCB(miCB);
	        	
				System.out.println(miCB);
				System.out.println("");
					
	        } else if (option == 2) {
	        	String[] listData = DataModel.ListCB();
	        	System.out.println("");
	        	
	           	
	           	String msg = "coloque el nombre de la libreta a la que desa agreagr el contacto (sin el .txt)";    	
	           	String name = View_test.usages(listData, msg);

	        	Contact miCon = View_test.addingContact();	        	
	        	
	        	ContactBook list = DataModel.loadCB(name);
	        	
	        	list.addContact(miCon);	
	        	DataModel.saveCB(list);
	        	
	        	System.out.println(list);
	        	
	       } else if(option == 3){
	           	String[] listData = DataModel.ListCB();
	           	System.out.println("");
	           	
	           	String msg = "coloque el nombre de la libreta que desea ver (sin el .txt)";
	           	
	           	String name = View_test.usages(listData, msg);

	           	ContactBook list = DataModel.loadCB(name);
	           	View_test.listContact(list);	
	           	
	        } else if(option == 4) {
	        	String[] listData = DataModel.ListCB();
	           	
	           	String msg = "coloque el nombre de la libreta de la libreta de la cual desea borra el contacto (sin el .txt)";
	           	String name2 = View_test.usages(listData, msg);
	
	           	ContactBook list = DataModel.loadCB(name2);
	           	View_test.listContact(list);
	           	
	           	int opt_Contact = View_test.messageOption("Ingrese el número de contacto a eliminar");
	           	list.delContact(opt_Contact);
	           	
	        	DataModel.saveCB(list);
	        }	
		}while(option != 0);
		
	}
}
