package clase2y3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	public static int menu() {
		int option = 0;
		
	try {
		Scanner entry = new Scanner (System.in);
		System.out.println("enter any of the following options ");
		System.out.println("1-add new contact book ");
		System.out.println("2-add new contract to contact book ");
		System.out.println("3-list Contact Book");
		option = entry.nextInt();
				
		} catch (InputMismatchException e) {
			System.out.println("error");
			System.out.println("usted a colocado una letra");
			System.out.println("¡debe colocar un numero¡");
		}		
		return option;
	}
	
	public static ContactBook createContactBook(ContactBook conBook1) {
		Scanner entry1 = new Scanner (System.in);
		
	
		System.out.println("enter the name of the contact book ");
		String newNomCon = entry1.nextLine();
		
		//ContactBook book1 = new ContactBook(newNomCon);
		System.out.println("...................................................");
		System.out.println("the name of the contact book  "+newNomCon+" it was plump correctly ");
		conBook1.setName(newNomCon);
		
			
		return conBook1;
	
	}
	
	public static ContactBook addingContactBook(ContactBook cont1) {
		
		//ArrayList contacts = new ArrayList();	
		
		Scanner entry2 = new Scanner (System.in);
		String name, mail, mob;
		int option = 0;
		boolean topList= false;
		
		System.out.println("enter the contact details to save ");
		System.out.println("name:");
			name = entry2.nextLine();
		System.out.println("email:");
			mail = entry2.nextLine();
		System.out.println("phone number:");
			mob = entry2.nextLine();
			
			try {
		System.out.println("Do you want to save it to topList? ");
		System.out.println("1-yes");
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
				} catch (InputMismatchException|NullPointerException e) {
					System.out.println("error");
					System.out.println("usted a colocado una letra");
					System.out.println("¡debe colocar un numero¡");
				}
		
		
		
		Contact contact1 = new Contact(name, mail, mob, topList);
		//contact1.setName(name);
		//contact1.setEmail(mail);
		//contact1.setMobil(mob);
		//contact1.setTopList(topList);
		
		//contacts.add(contact1);
		try {
		cont1.addContact(contact1);
		
		
		}catch(NullPointerException e) {
			System.out.println("!error!");
			System.out.println("primero debe crear la libreta de contacto para poder guarar el contacto");
		}
		return cont1;
	}
	public static ContactBook listContactBook(ContactBook saveCont) {
		return null;
	}
}
