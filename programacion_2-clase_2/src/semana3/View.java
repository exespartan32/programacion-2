package semana3;

import java.util.Scanner;

public class View {
	public static int menu() {
		int option;
		
		Scanner entry = new Scanner (System.in);
		System.out.println("ingrese alguna de las siguientes opciones");
		System.out.println("1-agregar nuevo libro de contacto");
		System.out.println("2-agregar nuevo contrato a la libreta de contacto");
		option = entry.nextInt();		
		return option;
	}
	
	public static ContactBook createContactBook(ContactBook conBook1) {
		Scanner entry1 = new Scanner (System.in);
		
		System.out.println("ingrese le nombre de la libreta de contacto");
		String newNomCon = entry1.nextLine();
		
		//ContactBook book1 = new ContactBook(newNomCon);
		System.out.println("...................................................");
		System.out.println("el nombre de la libreta de contacto "+newNomCon+" se guerdo correctamente");
		conBook1.setName(newNomCon);
		return conBook1;
	}
	
	public static ContactBook addingContactBook(ContactBook cont1) {
		Scanner entry2 = new Scanner (System.in);
		String name, mail, mob;
		int option;
		boolean topList= false;
		
		System.out.println("ingrese los datos del contacto a guardar");
		System.out.println("nombre:");
			name = entry2.nextLine();
		System.out.println("email:");
			mail = entry2.nextLine();
		System.out.println("numero de telefono:");
			mob = entry2.nextLine();
		System.out.println("¿desea guardarlo en topList?");
		System.out.println("1-si");
		System.out.println("2-no");
			option = entry2.nextInt();
		
		switch(option) {
			case 1:	
				topList = true;
				break;
			case 2:
				topList = false;
				break;
		}
	
		Contact contact1 = new Contact (name, mail, mob, topList);
		return cont1;
	}
}
