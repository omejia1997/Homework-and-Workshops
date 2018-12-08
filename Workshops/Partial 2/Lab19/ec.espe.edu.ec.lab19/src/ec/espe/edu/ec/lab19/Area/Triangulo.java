/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab19.Area;

/**
 *
 * @author Omar Mejia
 */
public class Triangulo extends Figure{
   private float base;
   private float altura;
    private float area;
    
    @Override
    public float computerArea() {
    area=(base*altura)/2;
    return area;
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
   
    
}
