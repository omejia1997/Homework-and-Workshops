/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar Mejia
 */
public class ArchivosJava {
    public static void main(String[] args){
       /* Scanner input = new Scanner(System.in);
        File archivo;
        PrintWriter escribir;
        String ingresar; 
        //try {
        archivo = new File("C:\\Users\\pc\\Documents\\FilesJava\\archivo.txt");

       if(!archivo.exists()){
           System.out.println("Archivo creado OK");
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ArchivosJava.class.getName()).log(Level.SEVERE, null, ex);
            }
       }else{
           System.out.println("El Archivo Ya Existe");
           try {
               escribir = new PrintWriter(archivo,"utf-8");
               System.out.println("Escriba en el archivo:");
               ingresar = input.nextLine();
               escribir.println(ingresar);
               escribir.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
           
       }*/
       
       BuffWrit writter = new BuffWrit();
       writter.writter();
       FileRead read = new FileRead();
       read.reader();
        
        
        
        
    }
}
