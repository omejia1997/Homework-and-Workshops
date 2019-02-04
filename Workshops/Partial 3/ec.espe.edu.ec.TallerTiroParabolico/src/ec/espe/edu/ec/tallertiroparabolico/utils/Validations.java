/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.tallertiroparabolico.utils;

import ec.espe.edu.ec.tallertiroparabolico.Person;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar Mejia
 */
public class Validations {
    
    
   
    public static boolean validateNamePerson(ArrayList<Person> persons, File file, String namePerson) {
		boolean validateName = false;
        try {
            FileManager.createArrayOfFile(persons, file);
        } catch (IOException ex) {
            Logger.getLogger(Validations.class.getName()).log(Level.SEVERE, null, ex);
        }
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getName().equals(namePerson)) {
				validateName = true;
			}
		}
		persons.clear();
		return validateName;
	}
}
