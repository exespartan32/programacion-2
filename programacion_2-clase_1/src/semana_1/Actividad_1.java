package semana_1;

import java.util.Scanner;

public class Actividad_1 {
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int suma;
		
			Scanner entrada = new Scanner (System.in);
				System.out.println("coloque un numero");
					numero1 = entrada.nextInt();
				System.out.println("coloque otro numero");
					numero2 = entrada.nextInt();
					
		suma = numero1 + numero2;
				System.out.println("la suma de "+numero1+" + "+numero2+" es: "+suma);
		}
}
