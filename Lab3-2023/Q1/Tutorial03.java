/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial03;

/**
 *
 * @author Shadow
 */
public class Tutorial03 {

    public static void main(String[] args) 
    {
       Test e1=new Test();
       e1.setName("Ravindu");
       e1.setAge(21);
       e1.setSalary(2000);
       System.out.println("Employee name is :"+e1.getName());
       System.out.println("Employee age is :"+e1.getAge());
       System.out.println("Employee Salary is :"+e1.getSalary());
       
       Test e2=new Test(21,2000,"Ravindu");
    }
}
