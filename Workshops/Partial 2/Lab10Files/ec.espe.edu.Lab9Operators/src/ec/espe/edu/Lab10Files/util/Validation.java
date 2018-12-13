/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab10Files.util;

/**
 *
 * @author Omar Mejia
 */
public class Validation {
    public static boolean esEntero(String cad)
 {
 for(int i = 0; i<cad.length(); i++)
 if( !Character.isDigit(cad.charAt(i)) ){
      return false;
 }
 return true;
 }
    
}
