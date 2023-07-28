
package com.mycompany.practical01;

public class Practical01 
{

    public static void main(String[] args)
    {
        //1
        System.out.println("Hello World!");
        
        //2
        
        System.out.println("Ravindu");
        System.out.println("Bsc(Hons) in Software Engineering");
        
        //3
        for(int i=0;i<5;i++)
        {
            System.out.println("Executing loop "+i);
        }
        
        int x = 0;
        while(x<5)
        {
            System.out.println("Executing loop "+x);
            x++;
        }
        
        //4
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers )
        {
         if( x == 30 )
         {
	    //break;
             continue;
         }
         System.out.print( x );
         System.out.print("\n");
        }
          System.out.print("I’m  out of the Loop now");
        
        //5
        char grade ='A';
	switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	break;
       	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	//break;
	default :
	System.out.println("Invalid grade");
	}
        char   grade='A';
        
        
        if(grade== 'A')
        {
            System.out.println("Excellent!"); 
         
        }
        else if(grade== 'D')
        {
            System.out.println("You passed"); 
         
        }
        else if(grade== 'F')
        {
            System.out.println("Better try again"); 
         
        }
        else
        {
            System.out.println("Invalid grade");
        }
        
        
	System.out.println("Your grade is " + grade);  
        
        //6
        
        int [] numbers = {10, 20, 30, 40, 50};
     	for(int x : numbers )
        {
             System.out.print( x );
             System.out.print(",");
      	}
	 System.out.print("\n");
      	String [] names ={"James", "Larry", "Tom", "Lacy"};
      	for( String name : names ) 
        {
            System.out.print( name );
            System.out.print(",");
        }
   
    }
}
