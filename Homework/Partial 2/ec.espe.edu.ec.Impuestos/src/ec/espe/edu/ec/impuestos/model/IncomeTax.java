/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.impuestos.model;

/**
 *
 * @author Omar Mejia
 */
public class IncomeTax {
private float anualIncomes;
private float housingExpense;
private final float income=9.45f;
private float educationExpenses;
private float foodExpense;
private float clothingExpenses;
private float healthExpense;
private float totalExpenses;

    public float getHousingExpense() {
        return housingExpense;
    }

    public void setHousingExpense(float housingExpense) {
        this.housingExpense = housingExpense;
    }

    public float getEducationExpenses() {
        return educationExpenses;
    }

    public void setEducationExpenses(float educationExpenses) {
        this.educationExpenses = educationExpenses;
    }

    public float getFoodExpense() {
        return foodExpense;
    }

    public void setFoodExpense(float foodExpense) {
        this.foodExpense = foodExpense;
    }

    public float getClothingExpenses() {
        return clothingExpenses;
    }

    public void setClothingExpenses(float clothingExpenses) {
        this.clothingExpenses = clothingExpenses;
    }

    public float getHeathExpense() {
        return healthExpense;
    }

    public void setHeathExpense(float heathExpense) {
        this.healthExpense = heathExpense;
    }

    public float calculateAnualNetIncome(float salary){
        float iessContribution;
        iessContribution= ((salary *income)/100);
        anualIncomes=(salary-iessContribution)*12;
        return anualIncomes;
    }
    
    public float calculateTotalDeductibleExpenses(float clothingExpenses,float educationExpenses,float foodExpense,float healthExpense,float housingExpense){
        totalExpenses = (clothingExpenses+educationExpenses+foodExpense+healthExpense+housingExpense);
        return totalExpenses;
    }
    
    public float calculateTaxBase(float anualIncomes,float totalExpenses){
    float taxBase=anualIncomes-totalExpenses;
    return taxBase;
    }
    
    public float CalculateTotalToPay(float taxBase){
        float calculate=0;
        float pay = 0;
        if((taxBase>0) && (taxBase<= 11270)){
        pay=0;
        }else if((taxBase>11270) && (taxBase<= 14360)){
        calculate = ((taxBase-11270)*5)/100;
        pay=calculate;
        }else if((taxBase>14360) && (taxBase<= 17950)){
        calculate = ((taxBase-14360)*10)/100;
        pay=155+calculate;
        }else if((taxBase>17950) && (taxBase<= 21550)){
        calculate = ((taxBase-17950)*12)/100;
        pay=514+calculate;
        }else if((taxBase>21550) && (taxBase<= 43100)){
        calculate = ((taxBase-21550)*15)/100;    
        pay=946+calculate;
        }else if((taxBase>43100) && (taxBase<= 64630)){
        calculate = ((taxBase-43100)*20)/100;    
        pay=4178+calculate;
        }else if((taxBase>64630) && (taxBase<= 86180)){
        calculate =((taxBase-64630)*25)/100 ;    
        pay=8484+calculate;
        }else if((taxBase>86180) && (taxBase<= 114890)){
        calculate = ((taxBase-86180)*30)/100;    
        pay=13872+calculate;
        }else if((taxBase>114890)){
        calculate = ((taxBase-114890)*35)/100;    
        pay=22485+calculate;
        }
        return pay;
    }
}
