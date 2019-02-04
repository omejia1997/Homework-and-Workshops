/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab21.referenceddata;

import ec.espe.edu.ec.lab21.referenceddata.Customer.logic.SalesPrice;

/**
 *
 * @author Omar Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float base=0;
    float tax=12;
    float finalPrice=0;
    Integer num=10;
    SalesPrice salesPrice =new SalesPrice(20, 10, 0);
    base=10;
        System.out.println("Printing from main ----->base equal " +base+" Tax :"+tax+" Final price"+finalPrice);
        computeFinalPrice(base, tax, finalPrice);
        System.out.println("Printing from main ----->base equal " +base+" Tax :"+tax+" Final price"+finalPrice);
        System.out.println("");
        System.out.println("Printing from main-->"+salesPrice);
        System.out.println(salesPrice);
        computeFinal(salesPrice);
        System.out.println("");
        System.out.println("Printing from main The Integer is:"+num);
        numElevate(num);
        System.out.println("Printing from main Integer in main is "+num);
    }
    
    public static void computeFinalPrice(float mBase,float mTax,float mFinalPrice){
        mFinalPrice= mBase*(mTax/100)+mBase;
        System.out.println("Printing from computeFinalPrice ----->base equal " +mBase+" Tax: "+mTax+" Final price "+mFinalPrice);
        
    }
    public static void computeFinal(SalesPrice mSalesPrice){
        mSalesPrice.setFinalPrice(mSalesPrice.getBase()*(mSalesPrice.getTax()/100)+mSalesPrice.getBase());
        System.out.println("Printing from ComputerFinalPrice"+mSalesPrice);
    }
    
    public static void numElevate(Integer num){
        System.out.println("Printing fron numElevateThe integer  is:" +num);
        num*=num;
        System.out.println("Printing fron numElevateThe integer  is:" +num);
    }
}
