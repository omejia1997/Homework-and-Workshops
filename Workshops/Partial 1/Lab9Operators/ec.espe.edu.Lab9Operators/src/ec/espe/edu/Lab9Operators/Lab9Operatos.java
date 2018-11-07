/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

import java.util.Scanner;

/**
 *
 * @author Omar Mejia
 */
public class Lab9Operatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int day;
        int month;
        int year;
        Operation operation = new Operation();
        System.out.println("The sum is: "+operation.add(4, 3));
        System.out.println("The rest is: "+operation.rest(20, 4));
        System.out.println("La multiplicación es: "+operation.mult(5, 4));
        System.out.println("La división es : "+operation.div(9, 2));
        
        System.out.print("Enter your name:");
        name = input.nextLine();
        System.out.print("Enter the year of your birth: ");
        year = input.nextInt();
        System.out.print("Enter the month of your birth: ");
        month = input.nextInt();
        System.out.print("Enter the day of your birth :");
        day = input.nextInt();

        Person person = new Person();
        System.out.println("Your name is: "+name);
        person.calcuteYear(year);
        person.calculateMonth(month);
        person.calculateDay(day);
        
    }
    
}
