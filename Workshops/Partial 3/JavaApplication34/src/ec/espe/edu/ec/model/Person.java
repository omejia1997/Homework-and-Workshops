/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.model;

/**
 *
 * @author Omar Mejia
 */
public class Person {
private String lastName;
private String user;
private String password;
private float sueldoHora;
private int horasTrabajadas;
private float iessContribution;
private float sueldoTotal;

final private float impuesto = 9.45f;
 
public Person(){
    
}

    public Person(String lastName, float sueldoHora, int horasTrabajadas) {
        this.lastName = lastName;
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Person(float sueldoTotal, float iessContribution) {
        this.sueldoTotal = sueldoTotal;
        this.iessContribution = iessContribution;
    }
    
    
    
    public Person(String lastName, float sueldoHora, int horasTrabajadas, float sueldoTotal, float iessContribution) {
        this.lastName = lastName;
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoTotal = sueldoTotal;
        this.iessContribution = iessContribution;
    }

    

    public float calculateSalaryForHour(int horasTrabajadas,float sueldoHora){
        sueldoTotal = horasTrabajadas*sueldoHora;        
        return sueldoTotal;
    }
    
    public float calculoIees(float sueldoTotal){
        iessContribution = sueldoTotal*impuesto;
        return iessContribution;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(float sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(float sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public float getIessContribution() {
        return iessContribution;
    }

    public void setIessContribution(float iessContribution) {
        this.iessContribution = iessContribution;
    }

}
