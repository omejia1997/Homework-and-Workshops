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
public class Mammal implements Animal{

    @Override
    public void feed() {
        System.out.println("The animal Mammal feeds on milk");
    }

    @Override
    public void assigmmentHabit() {
        System.out.println("The animal Mammal lives in the jungle");
    }
    
    
}
