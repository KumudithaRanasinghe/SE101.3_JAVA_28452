/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial03_2;

/**
 *
 * @author Shadow
 */
public class Tutorial03_2 
{

    public static void main(String[] args) 
    {
        Test e1=new Test(10000);
        e1.setName("Bogdon");
        e1.setSalary(50000);
        System.out.println("Employee Name : "+e1.getName());
        System.out.println("Basic Salary : "+e1.getSalary());
        e1.Bonus();
    }
}
