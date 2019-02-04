/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab21.referenceddata.Customer.logic;

/**
 *
 * @author Omar Mejia
 */
public class SalesPrice {
    private float base;
    private float tax = 12;
    private float finalPrice;

public void computeFinalPrice(){
    finalPrice=base*(tax/100) + base;
    
}

    public SalesPrice(float base,float tax, float finalPrice) {
        this.base = base;
        this.tax= tax;
        this.finalPrice = finalPrice;
    }
    
    @Override
            public String toString(){
            String temp= "Object SalesPrice data------>base= "+base+ " tax:"+ tax  + " Fina Price: "+finalPrice;          
            return temp;    
            }
            
            
            


    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }
    

}

