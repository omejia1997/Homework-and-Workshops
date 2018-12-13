/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.impuestos.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 
 */
/**
 * 
 * @author Omar Mejia
 * @version 0.9
 * @since 0.1
 */


public class IncomeTaxTest {
    
    public IncomeTaxTest() {
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
     * Test of calculateAnualNetIncome method, of class IncomeTax.
     */
    @Test
    public void testCalculateAnualNetIncome() {
        System.out.println("calculateAnualNetIncome");
        float salary = 500;
        IncomeTax instance = new IncomeTax();
        int expResult = 5433;
        int result = (int)instance.calculateAnualNetIncome(salary);
        assertEquals(expResult, result);  
    }
    @Test
    public void testCalculateAnualNetIncome2() {
        System.out.println("calculateAnualNetIncome");
        float salary = 800;
        IncomeTax instance = new IncomeTax();
        int expResult = 5433;
        int result = (int)instance.calculateAnualNetIncome(salary);
        assertEquals(expResult, result);
    
    }
    /**
     * Test of calculateTotalDeductibleExpenses method, of class IncomeTax.
     */
    @Test
    public void testCalculateTotalDeductibleExpenses() {
        System.out.println("calculateTotalDeductibleExpenses");
        float clothingExpenses = 100;
        float educationExpenses = 500.5f;
        float foodExpense = 300;
        float healthExpense = 400;
        float housingExpense = 250;
        IncomeTax instance = new IncomeTax();
        float expResult = 1550.5f;
        float result = instance.calculateTotalDeductibleExpenses(clothingExpenses, educationExpenses, foodExpense, healthExpense, housingExpense);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calculateTaxBase method, of class IncomeTax.
     */
    @Test
    public void testCalculateTaxBase() {
        System.out.println("calculateTaxBase");
        float anualIncomes = 5000;
        float totalExpenses = 3000;
        IncomeTax instance = new IncomeTax();
        float expResult = 2000;
        float result = instance.calculateTaxBase(anualIncomes, totalExpenses);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of CalculateTotalToPay method, of class IncomeTax.
     */
    @Test
    public void testCalculateTotalToPay() {
        System.out.println("CalculateTotalToPay");
        float taxBase = 10000;
        IncomeTax instance = new IncomeTax();
        float expResult = 0;
        float result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0); 
        
        System.out.println("CalculateTotalToPay");
        taxBase = -1000;
        expResult = -1;
        result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("CalculateTotalToPay");
        taxBase = 64630;
        expResult = 8484;
        result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("CalculateTotalToPay");
        taxBase = 25000;
        expResult = 1463.5f;
        result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("CalculateTotalToPay");
        taxBase = 114890;
        expResult = 22485;
        result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("CalculateTotalToPay");
        taxBase = 17950;
        expResult = 514;
        result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
     @Test
    public void testCalculateTotalToPay2() {
        System.out.println("CalculateTotalToPay");
        float taxBase = 800
                ;
        IncomeTax instance = new IncomeTax();
        float expResult = 0;
        float result = instance.CalculateTotalToPay(taxBase);
        assertEquals(expResult, result, 0.0); 
    }    
    
    @Test
    public void testCalculateTotalToPay3() {
        float salary=800;
        float salaryAnual;
        System.out.println("CalculateTotalToPay");
        float taxBase = 950;
        IncomeTax instance = new IncomeTax();
        salaryAnual= instance.calculateAnualNetIncome(salary);
        float expResult = 0;
        float result = instance.CalculateTotalToPay(salary);
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testCalculateTotalToPay4() {
        float salary=950;
        float salaryAnual;
        System.out.println("CalculateTotalToPay");
        float taxBase = 950;
        IncomeTax instance = new IncomeTax();
        salaryAnual= instance.calculateAnualNetIncome(salary);
        float expResult = 0;
        float result = instance.
        assertEquals(expResult, salaryAnual, 0.0); 
    }
    
    
    
}
