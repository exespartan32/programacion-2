package clase2y3;

import java.util.ArrayList;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Con paciencia y hojas de morera hace el gusano la seda.";
		String nombre = "miRefran2.txt";
		GestorArchivos.guardar(nombre, data);
		
		/*
		ArrayList<String> empa = new ArrayList<>();
		empa.add("Enzo");
		empa.add("Argentino");
		empa.add("454545");
		empa.add("no");
		
		String separador = "#";
		
		String paquete = GestorArchivos.empaquetador(empa, separador);
		
		System.out.println(paquete);
		
		GestorArchivos.guardar("datoAfiliado.txt", paquete);
		
		String paquete = GestorArchivos.cargar("datoAfiliado.txt");
		
		System.out.println(paquete);
		
		String separador2 = "#";
		
		ArrayList<String> datosAfiliado = GestorArchivos.desempaquetador(paquete, separador2);
		
		for(int j=0;j<datosAfiliado.size();j++) {
			System.out.println("--> " + datosAfiliado.get(j));
		}*/
	}

}
