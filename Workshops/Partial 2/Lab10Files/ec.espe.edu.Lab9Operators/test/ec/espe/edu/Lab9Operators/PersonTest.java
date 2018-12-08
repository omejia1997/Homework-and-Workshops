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
        int day = 8;
        int month = 10;
        int year = 1997;
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
    public void testCalculateDays() {
        System.out.println("calculateDays");
        int day = 8;
        int month = 10;
        int year = 1997;
        Person instance = new Person();
        int expResult = 0;
        int result = instance.calculateDays(day, month, year);
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculateMonth method, of class Person.
     */
    /*@Test
    public void testCalculateMonth() {
        System.out.println("CalculateMonth");
        int day = 0;
        int month = 0;
        int year = 0;
        Person instance = new Person();
        int expResult = 0;
        int result = instance.CalculateMonth(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
