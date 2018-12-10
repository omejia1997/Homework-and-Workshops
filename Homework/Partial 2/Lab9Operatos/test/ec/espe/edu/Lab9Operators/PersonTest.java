/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Omar Mejia
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cal method, of class Person.
     */
    @Test
    public void testCal() {
        System.out.println("cal");
        int year = 1997;
        int month = 10;
        int day = 0;
        Person instance = new Person();
        int yearExpected =21;
        int monthExpected=2;
        
        GregorianCalendar result = instance.cal(year, month, day);
        int yearResult=result.get(Calendar.YEAR);
        int dayResult=result.get(Calendar.DAY_OF_MONTH);
        int monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
        
        assertEquals(yearExpected, yearResult);
        assertEquals(monthExpected, monthResult);
        
        year = 1998;
        month = 10;
        day = 0;
        yearExpected =21;
        monthExpected=1;
        
        result = instance.cal(year, month, day);
        yearResult=result.get(Calendar.YEAR);
        dayResult=result.get(Calendar.DAY_OF_MONTH);
        monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
        
        assertEquals(yearExpected, yearResult);
        assertEquals(monthExpected, monthResult);
        
        year = 1998;
        month = 02;
        day = 29;
        yearExpected =21;
        monthExpected=1;
        
        result = instance.cal(year, month, day);
        yearResult=result.get(Calendar.YEAR);
        dayResult=result.get(Calendar.DAY_OF_MONTH);
        monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
        
        assertEquals(yearExpected, yearResult);
        assertEquals(monthExpected, monthResult);
        
        year = 0;
        month = 02;
        day = 29;
        yearExpected =0;
        monthExpected=1;
        
        result = instance.cal(year, month, day);
        yearResult=result.get(Calendar.YEAR);
        dayResult=result.get(Calendar.DAY_OF_MONTH);
        monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
        
        assertEquals(yearExpected, yearResult);
        assertEquals(monthExpected, monthResult);
        
        year = 1;
        month = 1;
        day = 1;
        yearExpected =21;
        monthExpected=1;
        
        result = instance.cal(year, month, day);
        yearResult=result.get(Calendar.YEAR);
        dayResult=result.get(Calendar.DAY_OF_MONTH);
        monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
        
        assertEquals(yearExpected, yearResult);
        assertEquals(monthExpected, monthResult);
        
        year = 1998;
        month = 10;
        day = 12;
        yearExpected =21;
        monthExpected=35;
        
        result = instance.cal(year, month, day);
        yearResult=result.get(Calendar.YEAR);
        dayResult=result.get(Calendar.DAY_OF_MONTH);
        monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
        
        assertEquals(yearExpected, yearResult);
        assertEquals(monthExpected, monthResult);
    }
    
    @Test
    public void testCal2() {
        System.out.println("cal");
        int year = 1997;
        int month = 10;
        int day = 0;
        Person instance = new Person();
        int yearExpected =21;
        int monthExpected=2;
        
        GregorianCalendar result = instance.cal(year, month, day);
        int yearResult=result.get(Calendar.YEAR);
        int dayResult=result.get(Calendar.DAY_OF_MONTH);
        int monthResult=result.get(Calendar.MONTH);
        System.out.println(yearResult);
        System.out.println(monthResult);
    }
}
