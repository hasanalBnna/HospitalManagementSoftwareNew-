/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Banna
 */
public abstract class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;
     
     public LabTest(){}
     public LabTest(String title,
             double cost,
             boolean isAvailable){
         this.title = title;
         this.cost = cost;
         this.isAvailable = isAvailable;
         
     }
     public String returnLabTestInfo(){
         String output = "Test name :"+this.title+"\n"
                 +"Cost :"+this.cost+"\n"
                 +"Avaiablity :"+this.isAvailable;
         return output;
     }
     
     public abstract boolean deliverReport();
     
     public abstract double CalCost();
}
