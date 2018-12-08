/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab19;

import ec.espe.edu.ec.lab19.Area.Figure;
import ec.espe.edu.ec.lab19.Area.Triangulo;
import ec.espe.edu.ec.lab19.Operators.BasicOperation;

/**
 *
 * @author Omar Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figure figure=new Triangulo(1,2);
        BasicOperation basic = new BasicOperation(1.2f, 2.4f, 1.2f);
        float localArea=figure.computerArea();
        System.out.println("The are is "+figure.computerArea());
        System.out.println("The add is : "+basic.add());
        System.out.println("The rest is : "+basic.rest());
        System.out.println("Tthe multiplici is: "+basic.mul());
        System.out.println("The div is "+basic.div());
        
    }
    
}
