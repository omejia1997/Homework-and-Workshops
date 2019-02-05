/*
Ejercicio Hallar el perimetro y Area de un cuadrilatero dada la longitud de sus lados
SI es un cuadrado solo se proporcionara la longitud de uno de sus lados
 */

public class Area_Perimetro {
    int area;
    int per;
    
    public int Area(int num1,int num2){
    area = num1*num2;
    return area;
    }
    
    public int Perimetro(int num1,int num2){
        per = 2*num1+2*num2;
        return per;
    }
    
    public int AreaC(int num1){
        area= num1*num1;
        return area;
    }
    
    public int PerC(int num1){
        per = 4*num1;
        return per;
    }
}
