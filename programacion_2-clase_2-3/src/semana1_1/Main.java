package semana1_1;

public class Main {

	public static void main(String[] args) {
		Citizen ciu1 = new Citizen("exequiel", "mayorga", "mendoza", 43270183);
		Person per1 = (Person) ciu1;
		System.out.println("los datos de la persona son: "+per1);
		
		Person per2 = new Person("exequiel", "mayorga");
		Citizen ciu2 = (Citizen) per2;
		System.out.println("los datos de la persona son:"+ciu2);

	}

}
