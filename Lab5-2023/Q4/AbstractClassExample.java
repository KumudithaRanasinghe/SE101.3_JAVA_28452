package com.mycompany.abstractclassexample;
public class AbstractClassExample 
{
    public static void main(String[] args) 
    {
       Shape circle = new Circle(5.0);
       Shape rectangle = new Rectangle(4.0, 6.0);
       circle.display();
       rectangle.display();
    }
}

    