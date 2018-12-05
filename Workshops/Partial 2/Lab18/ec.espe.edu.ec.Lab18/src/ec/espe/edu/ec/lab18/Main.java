/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab18;

import ec.espe.edu.ec.lab18.Collection.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Omar Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things; 
                things= new ArrayList<>();
        Person person = new Person(1, "Omar", 1500.5f);
        System.out.println("size of beginning is :"+things.size());
        things.add(18000);
        things.add("Hello Quto");
        things.add(50000.25f);
        things.add(person);
        System.out.println("size of the end is: "+things.size());
        System.out.println("The elments of the list are:"+things);
        
        Object [] thingsArray= new Object[things.size()];
        thingsArray=things.toArray();
        System.out.println("The tirde element of then Arrays is: "+thingsArray[2]);
        things.remove(50000.25f);
        System.out.println("size of Array is :"+things.size());
        things.add(3);
        things.add(3);
        things.add(3);
        System.out.println("size of Array is :"+things.size());
                
        things.remove(3);
        System.out.println("The elements of the Array are:"+things);
        things.add(5);
        things.add(8);
        things.add(4);
        things.add(8);
        things.add(9);
        things.add(8);
        System.out.println("size Of array is:"+things.size());
        things.remove(8);
        System.out.println("The elements of the Array are:"+things);
        
        things.remove(person);
        System.out.println("The elements of the Array are:"+things);
        System.out.println("size Of array is:"+things.size());
        
        Collection<Integer> integer = new ArrayList<>();
        integer.add(1);
        
        ArrayList<Person> person1= new ArrayList<Person>();
        int salary=0;
        String name;
        for(int i=0;i<5;i++){
            salary=salary+1000;
            person1.add(new Person(i+1, "Edison"+(i+1),salary));
    }    
        for(Person p:person1){
            System.out.println("Person ---->"+p);
        }
        
        
        
        
        
    }
}