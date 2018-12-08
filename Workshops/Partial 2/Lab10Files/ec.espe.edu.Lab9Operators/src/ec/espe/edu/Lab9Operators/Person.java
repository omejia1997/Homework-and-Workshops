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
   
    public GregorianCalendar cal(int year,int month,int day){
        calendar.set(year, month, day);
        return calendar;
    }
    
    	public int calculateYears(int day, int month, int year) {
		GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
		int cont = 0;
		GregorianCalendar actualDate = new GregorianCalendar();
		while ((date.get(Calendar.YEAR) != actualDate.get(Calendar.YEAR))) {
			date.add(Calendar.YEAR, 1);
			cont++;
		}
		return cont;
	}

	public int calculateDays(int day, int month, int year) {
		GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
		int cont = 0;
		GregorianCalendar actualDate = new GregorianCalendar();
		while (true) {
			if ((date.get(Calendar.DAY_OF_MONTH) == actualDate
					.get(Calendar.DAY_OF_MONTH))
					&& (date.get(Calendar.MONTH) == actualDate
							.get(Calendar.MONTH))
					&& (date.get(Calendar.YEAR) == actualDate
							.get(Calendar.YEAR))) {
				break;
			}
			date.add(Calendar.DAY_OF_MONTH, 1);
			cont++;
		}
		return cont;
	}

	public int CalculateMonth(int day, int month, int year) {
		GregorianCalendar Date = new GregorianCalendar(year, month - 1, day);
		int cont = 0;
		GregorianCalendar actualDate = new GregorianCalendar();
		while (true) {
			if ((Date.get(Calendar.MONTH) == actualDate.get(Calendar.MONTH))
					&& (Date.get(Calendar.YEAR) == actualDate
							.get(Calendar.YEAR))) {
				break;
			}
			Date.add(Calendar.MONTH, 1);
			cont++;
		}
		return cont;
	}
}