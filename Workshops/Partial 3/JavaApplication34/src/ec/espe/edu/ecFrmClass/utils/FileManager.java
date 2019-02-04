/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ecFrmClass.utils;

import ec.espe.edu.ec.model.Person;
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
    


public static ArrayList<Person> createArrayPersonOfFile(ArrayList<Person> person, File file) {
                String lastName;
		float sueldoHora;
		int horasTrabajadas;
                try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
						lastName = read.split(";")[0];
                                                sueldoHora =Float.parseFloat(read.split(";")[1]) ;
                                                horasTrabajadas=Integer.parseInt(read.split(";")[2]) ;
                                                person.add(new Person(lastName, sueldoHora, horasTrabajadas));
                                        }
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
		}
return person;	
}

public static ArrayList<Person> createArrayCalculoOfFile(ArrayList<Person> person, File file) {
                float sueldoTotal;
		float iessContribution ;
                try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
						sueldoTotal =Float.parseFloat(read.split(";")[0]) ;
                                                iessContribution =Float.parseFloat(read.split(";")[1]) ;
                                                person.add(new Person(sueldoTotal, iessContribution));
                                        }
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
		}
return person;	
}


	public static void saveArrayPersonInFile(File file, ArrayList<Person> person) {
		String text = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < person.size(); k++) {
				text = person.get(k).getLastName()+";"+person.get(k).getSueldoHora()+";"+person.get(k).getHorasTrabajadas();
                                
				bw.write(text);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error");
			System.out.println(e.getMessage());
		}
                person.clear();
	}
        
        	public static void saveCalculoDeSalario(File file, ArrayList<Person> person) {
		String text = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < person.size(); k++) {
				text = person.get(k).getIessContribution()+";"+person.get(k).getSueldoTotal();
                                
				bw.write(text);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error");
			System.out.println(e.getMessage());
		}
                person.clear();
	}
}




