package clase2y3;

import java.util.ArrayList;

public class DataModel {

	
	public static void saveCB(ContactBook sCB) {
		String dataContact = sCB.toString("&%&");
		String nombre = sCB.getName()+".txt";
		
		String data = dataContact;
		GestorArchivos.guardar(nombre, data);
		
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
	
	public static ArrayList<String> listCB(){
		
		return null;		
	}
	
	
	/*
	public static void main(String[] args) {
		
		Contact MiContact = ;
		String st_contacts = MiContact.toStringSeparador("#");
		System.out.println(st_contacts);
		
		ContactBook miCB = ;
		String st_miCB = miCB.toStringSeparador("&%&");
		System.out.println(st_miCB);
		
		String data = st_miCB;
		String nombre = "info.txt";
		GestorArchivos.guardar(nombre, data);
	}
	*/

}
