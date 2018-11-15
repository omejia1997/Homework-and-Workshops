/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Omar Mejia
 */
public class BuffWrit {
    public void writter(){
        FileWriter file; 
        Scanner entrada = new Scanner(System.in);
        String frase;
        BufferedWriter salida;
        try{
            file = new FileWriter("C:\\Users\\pc\\Documents\\FilesJava\\archivo.txt",true);
            salida = new BufferedWriter(file);
            frase = entrada.nextLine();
            salida.write(frase);
            salida.newLine();
            salida.close();
        }catch(IOException e){
        }
    }
}
