package clase2y3;

import java.util.ArrayList;

public class DataModel {

	
	public static void saveCB(ContactBook sCB) {
		String dataContact = sCB.toString("&%&");
		String nombre = sCB.getName()+".txt";
		
		String data = dataContact;
		GestorArchivos.guardar(nombre, data);
		
	}
	
	public static void loadCB(String strin_CBName) {
		String nombre = strin_CBName;		
		String Datos = GestorArchivos.cargar(nombre);		
		String separador2 = "#";
		
		ArrayList<String> datosAfiliado = GestorArchivos.desempaquetador(Datos, separador2);
		
		for(int i=0;i<datosAfiliado.size();i++) {
			System.out.println("--> " + datosAfiliado.get(i));		
		}
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
