/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.tallertiroparabolico.utils;

import ec.espe.edu.ec.tallertiroparabolico.Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Omar Mejia
 */

public class FileManager {
    
    public static void write(File file, String text) {
		FileWriter fileWriter;
		BufferedWriter salida;
		try {
			fileWriter = new FileWriter(file, true);
			salida = new BufferedWriter(fileWriter);
			
			salida.write(text);
			salida.newLine();
			salida.close();
		} catch (IOException e) {
			System.out.println("Can't read the file");
		}
	}

    public static ArrayList<Person> createArrayOfFile(ArrayList<Person> person, File file) throws IOException {
		String nameUser;
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
					nameUser=read.split(";")[0];	
                                        person.add(new Person(nameUser));
                                        }
					read = br.readLine();
				}
			}
    
}
                catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
                        System.out.println(e.getMessage());
		}
		return person;
    }
    
}