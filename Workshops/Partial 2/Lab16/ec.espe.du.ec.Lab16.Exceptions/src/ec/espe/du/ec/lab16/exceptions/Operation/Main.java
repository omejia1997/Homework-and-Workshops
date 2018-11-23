/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.du.ec.lab16.exceptions.Operation;

import ec.espe.du.ec.lab16.exceptions.Operation.Zoo.Animal;
import java.io.IOException;

/**
 *
 * @author Omar Mejia
 */
public class Main {
    public static void main(String[] args){
        float result;
        Operation operation;
        operation=new Operation();
        /*result= operation.divid(3, 5);
        System.out.println("The quotient is: "+result);
        result= operation.divid(386, 897);
        System.out.println("The quotient is: "+result);
        result= operation.divid(5.8f, 1.3f);
        System.out.println("The quotient is: "+result);
        result= operation.divid(8, 0);
        System.out.println("The quotient is: "+result);
        //System.out.println("The sum of two shorts is: "+operation.add(3000, 1000));
        System.out.println("The sum of two float is: "+operation.addfloat(1.2f,2.9f));
        System.out.println("The sum of two float is: "+operation.addfloat(1.7f,2.4f));
        System.out.println("The sum of two float is: "+operation.addfloat(2.f,1.9f));
        */
        
        Animal animal= null;
        animal = null;
        animal = new Animal();
        if(animal!= null){
            System.out.println("The animal exist");
            //System.out.println(animal.eyes);
        }else{
            System.out.println("The animal don´t exist");
            /*animal.eyes="brown";
            System.out.println("The animal have eyes"+animal.eyes);
        */}
        try{
            System.out.println("The first line is running");
            System.out.println("The eyes are "+animal.eyes);
            System.out.println("The program is a style running");
            if(animal.eyes!= null){
                System.out.println(animal.eyes);
            }else{
                animal.eyes="brown";
                System.out.println("The animal have eyes: "+animal.eyes);       
        }
        }
        catch(Exception ex){
            animal = new Animal();
 
            if(ex.toString().equals("java.lang.NullPointerException")){  
            System.out.println(ex.getStackTrace());
            ex.printStackTrace();
            animal = new Animal();    
            }
            }
        animal.assignBarNumber(0)
        Animal animal2= new Animal();
        
        }
    }

            //System.out.println("An error ocurred"+ex);
            //System.out.println("The exception is "+ex.getMessage());
            
       /* 
        }*/
        /*catch(IOExceptioneption ex){
            System.out.println("EL programa fallo");
        }
        
    }
}*/
