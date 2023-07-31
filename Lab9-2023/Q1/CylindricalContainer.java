
package com.mycompany.main;


public class CylindricalContainer extends Container {
    private double radius;
    private double height;
    
    public CylindricalContainer(double R, double H)
    {
        radius = R;
        height = H;
    }
    
    @Override
    double volume(){
        return 3.14159*radius*radius*height;
    }
    
}
