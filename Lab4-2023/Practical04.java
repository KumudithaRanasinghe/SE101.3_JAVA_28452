/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical04;

/**
 *
 * @author Shadow
 */
public class Practical04 
{

    public static void main(String[] args) 
    {
        Employee mrBogdan = new Employee();
        mrBogdan.setEmpID(28452);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        Employee msBird = new Employee();
        msBird.setEmpID(28453);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("HR Manager");
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
        
    }
}
