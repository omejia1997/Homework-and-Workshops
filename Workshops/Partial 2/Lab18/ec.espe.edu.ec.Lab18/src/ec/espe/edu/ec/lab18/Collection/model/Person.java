/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.lab18.Collection.model;

/**
 *
 * @author Omar Mejia
 */
public class Person {
    private int id;
    private String name;
    private float salary;

    @Override
    public String toString(){
        String tmString;
        tmString= id +";" +name+";"+ salary; 
                return tmString;
    }
    public Person(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
 

