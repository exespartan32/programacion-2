package semana3;

import java.util.Scanner;

public class View {
	public static void showContact1 (Contact con1) {
		System.out.println("nombre: "+con1.getName());
		System.out.println("email: "+con1.getEmail());
		System.out.println("mobil: "+con1.getMobil());
		System.out.println("nombre: "+con1.getMobil());
				
		
	}
	
	public static Controller menu() {
		return null;
	}
	
	public static Contact showContact1() {
		Contact con1 = new Contact(null, null, null, false); 
		return con1;
	}
}
