package semana3;

import java.util.Scanner;

public class Controller {
	public static void menu() {
		int option;
		String newNomCon;
		Scanner entry = new Scanner (System.in);
		System.out.println("ingrese alguna de las siguientes opciones");
		System.out.println("1-agregar nuevo libro de contacto");
		System.out.println("2-agregar nuevo contrato a la libreta de contacto");
		option = entry.nextInt();		

		switch(option) {
		case 1:		
			System.out.println("ingrese le nombre de la libreta de contacto");
			newNomCon = entry.nextLine();
			
			ContactBook book1 = new ContactBook(newNomCon);
			System.out.println("...................................................");
			System.out.println("el nombre de la libreta de contacto: "+newNomCon+" se guerdo correctamente");
		}
	}
}
