/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

import ec.espe.edu.Lab10Files.util.Files;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Omar Mejia
 */
public class Lab9Operatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// 01/01/2000
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate fechaNac = LocalDate.parse("08/10/1997", fmt);
LocalDate ahora = LocalDate.now();

Period periodo = Period.between(fechaNac, ahora);
System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());

        Scanner input = new Scanner(System.in);
        String name;
        String bhd;
        int day=1 , month=1 , year=1;
        GregorianCalendar calendar = new GregorianCalendar();
        Operation operation = new Operation();
        System.out.println("The sum is: "+operation.add(4, 3));
        System.out.println("The rest is: "+operation.rest(20, 4));
        System.out.println("La multiplicación es: "+operation.mult(5, 4));
        System.out.println("La división es : "+operation.div(9, 2));
        
        System.out.print("Enter your name:");
        name = input.nextLine();
        do{
            if(year > calendar.get(Calendar.YEAR)){
                System.out.println("Error You are not born yet");
            }
            if(year < 1){
                System.out.println("Error has entered an incorrect year");
            }
            
        System.out.print("Enter the year of your birth: ");
        year = input.nextInt();
        }while((year<1)||(year>calendar.get(Calendar.YEAR)));
        
        do{
            if(month>12 || month < 1){
                System.out.println("Error has entered an incorrect month");
            }
        System.out.print("Enter the month of your birth: ");
        month = input.nextInt();
        }while(month>12 || month < 1);
        
        do{
            if(day<0 || day>31){
                System.out.println("Error has entered an incorrect day");
            }
        System.out.print("Enter the day of your birth :");
        day = input.nextInt();    
        }while(day<0 || day>31);
        
        Person person = new Person();
        System.out.println("Your name is: "+name);
        int year2 = person.calculateYears(day, month, year);
        int day2 = person.calculateDays(day, month, year);
        int month2 =person.CalculateMonth(day, month, year);
        //System.out.println("Yor age is: "+calendar.get(Calendar.YEAR)+" feat "+(calendar.get(Calendar.MONTH))+" months and "+calendar.get(Calendar.DATE)+" days");
        bhd = name +  " ; "+ year2 + " ; " +month2 +" ; " + day2;
        File archiv = new File("Edad.csv");
        Files file = new Files();
        file.writter(archiv, bhd);
        file.reader(archiv);
        
                
    }
    
}
