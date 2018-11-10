/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Omar Mejia
 */
public class Person {            
    GregorianCalendar calendar = new GregorianCalendar();
    Operation operation = new Operation();
    String name;
    int day;
    int month;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    public void calcuteYear(int year){
        int age=0;
        if (calendar.get(Calendar.YEAR)>=year){
        age = operation.rest(calendar.get(Calendar.YEAR),year);    
            System.out.println("You have : "+year+" year olds");
        } else {
            System.out.println("Usted no ha nacido aun");
        }   
        }
    
    public void calculateMonth(int month){
        int ageMonth;
        if(calendar.get(Calendar.MONTH)>= month){
        ageMonth = operation.rest(calendar.get(Calendar.MONTH), month);    
            System.out.println("Meses cumplidos: "+(ageMonth+1));
        }
        }
    
    
    public void calculateDay(int day){
        int ageDay;
        ageDay= operation.rest(calendar.get(Calendar.DAY_OF_MONTH),day);
        if(ageDay < 0){
            ageDay = ageDay + 30;
        }
        System.out.println("Dias cumplidos: "+ageDay);
    }
    
}
