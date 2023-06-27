/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alloop;

/**
 *
 * @author Shadow
 */
abstract class BankAccount 
{
    private float balance;
    private int accNo;
    
    public void setBalance(float balance)
    {
        this.balance=balance;
    }
    public float getBalance()
    {
        return balance;
    }
    public void setAccNo(int accNo)
    {
        this.accNo=accNo;
    }
    public int getAccNo()
    {
        return accNo;
    }
    
    public abstract void calculateInterest();
}
