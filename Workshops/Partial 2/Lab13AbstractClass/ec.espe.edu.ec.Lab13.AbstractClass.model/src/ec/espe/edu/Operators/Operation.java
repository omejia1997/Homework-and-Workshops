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
public class Operation {
   float operand1;
   float operand2;
   float result;

    public Operation(float operand1, float operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

    public float getResult() {
        return result;
    }
   
}
