package clase2y3;

public class Test {

	public static void main(String[] args) {
		Contact MiContact = new Contact("exequiel", "exemay@1234", "123456", false);
		String st_contacts = MiContact.toStringSeparador("#");
		System.out.println(st_contacts);
		
		Contact MiContact1 = new Contact("dani", "exesp@1234", "332211", true);
		
		ContactBook miCB = new ContactBook();
		miCB.setName("My contact Book");
		miCB.addContact(MiContact);
		miCB.addContact(MiContact1);
		
		String st_miCB = miCB.toStringSeparador("&%&");
		System.out.println(st_miCB);
		
		String data = st_miCB;
		String nombre = "info.txt";
		GestorArchivos.guardar(nombre, data);
		
		
		
	}

}
