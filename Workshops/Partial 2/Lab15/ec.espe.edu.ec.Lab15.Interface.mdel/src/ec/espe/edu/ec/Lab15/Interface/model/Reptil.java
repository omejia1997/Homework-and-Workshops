/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.Lab15.Interface.model;

/**
 *
 * @author Omar Mejia
 */
public class Reptil implements Animal{

    @Override
    public void feed() {
       System.out.println("The animal feeds of bugs");
    }

    @Override
    public void assigmmentHabit() {
        System.out.println("The Reptil"
                + " lives in the jungle");    
    }
    
}
