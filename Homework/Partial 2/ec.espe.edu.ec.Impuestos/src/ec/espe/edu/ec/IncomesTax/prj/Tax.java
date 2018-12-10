/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.IncomesTax.prj;

import ec.espe.edu.ec.impuestos.model.IncomeTax;
import ec.espe.edu.ec.impuestos.model.Person;
import java.util.Scanner;

/**
 *
 * @author Omar Mejia
 */
public class Tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        int id;
        float salary;
        float housingExpense;
        float educationExpenses;
        float foodExpense;
        float clothingExpenses;
        float healthExpense;
        float anualIncomes;
        float totalExpenses;
        float taxBase;
        float totalPay;
        
        System.out.println("Ingrese su nombre");
        name=input.nextLine();
        System.out.println("Ingrese su número de cédula");
        id=input.nextInt();
        System.out.println("Ingrese su salario mensual");
        salary=input.nextFloat();
        Person person = new Person(name, id, salary);
        
        System.out.println("Ingrese sus gastos anuales en vivienda");
        housingExpense=input.nextFloat();
        System.out.println("Ingrese sus gastos anuales en eduación");
        educationExpenses=input.nextFloat();
        System.out.println("Ingrese sus gastos anuales en alimentación");
        foodExpense=input.nextFloat();
        System.out.println("Ingrese sus gastos anuales en vestimenta");
        clothingExpenses=input.nextFloat();
        System.out.println("Ingrese sus gastos anuales en salud");
        healthExpense=input.nextFloat();
        
        IncomeTax incomeTax= new IncomeTax();
        anualIncomes=incomeTax.calculateAnualNetIncome(salary);
        System.out.println(anualIncomes);
        totalExpenses=incomeTax.calculateTotalDeductibleExpenses(clothingExpenses, educationExpenses, foodExpense, healthExpense, housingExpense);
        System.out.println(totalExpenses);
        taxBase=incomeTax.calculateTaxBase(anualIncomes,totalExpenses);
        totalPay=incomeTax.CalculateTotalToPay(taxBase);
        System.out.println("La persona: "+person.getName()+
                " con cédula: "+person.getCi()+
                "\nDebe pagar un impuesto a la renta de: "+totalPay);
    
    }
    
}
