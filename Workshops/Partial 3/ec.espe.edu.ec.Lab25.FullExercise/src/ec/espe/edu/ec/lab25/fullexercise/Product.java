/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab25.fullexercise;

import ec.espe.edu.ec.lab25.fullexercise.utils.FileManager;
import java.io.File;
import java.util.ArrayList;

public class Product {
private String id;
private String name;
private float precio;
private int porcentaje;
private float valorTotal;
public Product(){
    
}

    public Product(String id, String name, float precio, int porcentaje, float valorTotal) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.porcentaje = porcentaje;
        this.valorTotal = valorTotal;
    }



    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    public void addProduct(String idSt,String nameSt,String precioSt, String porcentajeSt,File file){
        String txt;
        precio=Float.parseFloat(precioSt);
        porcentaje = Integer.parseInt(porcentajeSt);
        valorTotal = (porcentaje/100)+precio;
        txt = idSt +";"+nameSt+";"+";"+precioSt+";"+porcentajeSt+";"+valorTotal;
        FileManager.write(file, txt);
    }
    

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }


}
