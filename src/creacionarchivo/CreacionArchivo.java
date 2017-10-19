/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivo;
import com.sun.istack.internal.logging.Logger;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
/**
 *
 * @author Estudiante
 */
public class CreacionArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] listaArchivos = null;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Nombre del archivo");
        String nombre = keyb.next();
        //File f = new File("hamlet.txt");
        File f = new File(nombre);
        if(f.exists()){
            System.out.println("exists returns " + f.exists());
            System.out.println("canRead returns " + f.canRead());
            System.out.println("length returns " + f.length());
            System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
//            if(f.isDirectory()){
//                listaArchivos = f.list();
//                System.out.println("La carpeta tiene " + listaArchivos.length + ""
//                        + " archivos");
//            }
            if(f.isDirectory()){
                GestionArchivos gestion = new GestionArchivos();
                gestion.listarArchivos(nombre);
            } 
        }// else {
//            System.out.println("No existe");
//            try{
//                f.createNewFile();
//                System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
//            } catch(IOException ex){
//                System.out.println("No se pudo crear el archivo.");
//            }
//        } 
        else {
            try {
                PrintStream salida = new PrintStream(f);
                salida.println("Hola");
                salida.flush();
                salida.close();
            } catch(FileNotFoundException EX){
                    System.out.println("El archivo no pudo ser creado.");
                }
            }
    }
    
}
