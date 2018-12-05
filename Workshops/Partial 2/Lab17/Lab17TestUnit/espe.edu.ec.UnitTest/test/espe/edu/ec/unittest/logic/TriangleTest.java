/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.unittest.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAOM
 */
public class TriangleTest {
    
    public TriangleTest() {
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
     * Test of validateTriangle method, of class Triangle.
     */
    @Test
    public void testValidateTriangle() 
    {
        System.out.println("validate Triangle");
        float side1 = 2.0F;
        float side2 = 2.0F;
        float side3 = 2.0F;
        Triangle instance = new Triangle();
        int expResult = 1;
        int result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult, result);
        
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 2.0F;
        side2 = 3.0F;
        side3 = 5.0F;
        expResult = -1;
        result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 3.0F;
        side2 = 7.0F;
        side3 = 8.0F;
        expResult = 1;
        result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 0.0F;
        side2 = 2.0F;
        side3 = 3.0F;
        expResult = -1;
        result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 3.0F;
        side2 = -3.0F;
        side3 = 8.0F;
        expResult = -1;
        result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 6.0F;
        side2 = 2.0F;
        side3 = 4.0F;
        expResult = -1;
        result = instance.validateTriangle(side1, side2, side3);

        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 2.7F;
        side2 = 3.4F;
        side3 = 6.3F;
        expResult = -1;
        result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        side1 = 5.5F;
        side2 = 3.4F;
        side3 = 6.7F;
        expResult = 1;
        result = instance.validateTriangle(side1, side2, side3);
        assertEquals(expResult,result);
        System.out.println(side1+side2+side3 + "SUCCEEDED");
        
        
        
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
     @Test
    public void testCalculateArea()
    {
        System.out.println("calculate Area");
        float side1 = 6.0F;
        float side2 = 6.0F;
        float side3 = 6.0F;
        Triangle instance = new Triangle();
        int expResult = (int)Math.sqrt(243);
        int result = (int)instance.calculateArea(side1, side2, side3);
        System.out.println(result);
        assertEquals(expResult, result);
        System.out.println(expResult+"SUCCEEDED");
        
        side1 = 4.0F;
        side2 = 4.0F;
        side3 = 4.0F;
        expResult = (int)Math.sqrt(48);
        result = (int)instance.calculateArea(side1, side2, side3);
        assertEquals(expResult, result);
        System.out.println(expResult+ "SUCCEEDED");
        
        side1 = 2.0F;
        side2 = 2.0F;
        side3 = 2.0F;
        expResult = (int)Math.sqrt(3);
        result = (int)instance.calculateArea(side1, side2, side3);
        System.out.println(result);
        assertEquals(expResult, result);
        System.out.println(expResult+ "SUCCEEDED");
        
        side1 = 5.0F;
        side2 = 3.0F;
        side3 = 6.0F;
        expResult = (int)Math.sqrt(56);
        result = (int)instance.calculateArea(side1, side2, side3);
        assertEquals(expResult, result);
        System.out.println(expResult+ "SUCCEEDED");
        
        side1 = 3.0F;
        side2 = 7.0F;
        side3 = 8.0F;
        expResult = (int)Math.sqrt(108);
        result = (int)instance.calculateArea(side1, side2, side3);
        assertEquals(expResult, result);
        System.out.println(expResult+ "SUCCEEDED");
        
        side1 = 4.0F;
        side2 = 8.0F;
        side3 = 8.0F;
        expResult = (int)Math.sqrt(240);
        result = (int)instance.calculateArea(side1, side2, side3);
        assertEquals(expResult, result);
        System.out.println(expResult+ "SUCCEEDED");
        
        side1 = 0.0F;
        side2 = 8.0F;
        side3 = 8.0F;
        expResult = 0;
        result = (int)instance.calculateArea(side1, side2, side3);
        assertEquals(expResult, result);
        System.out.println(expResult+ "SUCCEEDED");
        
    }
    
}
