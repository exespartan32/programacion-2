package semana1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//declaramos los vectores y variabeles a utilizar
		String user1, user2, user3, user4, pass1, pass2, pass3, pass4,  usuarios, contraseņas;
		String user[] = {"daiana", "facundo", "osvaldo", "melina"}; 
		int pass[] = new int [4];
		pass[0]=1234;
		pass[1]=4321;
		pass[2]=1122;
		pass[3]=3344;
	
		//ingresamos los usuarios
		System.out.println("por faver ingrese el primer usuario usuario");
			user1 = teclado.next();
		System.out.println("porfavor ingrese la primer contraseņa");
			pass1 = teclado.next();
			
		System.out.println("por faver ingrese el segundo usuario usuario");
			user2 = teclado.next();
		System.out.println("porfavor ingrese la segunda contraseņa");
			pass2 = teclado.next();
			
		System.out.println("por faver ingrese el tercer usuario usuario");
			user3 = teclado.next();
		System.out.println("porfavor ingrese la tercer contraseņa");
			pass3 = teclado.next();
			
		System.out.println("por faver ingrese el cuarto usuario usuario");
			user4 = teclado.next();
		System.out.println("porfavor ingrese la cuarta contraseņa");
			pass4 = teclado.next();
			
		String contraseņa1 = String.valueOf(pass[0]);
		String contraseņa2 = String.valueOf(pass[1]);
		String contraseņa3 = String.valueOf(pass[2]);
		String contraseņa4 = String.valueOf(pass[3]);
		
		//comprobamos todos los usuarios
		if((user1.equals(user[0]))&&(user2.equals(user[1]))&&(user3.equals(user[2]))
				&&(user4.equals(user[3]))&&(pass1.equals(contraseņa1))&&(pass2.equals(contraseņa2))
				&&(pass3.equals(contraseņa3))&&(pass4.equals(contraseņa4))) {
			System.out.println("todos los usuarios ingresaron correctamente");
			System.out.println("----------bienvenido al sistema----------");
		}
		//comprobamos el primer usuario
		else if (user1!=user[0]&&pass1!=contraseņa1){
			System.out.println("usuario y contraseņa del primer usuario incorrectos");
		}else if(user1!=user[0]) {
			System.out.println("el nombre del primer usuario es incorrecto");
		}else if (pass1!=contraseņa1) {
			System.out.println("la contraseņa del primer usuario es incorrecta");
		}
		//comprobamos el segundo usuario
		else if ((user2!=user[1])&&(pass2!=contraseņa2)){
			System.out.println("usuario y contraseņa del segundo usuario incorrectos");
		}else if(user2!=user[1]) {
			System.out.println("el nombre del segundo usuario es incorrecto");
		}else if (pass2!=contraseņa2) {
			System.out.println("la contraseņa del segundo usuario es incorrecta");
		}
		//comprobamos el tercer usuario
		else if ((user3!=user[2])&&(pass3!=contraseņa3)){
			System.out.println("usuario y contraseņa del segundo usuario incorrectos");
		}else if(user3!=user[2]) {
			System.out.println("el nombre del tercer usuario es incorrecto");
		}else if (pass3!=contraseņa3) {
			System.out.println("la contraseņa del tercer usuario es incorrecta");
		}
		//comprobamos el cuarto usuario
		else if ((user4!=user[4])&&(pass4!=contraseņa4)){
			System.out.println("usuario y contraseņa del cuarto usuario incorrectos");
		}else if(user4!=user[3]) {
			System.out.println("el nombre del cuarto usuario es incorrecto");
		}else if (pass4!=contraseņa4) {
			System.out.println("la contraseņa del cuarto usuario es incorrecta");
		}
	}
}
