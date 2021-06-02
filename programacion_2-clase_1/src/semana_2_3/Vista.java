package semana_2_3;

import java.util.Scanner;

public class Vista {
	public static void mostrarCiudadano(Ciudadano c1 ) {
		//Ciudadano ciu1 = new Ciudadano (null, null, 0, null) ;			
		System.out.println("Nombre: "+c1.getNombre());
		System.out.println("Apellido: "+c1.getApellido());		
		System.out.println("Ciudad: "+c1.getDni());		
		System.out.println("Provinvia: "+c1.getProvincia());		
	}
	
	public static Ciudadano entregarCiudadano( ) {
		String nom;
		String ape;
		int dn;
		String prov;
		
		Scanner entrada = new Scanner (System.in);
			System.out.println("ingrese el nombre de la persona: ");
				nom = entrada.next();
			System.out.println("ingrese el apellido de la pesona: ");
				ape = entrada.next();
			System.out.println("ingrese la provincia dende recide la persona");
				prov = entrada.next();
			System.out.println("ingrese dni");
				dn = entrada.nextInt();
				
		Ciudadano ciu1 = new Ciudadano (nom, ape, dn, prov);
			/*	
			System.out.println("el nombre de la persona es: "+ciu1.getNombre());
			System.out.println("el apellido de la persona es: "+ciu1.getApellido());
			System.out.println("el dni de la persona es: "+ciu1.getDni());
			ystem.out.println("la provincia donde reside la persona es: "+ciu1.getProvincia());
				*/
			return ciu1;
	}
}
