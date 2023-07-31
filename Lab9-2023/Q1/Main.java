

package com.mycompany.main;


public class Main {

    public static void main(String[] args) {
        CylindricalContainer c1 = new CylindricalContainer(7f,10f);
                
                double cvol = c1.volume();
                System.out.println("Volume: "+cvol);
    }
}
