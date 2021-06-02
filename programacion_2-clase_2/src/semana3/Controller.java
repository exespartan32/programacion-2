package semana3;

import java.util.Scanner;

public class Controller {
	public static void menu() {
		int option;
		Scanner teclado = new Scanner (System.in);
		System.out.println("ingrese alguna de las siguientes opciones");
		System.out.println("1-agregar nuevo contrato");
		option = teclado.nextInt();		

		switch(option) {
		case 1:
			System.out.println("ingrese el nuevo contacto");
			break;
		}
		
	}
}
