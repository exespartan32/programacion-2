package semana_4;

import java.util.Scanner;

public class Vector_ {
	public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);
		int valor, i, puntero = 0;
		int vector[] = new int [5];
		boolean repetido;
		
		//eliminamos los numeros repetidos
		do {
			System.out.println("ingrese el valor que sera almacenado en el vector");
			valor = entrada.nextInt();
			repetido=false;
			for(i=0;i<=vector.length-1;i++) {
				if (valor==vector[i]) {
					repetido=true;
				}
			}
			if (repetido==false) {
				vector[puntero]=valor;
				puntero=puntero+1;
			}
		}while(puntero<=vector.length-1);
		
		//ordenamos el vector
		int aux = 0;
		boolean bandera = false;
		do {
			bandera = false;
			for (i = 0;i<vector.length-1;i++) {
				if(vector[i]>vector[i+1]) {
					aux = vector[i];
					vector[i] = vector[i+1]	;
					vector[i+1] = aux;
					bandera = true;
				}
			}
		}while (bandera == true);
		
		//imprimimos el vector ordenado sin repetidos
		System.out.println("\n vector ordenado de mayor a menor sin repetidos");
		int p = 0;
		while (p<vector.length) {
			System.out.println(vector[p]);
			p++;
		}
		
		//imprimimos el vector ordenado sin mutiplos si repetidos
		System.out.println("\n vector ordenado sin multiplos de 7 sin repetidos");
		int k = 0;
		while (k<vector.length) {
			for (k = 0;k<vector.length;k++) {
				if (vector[k]%7 != 0 ) {
					System.out.println(vector [k]);
					k++;
				}
			}
		}
	}
}


