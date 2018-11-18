/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.Lab13.util;

/**
 *
 * @author Omar Mejia
 */
public class Mexico extends ContinentAmerican{
     @Override
    public void getInhabitants() {
        System.out.println("The name of class is:"+getClass().getSimpleName());
        System.out.println("The number of Inhabitants in Mexico is of: "+2350+"millons");
    }

    @Override
    public void getWeather() {
        System.out.println("The Weather in Ecuador is "+30.5f+"grades Centigrados\n");
    }
    
}
