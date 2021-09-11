package semana_;

import java.util.ArrayList;

public class DataModel {

	
	public static void saveCB(ContactBook sCB) {
		String dataContact = sCB.toString("&%&");
		String nombre = sCB.getName()+".txt";
		
		String data = dataContact;
		GestorArchivos.guardar(nombre, data);
		
	}
	
	public static String[] ListCB() {
		String[] list = GestorArchivos.exists();
		return list;	
	}

	public static ContactBook loadCB(String strin_CBName) {
		String Datos = GestorArchivos.cargar(strin_CBName);		
		String separador2 = "&%&";
		
		String[] contact = Datos.split(separador2);
		
		ContactBook listCB = new ContactBook();	
		
		for(int i=0;i<contact.length;i++) {
			//System.out.println(i+"-->"+contact[i]+"<--"+i);
				String[] list = contact[i].split("#");
				Contact conlis = new Contact(list[0], list[1], list[2], Boolean.parseBoolean(list[3]));	
				listCB.addContact(conlis);
		}
		return listCB;
	}
	


}
