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
public class MiHelper {
    MiHelper(){
        
    }
    
    public void validatePassword(String pass,String rpass)throws CustomException{
    if(pass.equals(rpass)==false){
        throw new CustomException("Los campos del Password no coincoden");
    }
    if(pass.length()<8){
        throw new CustomException("El password no es losuficientemente largo");
    }
    }
    
}
