package semana_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Enzo
 */
public class GestorArchivos {

    static BufferedReader entradaArchivo = null;
    static BufferedWriter salidaArchivo = null;

    public static void guardar(String nombre, String data){

        try {
            salidaArchivo = new BufferedWriter(new FileWriter(
                    "D:/programacion 2/"+nombre));

            salidaArchivo.write(data);

        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(
                    Level.SEVERE, null, ex);
        }finally{
            if(salidaArchivo!=null){
                try {
                    salidaArchivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(GestorArchivos.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static String cargar(String nombre){

        String linRetorno = "";
        try {
            entradaArchivo = new BufferedReader(new FileReader(
                    "D:/programacion 2/"+nombre));
            linRetorno = entradaArchivo.readLine();
        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(
                    Level.SEVERE, null, ex);
        }finally{
            if(entradaArchivo != null)
                try {
                    entradaArchivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(GestorArchivos.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
        }
        return linRetorno;
    }

    static String empaquetador(ArrayList<String> empa, String separador){

        String paquete = "";
        for(int i = 0 ; i<empa.size()-1;i++){
            paquete = paquete+empa.get(i)+separador;
        }
        paquete = paquete+empa.get(empa.size()-1);
        return paquete;
    }

    static ArrayList<String> desempaquetador(
            String paquete, String separador){

        ArrayList<String> miAList2 = new ArrayList<>();
        String [] mivector = paquete.split(separador);

        for(int i = 0; i<mivector.length;i++){
            miAList2.add(mivector[i]);

        }
        return miAList2;
    }

    /**
     * Este m??todo guarda un ArrayList en disco.
     * @param miArray: El ArrayList que ser?? guardado.
     * @param nombreArchivo: El nombre de archivo con el que ser?? guardado en C:/MisFicheros. Si la carpeta no est?? debe crearla.
     */
    public static void guardarArray(ArrayList<String> miArray,String nombreArchivo){
        /**
         * Recibe como argumentos un objeto ArrayList y un String para
         * el nombre del archivo.
         * El archivo ser?? guardado en la ruta: C:MisFicheros
         *  si no tiene esa carpeta debe crearla y darle los atributos adecuados
         */
        String empaquetado = empaquetador(miArray,"#");
        guardar(nombreArchivo, empaquetado);
    }

    /**
     * Este m??todo recupera del disco un ArrayList.
     * @param nombreArchivo:  Es el el nombre del archivo que ser?? leido desde el dicos.  Debe estar almacenado en la ruta C:MisFichechos.
     * @return Devolver?? un objeto de la clase ArrayList.
     */
    public static ArrayList<String> cargarArray(String nombreArchivo){
        String leido = cargar(nombreArchivo);
        ArrayList<String> retorno = desempaquetador(leido,"#");
        return retorno;
    }
    
    public static String[] exists() {
    	String[] listado = null;
        try{
            File carpeta = new File("D:/programacion 2/");

            listado = carpeta.list();
            if (listado == null || listado.length == 0) {
                System.out.println("No existen ContactBooks");
            }
            else {
            	System.out.println("los ContactBooks existentes son:");
                for (int i = 0; i < listado.length; i++) {
                    System.out.println(listado[i]);
                }
            }
        }catch (NullPointerException e){
            System.out.println("ERROR!");
        }
		return listado;
    }
}
