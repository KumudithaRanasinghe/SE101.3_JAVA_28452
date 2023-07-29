/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical02;

/**
 *
 * @author Shadow
 */
public class Item 
{
    protected int location;
    protected String description;
    
    public  Item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }
    public void setLocation( int location)
    {
        this.location=location;
    }
    public int getLocation()
    {
        return location;
    }
    public void setDescription( String description)
    {
        this.description=description;
    }
    public String getDescription()
    {
        return description;
    }
}
