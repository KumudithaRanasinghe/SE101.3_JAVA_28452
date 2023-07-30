package com.mycompany.abstractclassexample;
public abstract class Shape 
{
    public abstract double calculateArea();
    
    public void display() {
        System.out.println("Area: " + calculateArea());
    }
}


