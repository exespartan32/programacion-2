package semana_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View_test {
	static Scanner textScanner = new Scanner(System.in);
	static Scanner intScanner = new Scanner(System.in);
	
	public static int messageOption(String msg) {
		System.out.println("[View]<--messageOption--");
		//Scanner msgScanner = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println(msg);		
		System.out.println("------------------------------------------");
		int option = intScanner.nextInt();
		
		System.out.println("[View]--(int option)-->");
		return option;
	}
	
    public static int menu(){
        int option=0;
        try {
	        System.out.println("Check an option");
	        System.out.println("1. Create contact book and add contact");
	        System.out.println("2. Add Contact");
	        System.out.println("3. List ContactBooks");
	        System.out.println("4. Delecte Contact");
	        System.out.println("0. Exit");
	        
	        option = intScanner.nextInt();
	        
        } catch (InputMismatchException e) {
        	System.out.println("error");
			System.out.println("you have entered a letter ");
			System.out.println("¡must put a number¡");
		}		
		return option;
	}
    
	public static ContactBook createContactBook(ContactBook conBook1) {
		
		System.out.println("enter the name of the contact book ");
		String newNomCon = textScanner.nextLine();
		
		//ContactBook book1 = new ContactBook(newNomCon);
		System.out.println("...................................................");
		System.out.println("the name of the contact book  "+newNomCon+" it was plump correctly ");
				
		conBook1.setName(newNomCon);			
		return conBook1;	
	}
	
	public static ContactBook createContact(ContactBook cont1) {
		int option = 0;
		boolean topList= false;
		
		System.out.println("Contact name");
        String nameC = textScanner.nextLine();
        
	    System.out.println("E-mail ");
	        String email = textScanner.nextLine();
	        
	    System.out.println("Phone number ");
	        String numberP = textScanner.nextLine();
	        
			try {
		System.out.println("Do you want to save it to topList? ");
		System.out.println("1-yes");
		System.out.println("2-no");
			option = intScanner.nextInt();
			
			switch(option) {
			case 1:	
				topList = true;
				break;
			case 2:
				topList = false;
				break;
		}
				} catch (InputMismatchException|NullPointerException e) {
					System.out.println("error");
					System.out.println("you have entered a letter ");
					System.out.println("¡must put a number¡");
				}
			Contact contact1 = new Contact(nameC, email,numberP, topList);
			cont1.addContact(contact1);
			
		return cont1;			
	}
	
    public static Contact addingContact(){
    	int option = 0;
		boolean topList= false;
		
		System.out.println("Contact name");
        String nameC = textScanner.nextLine();
        
	    System.out.println("E-mail ");
	        String email = textScanner.nextLine();
	        
	    System.out.println("Phone number ");
	        String numberP = textScanner.nextLine();
	        
			try {
		System.out.println("Do you want to save it to topList? ");
		System.out.println("1-yes");
		System.out.println("2-no");
			option = intScanner.nextInt();
			
			switch(option) {
			case 1:	
				topList = true;
				break;
			case 2:
				topList = false;
				break;
		}
				} catch (InputMismatchException|NullPointerException e) {
					System.out.println("error");
					System.out.println("you have entered a letter ");
					System.out.println("¡must put a number¡");
				}
			Contact contact1 = new Contact(nameC, email,numberP, topList);
			
		return contact1;	
	    }
	    
	    
	public static void message(String msg) {
		System.out.println(msg);
	}
	
	public static String usages(String[] list, String ms) {
		View_test.message(ms);
		String name = textScanner.nextLine();
	return name+".txt";
	}
	
/*
 * no funciona. 
 * ??????
 	public static String usages(String[] list, String ms) {
		String name;
        try {
        	View_test.message(ms);
			name = textScanner.nextLine();
        }catch(NullPointerException e) {
        	System.out.println("la libreta de contactos esta vacia, primero deve agregarle contactos con la opcion 2");
        }
	return name+".txt";
	}
 */

	public static void listContact(ContactBook list) {
		System.out.println("los datos guardados en la libreta seleccionada son: ");
		System.out.println(list);
	}	
}
