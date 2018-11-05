/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Omar Mejia
 */
public class Read {
    
    public void Read(){
        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena ;
        String nombre = "";
        String dir = "";
        String email = "";
        archivo = new File("usuarios.txt");
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            cadena="";
            while(cadena!=null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    dir = cadena;
                    cadena = almacenamiento.readLine();
                    email = cadena;
                    cadena = almacenamiento.readLine();
                    if(cadena!=null){
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Dirección: "+ dir);
                        System.out.println("Email: " + email);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            try {
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
