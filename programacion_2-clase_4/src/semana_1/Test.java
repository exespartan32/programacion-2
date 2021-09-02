package semana_1;

public class Test {

	public static void main(String[] args) {
		Contact micon = new Contact("exe", "may1123", "2233", false);
		ContactBook miCB = new ContactBook();
		miCB.addContact(micon);
		
		
		CBContainer CBC= new CBContainer("mi primer CB");
		CBC.addContactBook(miCB);
		
		Contact micon2 = new Contact("daniel", "exe@11", "2222", true);
		ContactBook miCB2 = new ContactBook();		
		miCB2.addContact(micon2);		
		CBC.addContactBook(miCB2);
		
		
		ContactBook otroContacto = new ContactBook();
		otroContacto.addContact(micon);
		otroContacto.addContact(micon2);
		
		CBC.addContactBook(otroContacto);
		
		
		System.out.println(CBC.toString("||"));
		
		//DataModel.saveCBC(CBC);
				
	}

}
