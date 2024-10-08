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
     
    @Override
     public String toString(){
         return "Test name :"+this.title+"\n"
                 +"Cost :"+this.cost+"\n"
                 +"Avaiablity :"+this.isAvailable;
     }

//    @Override
//    public String toString() {
//        return "LabTest{" + "title=" + title + ", cost=" + cost + ", isAvailable=" + isAvailable + '}';
//    }
     
     public abstract boolean report();
     
     public abstract double CalCost();
}
