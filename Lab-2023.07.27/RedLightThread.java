/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_7_27;

/**
 *
 * @author Shadow
 */
public class RedLightThread extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Red light");
        
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        }
        
    }
}
