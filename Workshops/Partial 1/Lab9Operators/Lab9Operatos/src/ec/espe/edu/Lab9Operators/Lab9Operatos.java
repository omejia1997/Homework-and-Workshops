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
        int operand1 = 40;
        int operand2 = 6;
        int cont=0;
        String name;
        int day;
        int month;
        int year;
        /*operand1 = input.nextInt();
        opernad2 = input.nextInt();*/
        Operation operation = new Operation();
        operation.add(operand1, operand2);
        System.out.println("The sum is:"+operation.getResult());
        operation.add(operand1, -operand2);
        System.out.println("The subtraction is: "+operation.getResult());
        operation.setResult(0);
        while(cont < operand2){
            operation.add(operand1, operation.getResult());
            cont++;
        }
        cont=0;
        System.out.println("The multiplication is: "+operation.getResult());
        operation.setResult(operand1);
        while((operation.getResult()> 0) && (operation.getResult()> operand2) ){
            operation.add(operation.getResult(), -operand2); 
            cont++;
        }
        System.out.println("The division is: "+ cont);
        System.out.println("The rest is: "+operation.getResult());
        System.out.print("Enter your name:");
        name = input.nextLine();
        System.out.print("Enter the day of your birth :");
        day = input.nextInt();
        System.out.println("Enter the month of your birth: ");
        month = input.nextInt();
        System.out.println("Enter the year of your birth: ");
        year = input.nextInt();
        Person person = new Person();
        
        
    }
    
}
