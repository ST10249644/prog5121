/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture11_bills;
import javax.swing.*;

/**
 *
 * @author lab_services_student
 */
public class Lecture11_bills {
    
   

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String strName = JOptionPane.showInputDialog(null, " Enter customer's name");
        double dblMinutesTalked =Double.parseDouble(JOptionPane.showInputDialog(null, " Enter the minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
        
        
        bill b = new bill(strName, dblMinutesTalked, dblCostPerMinute);
        
        JOptionPane.showMessageDialog(null, " CUSTOMER NAME:" + b.getName().toUpperCase() + "\n" + " Total Due :" + b.getTotalBills());
        
       
    }
}
