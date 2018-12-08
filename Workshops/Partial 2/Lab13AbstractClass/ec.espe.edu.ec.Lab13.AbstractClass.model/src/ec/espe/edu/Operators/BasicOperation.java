/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Operators;

/**
 *
 * @author Omar Mejia
 */
public class BasicOperation {
    private float operand1;
    private float operand2;
    private float result;
    
    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }
    
    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

    public float getResult() {
        return result;
    }
    
    public BasicOperation(float operand1, float operand2, float result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = 0;
    }
    
    public float add(){
        result=operand1+operand2;
        return result;
    }
    
    public float rest(){
        result=operand1-operand2;
        return result;
    }
    
    public float mul(){
        result=operand1*operand2;
        return result;
    }
    
    public float div(){
        result=operand1*operand2;
        return result;
    }
}
