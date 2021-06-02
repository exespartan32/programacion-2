package semana2;

public class Main {

	public static void main(String[] args) {
		Citizen ciu1 = new Citizen("exequiel", "mayorga", "mendoza", 43270183);
		Person per1 = (Person) ciu1;
		System.out.println("los datos de la persona 1 son: "+per1);
		
		Citizen ciu2 = new Citizen("exequiel", "mayorga", "mendoza", 43270183);
		Person per2 = (Person) ciu2;
		System.out.println("\nlos datos de la persona 2 son: "+per2);
		
		System.out.println("\n ¿ la persona 1 es igual a la persona 2 ? :"+ per1.equals(per2));
		
		
	}

}
