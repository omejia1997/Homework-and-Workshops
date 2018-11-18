/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.Lab13.util;

import ec.espe.edu.ec.Lab13.util.Brasil;
import ec.espe.edu.ec.Lab13.util.ContinentAmerican;
import ec.espe.edu.ec.Lab13.util.Ecuador;
import ec.espe.edu.ec.Lab13.util.Mexico;

/**
 *
 * @author Omar Mejia
 */
public class Continent {
    
    public static void main(String [] args){
        
     ContinentAmerican america;
     america = new Ecuador();
     america.getInhabitants();
     america.getWeather();
     america = new Brasil();
     america.getInhabitants();
     america.getWeather();
     america = new Mexico();
     america.getInhabitants();
     america.getWeather();
    }
}
