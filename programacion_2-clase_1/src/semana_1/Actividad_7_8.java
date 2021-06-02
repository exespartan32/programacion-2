package semana_1;

import java.util.Scanner;

public class Actividad_7_8 {
	public static void main(String[] args) {
		String user;
		String pass;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("por faver ingrese el usuario");
			user = teclado.next();
		System.out.println("porfavor ingrese la contraseña");
			pass = teclado.next();
			
		String usuario = "enzo";
		String contraseña = "4321";
		
		if((user.equals(usuario))&(pass.equals(contraseña))){
			System.out.println("bienvenido al sistema");
			System.out.println("si desea cambiar los datos coloque alguna de las siguientes opcioenes");
			System.out.println("1-cambiar nombre de usuario");
			System.out.println("2-cambiar contraseña de usuario");
			System.out.println("3-no realizar cambios");
			int opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("ingrese la contraseña actual");
					pass = teclado.next();
				System.out.println("ingrese la nueva contraseña");
					String newPass = teclado.next();
				System.out.println(".......................................");
				System.out.println("contraseña cambiada correctamente por "+newPass);
				break;
			case 2:
				System.out.println("ingrese el nombre de ususario acual");
					user = teclado.next();
				System.out.println("ingres el nuevo nombre de usuario");
					String newUser = teclado.next();
				System.out.println("nombre de usuario cambiada correctamente por "+newUser);
				break;
			default:
				System.out.println("gracias por su tiempo");
			}

		}else if((user.equals("Enzo"))&(pass != "4321")){
			System.out.print("Contraceña incorecta!!");
		}else if((user != "Enzo")&(pass.equals("4321"))){
			System.out.print("Usuario incorecto");
		}else {
			System.out.print("Usuario y contraceña incorecto");
		}
	}
}
