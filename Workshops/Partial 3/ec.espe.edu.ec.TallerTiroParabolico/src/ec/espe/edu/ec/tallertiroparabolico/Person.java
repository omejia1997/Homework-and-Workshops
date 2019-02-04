/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.tallertiroparabolico;

import ec.espe.edu.ec.tallertiroparabolico.utils.FileManager;
import ec.espe.edu.ec.tallertiroparabolico.utils.Validations;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Omar Mejia
 */
public class Person {
   
    private String name;
    private ArrayList<Person> person;
    private File file;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void leerNombre(String name) throws IOException{
        File file = new File("Usuario.txt");
        
        FileManager.createArrayOfFile(person, file);
        
    }
    
}
