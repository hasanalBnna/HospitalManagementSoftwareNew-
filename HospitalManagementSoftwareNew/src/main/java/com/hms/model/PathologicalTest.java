
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import com.hms.model.LabTest;

/**
 *
 * @author Banna
 */
public class PathologicalTest extends LabTest implements TestReport, CostCalculation {
//     String title;
//     double cost;
//     boolean isAvailable;
    private String reagent;
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        
    }
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String reagent){
        super(title,cost,isAvailable);
        this.reagent = reagent;
    }
    @Override
    public String toString(){
      String output = super.toString()+"\n"
              +"Reagent: "+this.reagent+"\n";
      return output;
    }

    @Override
    public boolean deliverReport() {
        return false;
    }
    @Override
    public boolean report() {
        return false;
    }

    public String show(){
        String output = "Test name: "+this.title+ "\r\n"
                + " Cost: "+this.cost+"\r\n"
                + " Availability: "+this.isAvailable+ "\r\n"
                + "Info: "+this.reagent;
        return output;
    }
    void search(String title){
        if(this.title == title)
            show();
        else
            System.out.println("Not found");
    }

    /**
     * @return the title
     */
//    public String getTitle() {
//        return title;
//    }
//
//    /**
//     * @param title the title to set
//     */
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    /**
//     * @return the cost
//     */
//    public double getCost() {
//        return cost;
//    }
//
//    /**
//     * @param cost the cost to set
//     */
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//    /**
//     * @return the isAvailable
//     */
//    public boolean isIsAvailable() {
//        return isAvailable;
//    }
//
//    /**
//     * @param isAvailable the isAvailable to set
//     */
//    public void setIsAvailable(boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }
    
//    public String returnLabTestInfo(){
//        String output = "Test name: "+this.getTitle()+ "\r\n"
//                + " Cost: "+this.getCost()+"\r\n"
//                + " Availability: "+this.isIsAvailable();
//        return output;
//    }
//    }

    public String returnPTestInfo() {
        String output = "Test name: "+this.title+ "\r\n"
                +"Reagent: "+this.reagent+ "\r\n"
                + "Cost: "+this.cost+"\r\n"
                + "Availability: "+this.isAvailable;
        return output;
    }
    @Override
    public double CalCost(){
        double totalCost= 0;// = this.cost - this.cost*
                return totalCost;
    }
    



    
    

    
}
