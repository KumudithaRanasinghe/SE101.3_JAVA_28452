/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial03_2;

/**
 *
 * @author Shadow
 */
public class Test 
{
    private String empName;
    private int salary,bonus,bonusam;
    
    public Test(int bonus)
    {
        this.bonus=bonus;
    }
    
    public void setName(String empName)
    {
        this.empName=empName;
    }
    public String getName()
    {
        return empName;
    }
    
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return salary;
    }
    public void Bonus()
    {
        System.out.println("Bonus : "+bonus);
        bonusam=bonus+salary;
        System.out.println("Bonus Amount :"+bonusam);
    }
    
}
