/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture11_bills;

/**
 *
 * @author lab_services_student
 */
public class bill {
    private String strCustomer;
    private double dblMinutes, dblCost;
    
    public bill (String strName, double dblCostPerMinute, double dblMinutesTalked){
        strCustomer = strName;
        dblMinutes = dblMinutesTalked;
        dblCost = dblCostPerMinute;
        
        
        
    }
    
    public String getNmae(){
        return strCustomer;
        
        
    } 
      public double getTotalBills(){
          return ( dblMinutes * dblCost);
      }
               
    
}
