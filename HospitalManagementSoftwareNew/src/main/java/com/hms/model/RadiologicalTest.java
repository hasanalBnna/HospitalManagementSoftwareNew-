/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Banna
 */
public class RadiologicalTest extends LabTest {
   //  String title;
   //  double cost;
   //  boolean isAvailable;
    private String plateDimention;
    
    public RadiologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String plateDimention){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;  
        this.plateDimention = plateDimention;
    }
    
    public String returnRTest(){
        String output = "Test name: "+this.title+ "\r\n"
                + "plateDimention: "+this.plateDimention
                + " Cost: "+this.cost+"\r\n"
                + " Availability: "+this.isAvailable;
        return output;
    }

    public boolean returnRTestInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
