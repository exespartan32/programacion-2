package clase2y3;

public class DataModel {

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

}
