package clase2y3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		/*Contact MiContact = new Contact("exequiel", "exemay@1234", "123456", false);
		String st_contacts = MiContact.toString("#");
		System.out.println(st_contacts);
		
		Contact MiContact1 = new Contact("dani", "exesp@1234", "332211", true);
		
		ContactBook miCB = new ContactBook();
		miCB.setName("My contact Book");
		miCB.addContact(MiContact);
		miCB.addContact(MiContact1);
		
		String st_miCB = miCB.toString("&%&");
		System.out.println(st_miCB);
		
		String data = st_miCB;
		String nombre = "info.txt";
		GestorArchivos.guardar(nombre, data);*/
		
		String Datos = GestorArchivos.cargar("info2.txt");
		System.out.println(Datos);
		
		String separador2 = "#";
		
		ArrayList<String> datosAfiliado = GestorArchivos.desempaquetador(Datos, separador2);
		
		for(int j=0;j<datosAfiliado.size();j++) {
			System.out.println("--> " + datosAfiliado.get(j));		
		}
	}
}
