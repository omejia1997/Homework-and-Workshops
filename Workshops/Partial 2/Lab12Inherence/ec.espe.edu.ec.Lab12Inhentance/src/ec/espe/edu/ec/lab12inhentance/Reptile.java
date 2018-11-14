/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab12inhentance;

/**
 *
 * @author Omar Mejia
 */
public class Reptile {
        int numpatas;
    String tamescams="";

    public int getNumpatas() {
        return numpatas;
    }

    public String getTamescams() {
        return tamescams;
    }
    
    public String eyeskg(){
        int num;
        int n=50;
        String eyes="";
       num=(int)(Math.random()*n)+1;
        eyes=num+" ojos";      
        return eyes;
        
    }
}
