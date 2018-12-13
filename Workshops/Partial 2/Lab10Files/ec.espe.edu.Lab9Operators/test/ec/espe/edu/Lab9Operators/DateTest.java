/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

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
public class DateTest {
    
    public DateTest() {
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
     * Test of CalculateYear method, of class Date.
     */
    @Test
    public void testCalculateYear() {
        System.out.println("CalculateYear");
        int age = 1997;
        int mes = 8;
        int day = 10;
        Date instance = new Date();
        int expResult = 21;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull");
    }

   @Test
    public void testCalculateYear2() {
        System.out.println("CalculateYear");
        int age = -2;
        int mes = 8;
        int day = 10;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
    @Test
    public void testCalculateYear3() {
        System.out.println("CalculateYear");
        int age = 1997;
        int mes = 03;
        int day = 27;
        Date instance = new Date();
        int expResult = 21;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    @Test
    public void testCalculateYear4() {
        System.out.println("CalculateYear");
        int age = 1996;
        int mes = 12;
        int day = 23;
        Date instance = new Date();
        int expResult = 22;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
    @Test
    public void testCalculateYear5() {
        System.out.println("CalculateYear");
        int age = 1998;
        int mes = 29;
        int day = 02;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
    @Test
    public void testCalculateYear6() {
        System.out.println("CalculateYear");
        int age = 0;
        int mes = 13;
        int day = -1;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
    @Test
    public void testCalculateYear7() {
        System.out.println("CalculateYear");
        int age = 1998;
        int mes = 12;
        int day = 35;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
    @Test
    public void testCalculateYear8() {
        System.out.println("CalculateYear");
        int age = 1999;
        int mes =04;
        int day = 31;
        Date instance = new Date();
        int expResult = 19;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
    @Test
    public void testCalculateYear9() {
        System.out.println("CalculateYear");
        int age = 04;
        int mes = 1998;
        int day = 01;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    @Test
    public void testCalculateYear10() throws Exception {
        System.out.println("CalculateYear");
        int age = 2030;
        int mes = 12;
        int day = 12;
        Date instance = new Date();
        int expResult = -1;
        int result = instance.CalculateYear(age, mes, day);
        assertEquals(expResult, result);
        System.out.println("expected Result: "+expResult+" result: "+result+ "succesfull"); 
    }
    
}
