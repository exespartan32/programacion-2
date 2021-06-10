package semana3;

import java.util.Scanner;

public class View {
	public static int menu() {
		int option;
		
		Scanner entry = new Scanner (System.in);
		System.out.println("enter any of the following options ");
		System.out.println("1-add new contact book ");
		System.out.println("2-add new contract to contact book ");
		option = entry.nextInt();		
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
	
	public static Contact addingContactBook(Contact cont1) {
		Scanner entry2 = new Scanner (System.in);
		String name, mail, mob;
		int option;
		boolean topList= false;
		
		System.out.println("enter the contact details to save ");
		System.out.println("name:");
			name = entry2.nextLine();
		System.out.println("email:");
			mail = entry2.nextLine();
		System.out.println("phone number:");
			mob = entry2.nextLine();
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
		cont1.setName(name);
		cont1.setEmail(mail);
		cont1.setMobil(mob);
		cont1.setTopList(topList);
		
		//Contact contact1 = new Contact (name, mail, mob, topList);
		return cont1;
	}
}
