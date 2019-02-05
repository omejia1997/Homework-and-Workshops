
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int forma,lado,lado1,lado2;
        Area_Perimetro op = new Area_Perimetro();
        System.out.println("¿Su cuadriltaero tiene la forma cuadrada?");
        System.out.println("1. Si");
        System.out.println("2. No");
        forma = entrada.nextInt();
        if(forma==1){
            System.out.print("Ingrese la longitud del lado del cuadrlatero: ");
            lado = entrada.nextInt();
            System.out.println("El perimetro de su cuadrilatero es de: "+op.PerC(lado));
            System.out.println("El Area de su cuadriltaero es de: "+op.AreaC(lado));
        }else if(forma==2){
            System.out.print("Ingrese la longitud del lado 1 del cuadrlatero: ");
            lado1 = entrada.nextInt();
            System.out.print("Ingrese la longitud del lado 2 del cuadrlatero: ");
            lado2 = entrada.nextInt();
            System.out.println("El perimetro de su cuadrilatero es de: "+op.Perimetro(lado1, lado2));
            System.out.println("El Area de su cuadriltaero es de: "+op.Area(lado1, lado2));
          
        }
        
    }
}
