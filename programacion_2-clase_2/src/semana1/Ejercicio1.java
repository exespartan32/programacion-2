package semana1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	String[] vector  = new String [4];
	 
		int i;
	for (i=0 ; i < vector.length; i++) {
		System.out.println("ingrese las oraciones que seran almacenados en el vector");
		vector[i] = entrada.nextLine();
		}
		System.out.println("las oraciones almacenadas en el vector son");
	for (i=0;i<vector.length;i++) {
		System.out.println(vector[i]);
	}
	}
}
