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
    int daylite[]={31,28,31,30,31,30,31,31,30,31,30,31};

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
   
    public int calcuteYear(int year){
        int age=0;
        operation.setOperand2(year);
        age = operation.rest(calendar.get(Calendar.YEAR),year);    
            return age;
        }
    
    public GregorianCalendar cal(int year,int month,int day){
        int month2=0,day2=0,year2=0;
        month2=calculateMonth(month);
        day2=calculateDay(day);
        year2=calcuteYear(year);
        calendar.set(year2, month2, day2);
        return calendar;
    }
    
    public int calculateMonth(int month){
        int ageMonth=0;
        ageMonth = operation.rest(calendar.get(Calendar.MONTH), month);
            if (ageMonth<0){
                ageMonth=ageMonth*(-1);
            }
            ageMonth=ageMonth+1;
            return ageMonth;
        }
     
    public int calculateDay(int day){
        int ageDay=0;
        ageDay= operation.rest(calendar.get(Calendar.DAY_OF_MONTH),day);
        if(ageDay < 0){
            ageDay = ageDay + 30;
        }
        return ageDay;
    }
    
}

