/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.du.ec.lab16.exceptions.Operation.Zoo;

/**
 *
 * @author Omar Mejia
 */
public class Animal {
    public String eyes;
    public static int barNumber=7;
    
    
    public int assignBarNumber(int bN){
        barNumber= bN;
        return barNumber;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public static int getBarNumber() {
        return barNumber;
    }

    public static void setBarNumber(int barNumber) {
        Animal.barNumber = barNumber;
    }
    
    public void feed(){
        System.out.println("The animal is eating");
    }
}
