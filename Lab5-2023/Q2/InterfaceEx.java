package com.mycompany.interfaceex;
public class InterfaceEx 
{
    public static void main(String[] args) 
    {
       Speaker politician=new Politician();
       Speaker priest=new Priest();
       Speaker lecturer=new Lecturer();
       System.out.println("Speech from a Politician:");
       politician.speak();
       System.out.println("\nSpeech from a Priest:");
       priest.speak();
       System.out.println("\nSpeech from a Lecturer:");
       lecturer.speak();
    }
}
