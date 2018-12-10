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
        String bhd;
        int day=1 , month=1 , year=1;
        GregorianCalendar calendar = new GregorianCalendar();
        Operation operation = new Operation();
        System.out.println(calendar.get(Calendar.YEAR));
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
        System.out.println(person.calcuteYear(year));
        year=person.calcuteYear(year);
        day=person.calculateDay(day);
        month=person.calculateMonth(month);
        calendar = person.cal(year,day,month);
        //System.out.println("Yor age is: "+calendar.get(Calendar.YEAR)+" feat "+(calendar.get(Calendar.MONTH))+" months and "+calendar.get(Calendar.DATE)+" days");
        bhd = name +  " ; "+ year + " ; " +month +" ; " + day;
        File archiv = new File("Edad.csv");
        Files file = new Files();
        file.writter(archiv, bhd);
        file.reader();
                
    }
    
}
