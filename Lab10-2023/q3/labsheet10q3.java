package com.mycompany.Labsheet10q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class labsheet10q3 {

    public static void main(String[] args)
    {
        
   try
    {
        File file= new File("nonexisten.txt");
       try (Scanner sc = new Scanner(file)) {
           while(sc.hasNextLine())
           {
               String line=sc.nextLine();
               System.out.println(line);
           }
       }
    }
   
   catch(FileNotFoundException e)
   {
       System.out.println("Error: File not found.");
   }
}
}
