/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.tallertiroparabolico;

/**
 *
 * @author Omar Mejia
 */
public class Calculo {
    private double velocidad;
    private double angulo;
    private final double gravedad = 9.8f;

    public Calculo(){
        
    }
    public Calculo(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    
    public double calcularAngulo(double velocidad,double angulo){
        double calculo = ((Math.sin(2*angulo))/9.8);
        calculo= calculo*(velocidad)*(velocidad);
        return calculo;
    }
    
    
    
}
