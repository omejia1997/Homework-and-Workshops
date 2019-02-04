/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

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
    
    @Test
    public void testCalculateYears() {
        System.out.println("calculateYears");
        int day = 29;
        int month = 02;
        int year = 2015;
        Person instance = new Person();
        int expResult = 21;
        int result = instance.calculateYears(day, month, year);
        System.out.println(result);
        assertEquals(expResult, result);
        }

    /**
     * Test of calculateDays method, of class Person.
     */
    @Test
    
    public void testCalculateYear11()  {
        System.out.println("CalculateYear");
        int age = 2016;
        int mes = 04;
        int day = 31;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
        
        @Test
        public void testCalculateYear12()  {
        System.out.println("CalculateYear");
        int age = 2013;
        int mes = 11;
        int day = 31;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
        
            @Test
        public void testCalculateYear13()  {
        System.out.println("CalculateYear");
        int age = 1970;
        int mes = 12;
        int day = 17;
        Date instance = new Date();
        int expResult = 47;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
            @Test
        public void testCalculateYear14()  {
        System.out.println("CalculateYear");
        int age = 1970;
        int mes = 12;
        int day = 17;
        Date instance = new Date();
        int expResult = 48;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
        
            @Test
        public void testCalculateYear15()  {
        System.out.println("CalculateYear");
        int age = 1970;
        int mes = 12;
        int day = 13;
        Date instance = new Date();
        int expResult = 48;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
            @Test
    public void testCalculateYear16()  {
        System.out.println("CalculateYear");
        int age = 1970;
        int mes = 12;
        int day = 13;
        Date instance = new Date();
        int expResult = 48;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    

}
