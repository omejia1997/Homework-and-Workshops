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
public class Main {
    public static void main(String[] args){
        Animal animal;
        animal= new Mammal();
        animal.assigmmentHabit();
        animal.feed();
        animal=new Reptil();
        animal.assigmmentHabit();
        animal.feed();
        
    }
}
