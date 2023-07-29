/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial03;

/**
 *
 * @author Shadow
 */
public class Test 
{
    private int age;
    private float salary;
    private String name;
    
    public Test(int a, float b , String n)
    {
        a=age;
        b=salary;
        n=name;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
