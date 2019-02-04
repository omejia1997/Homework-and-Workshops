/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab25.fullexercise.utils;

import ec.espe.edu.ec.lab25.fullexercise.Product;
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
    
    public static ArrayList<Product> createArrayOfFile(ArrayList<Product> product, File file) {
		String codeProduct;
		String nameProduct;
		float cost;
		int porcentaje;
                float total;
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
						codeProduct = read.split(";")[0];
						nameProduct = read.split(";")[1];
						porcentaje = Integer.parseInt(read.split(";")[2]);
						cost = Float.parseFloat(read.split(";")[3]);
                                                total = Float.parseFloat(read.split(";")[3]);
						product.add(new Product(codeProduct, nameProduct,cost,porcentaje,total));
					}
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
                        System.out.println(e.getMessage());
		}
		return product;
	}

    public static void saveArrayInFile(File file, ArrayList<Product> product) {
		String letter = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < product.size(); k++) {
				letter = product.get(k).getId()+ ";" + product.get(k).getName() + ";"
						+ product.get(k).getPorcentaje() + ";"
                                        + product.get(k).getPrecio()+";"+product.get(k).getValorTotal();
				bw.write(letter);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error");
			System.out.println(e.getMessage());
		}
	}

}
