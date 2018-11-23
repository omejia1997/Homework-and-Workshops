/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.du.ec.lab16.exceptions.Operation;

/**
 *
 * @author Omar Mejia
 */
public class Operation {
    
    
    public float divid(float dividend, float divisor){
        float quotient;
        quotient = dividend/divisor;
        return quotient;
    }
    
    public short add(short operand1, short operand2){
        short result;
        result = (short) (operand1 + operand2);
        return result;
    }
    
    public float addfloat(float operand1,float operand2){
        float result;
        result = operand1+operand2;
        return result;
    }
}
