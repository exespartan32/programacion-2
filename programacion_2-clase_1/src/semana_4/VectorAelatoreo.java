package semana_4;

import java.util.Random;

public class VectorAelatoreo {
  public static void main(String [] args){
	        int array_size=10;
	        int vector[] = new int[array_size];
	        int contador=0;
	 
	        //La clase random para generar los numeros aleatorios
	        Random random=new Random();
	 
	        while(contador<array_size)
	        {
	            int temp = random.nextInt(100)+1;
	            int i;
	 
	            // comprovamos si ese valor ya existe en el array
	            for (i=0;i<array_size-1;i++) {
	                if (temp==vector[i]) {
	                    break;
	                }
	            }
	            // si no se encuentra, lo añadimos al array
	            if (temp!=vector[i]) {
	                vector[contador++]=temp;
	            }
	        }
	        
	        //ordenamos el vector
			int aux = 0;
			boolean bandera = false;
			do {
				bandera = false;
				for (int i = 0;i<vector.length-1;i++) {
					if(vector[i]>vector[i+1]) {
						aux = vector[i];
						vector[i] = vector[i+1]	;
						vector[i+1] = aux;
						bandera = true;
					}
				}
			}while (bandera == true);
			
			System.out.println("\n vector ordenado de mayor a menor sin repetidos");
			int p = 0;
			while (p<vector.length) {
				System.out.println(vector[p]);
				p++;
			}
			
			System.out.println("");
			System.out.println("vector ordenado sin multiplos de 7 sin repetidos");
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



