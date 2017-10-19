/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivo;
import java.io.*;

/**
 *
 * @author Estudiante
 */
public class GestionArchivos {
    public void listarArchivos(String ruta){
        String[] lista = null;
        File archivo = new File(ruta);
        if(archivo.exists()){
            if(archivo.isFile()){
                System.out.println(archivo.getName());
            } else {
                lista = archivo.list();
                for(String nombre : lista){
                    this.listarArchivos(ruta + "/" + nombre);
                }
            }
        }
    }
}
