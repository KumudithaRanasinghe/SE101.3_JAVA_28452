/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labsheet_7_27;

/**
 *
 * @author Shadow
 */
public class LabSheet_7_27 
{

    public static void main(String[] args) 
    {
        RedLightThread r1=new RedLightThread();
        YellowLightThread y1=new YellowLightThread();
        GreenLightThread g1=new GreenLightThread();
        Thread obj1= new Thread(r1);
        Thread obj2= new Thread(y1);
        Thread obj3= new Thread(g1);
        obj1.start();
        obj2.start();
        obj3.start();
        
        
        
        
        
       
    }
}
