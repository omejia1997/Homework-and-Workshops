package ec.espe.edu.HomeworkBaseDeDatos.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omar Mejia
 */
public class Validations {
   public static boolean isNumeric(String cadena){
	try {
		Double.parseDouble(cadena);
		return false;
	} catch (NumberFormatException nfe){
		return true;
	} 
}   
}
 
