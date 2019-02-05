/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Omar Mejia
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static ArrayList<Product> createArrayOfFile(ArrayList<Product> product, File file) {
		String codeProduct;
		String nameProduct;
		float cost;
		int stock;
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
						codeProduct = read.split(";")[0];
						nameProduct = read.split(";")[1];
						stock = Integer.parseInt(read.split(";")[2]);
						cost = Float.parseFloat(read.split(";")[3]);
                                                
                                                String name= read.split(";")[0];
                                                String code= read.split(";")[1];
                                                String category = read.split(";")[2];
                                                int expeditionDay = Integer.parseInt(read.split(";")[3]);
                                                int expeditionMonth = Integer.parseInt(read.split(";")[4]);
                                                int expeditionYear = Integer.parseInt(read.split(";")[5]);
                                                int quantity = Integer.parseInt(read.split(";")[6]) ;
                                                float unitPrice = Float.parseFloat(read.split(";")[7]);
                                                float salePrice = Float.parseFloat(read.split(";")[8]);
                                                String supplier = read.split(";")[9];       
						product.add(new Product(nameProduct, codeProduct,category,
                                                        expeditionDay,expeditionMonth,expeditionYear,quantity,unitPrice,salePrice,supplier));
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

}
