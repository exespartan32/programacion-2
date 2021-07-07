package clase3_semana3;

public class Controller {

	public static void main(String[] args) {
		Pollo myPollo = new Pollo();
		myPollo.setName("pedro");		
		System.out.println(myPollo.type()+", me llamo "+ myPollo.getName()+" y "+ myPollo.walk());
		
		Paloma myPaloma = new Paloma();
		myPaloma.setName("juan");		
		System.out.println(myPaloma.type()+", me llamo "+ myPaloma.getName()+" y "+ myPaloma.walk());
	}
}
