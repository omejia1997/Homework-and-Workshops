/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab11arreglos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*carlos;21;23;34
 *
 * @author Omar Mejia
 */
public class Lab11_Arrays {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta ="Edad.csv";
        Person person[]= new Person[10]; 
        int i=0;
        int year;
        int age;
        String name="";
        try{
        FileReader archedad= new FileReader(ruta);
        BufferedReader br= new BufferedReader(archedad);
        String leer=br.readLine();
        while((leer!= null)&& i<10){
            if(leer.indexOf(";")!=-1){
                name=leer.split(";")[0];
                year= Integer.parseInt(leer.split(";")[1]);
                person[i]= new Person(name,year);
                
                
            }
            leer=br.readLine();
           i++; 
           
        }
        archedad.close();
        
        }catch (Exception e){
        }
        for(int p=0;p<10;p++){
            age=person[p].calcYears(person[p].getYears());
            person[p].setAge(age);
        }
        for(int k=0;k<10;k++){
            System.out.println("Nombre: "+person[k].getName());
            System.out.println("Age: "+person[k].getAge());
        }
            
        }
}
