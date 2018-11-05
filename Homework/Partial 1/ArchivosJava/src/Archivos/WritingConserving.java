/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Omar Mejia
 */
public class WritingConserving {
    Scanner input = new Scanner(System.in);

public void writing(){
    File archivo;//Manipular el archivo
    FileWriter escribir;//escribir en el archivo
    PrintWriter linea;//Para escribir en el archivo
    String nombre = "";
    String dir = "";
    String email = "";
    archivo = new File("usuarios.txt");//Preparando el archivo
    if(!archivo.exists()){
        try {
            archivo.createNewFile();
            System.out.println("Ingrese el nombre: ");
            nombre = input.nextLine();
            System.out.println("Ingrese la Dirección: ");
            dir = input.nextLine();
            System.out.println("Ingrese el Email");
            email = input.nextLine();
            escribir = new FileWriter(archivo,true);
            linea= new PrintWriter(escribir);
            //Escribimos en el archivo
            linea.println(nombre);
            linea.println(dir);
            linea.println(email);
        } catch (IOException ex) {
            Logger.getLogger(WritingConserving.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{
            try {
            System.out.println("Ingrese el nombre: ");
            nombre = input.nextLine();
            System.out.println("Ingrese la Dirección: ");
            dir = input.nextLine();
            System.out.println("Ingrese el Email");
            email = input.nextLine();
            escribir = new FileWriter(archivo,true);
            linea= new PrintWriter(escribir);
            //Escribimos en el archivo
            linea.println(nombre);
            linea.println(dir);
            linea.println(email);
        } catch (IOException ex) {
            Logger.getLogger(WritingConserving.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
}
    
}
