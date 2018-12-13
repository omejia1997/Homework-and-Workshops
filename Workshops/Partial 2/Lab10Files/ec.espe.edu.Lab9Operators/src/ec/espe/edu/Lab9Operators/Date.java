/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Lab9Operators;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Omar Mejia
 */
public class Date {
 int resp1;
    
    public Date() {
    }
   
    
    public int  CalculateYear(int age,int mes,int day ) 
        {
        Calendar cal = new GregorianCalendar();
        Operation calculo= new Operation();
        int rage,rmonth,rday;
        int ageactually=cal.get(Calendar.YEAR);
        int meslly=cal.get(Calendar.MONTH)+1;
        int daylly=cal.get(Calendar.DAY_OF_MONTH);
        rage=calculo.rest(ageactually, age);
        rmonth=calculo.rest(meslly, mes);
        yearbisiest(age);
        if((yearbisiest(age)==true)&&(mes==2)&&(day==29)){
            rage=rage/4;
            System.out.println("Tu cumpleaños es en año bisistesto y tienes "+rage+ " Años"); 
            //String datas=nameperson+";"+age+";"+mes+";"+day+";"+rage;
            return rage;
           
        }else{
            
        if ((day<0|day>31)||(mes<0|mes>12)||(age<0|age>ageactually)){
            System.out.println("Ha ingresado mal el dia");
           return rage=-1;
        }
        if (day>daylly){
            rmonth=rmonth-1;
        }
          rday=calculo.rest(daylly, day);
        if(rday<0){
            rday=rday+31; 
    }
        if(meslly==mes){
            rmonth=0;
        }
        
    if(rage<0 |rmonth<0|rday<0 && age==ageactually){
          //JOptionPane.showMessageDialog(null,"Usted auno nace");
          //Pregunta();z
          return rage=-1;
      }
     if(mes>meslly){
          rmonth=rmonth+12;
      }
         if (ageactually==age&&day==daylly&&mes==meslly){
            //JOptionPane.showMessageDialog(null,"Nacio Hoy");
            //Pregunta();
            return rage=0;
        }
        }
        //JOptionPane.showMessageDialog(null,nameperson+" tu tienes "+rage+" años "+rmonth+" meses y "+rday+" dias de vida");
        //String datas=nameperson+";"+age+";"+mes+";"+day+";"+rage;
       return rage;
        
    }

     public boolean  yearbisiest(int age){
         if((age % 4==0)&&(age % 100==0)|(age % 400==0)){
             System.out.println("el año es bisiseto");
             return true;
         }else{
                     return false;
                     }   
         } 
}
