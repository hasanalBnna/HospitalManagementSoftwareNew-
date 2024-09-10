/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.*;
import com.hms.view.Home;
import java.awt.List;
import java.util.ArrayList;
/**
 *
 * @author Banna
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        new Home().setVisible(true);
        PathologicalTest iTest = new PathologicalTest("CBC", 400, true, "Chamical");
//        System.out.println(iTest.returnPTestInfo());
        
        RadiologicalTest rTest = new RadiologicalTest("X-ray", 400, true, " 2+2");
//        System.out.println(rTest.returnRTest());
        
        ArrayList<Object> array = new ArrayList<>();
        array.add(iTest);
        array.add(rTest);
        System.out.println(array);
        
    }
}
