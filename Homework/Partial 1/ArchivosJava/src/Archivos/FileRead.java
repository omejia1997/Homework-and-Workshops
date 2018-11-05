/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Omar Mejia
 */
public class FileRead {
   
    public void reader(){
        String leer;
        try{
        FileReader fileReader = new FileReader("C:\\Users\\pc\\Documents\\FilesJava\\archivo.txt");
        BufferedReader entrada = new BufferedReader(fileReader);
        leer = entrada.readLine();
        while(leer!=null){
            System.out.println(leer);
            leer= entrada.readLine();
        }

        }catch(IOException e){
            System.out.println("Ocurrio un Error");
        }
        
    }
 
}
   
