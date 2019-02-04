/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab20.CustomExceptions;

/**
 *
 * @author Omar Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user="Omar1997";
        String password="1726";
        String repassword="1726";
        
        MiHelper miHelper = new MiHelper();
        try{
            miHelper.validatePassword(password, repassword);
            
        }catch(CustomException e){
            System.out.println("No es posible registrar el usuario debido a:"+e.getMessage());
            e.printStackTrace();
        }
    }
    
}
