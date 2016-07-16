//********************************************************************
// VolumeDriver.java       
//
// @uthor  Brandon Devera
// @version 10-Sept-2014
//********************************************************************

import java.util.Scanner;

public class Density 
{
   //-----------------------------------------------------------------
   //  
   //  
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
     
      Scanner scan = new Scanner(System.in);  
      double mass;
      double length; 
      double height;
      double width;
      
      System.out.println("mass is (KG) ");
      
      mass = scan.nextDouble();
      System.out.println("length is (m)");
       
      length = scan.nextDouble();
       
      System.out.println("width is (m)");
       
      width = scan.nextDouble();
       
      System.out.println("height is (m)");
       
      height = scan.nextDouble();
       
      Geometry geomObj = new Geometry();
      
      double Density = geomObj.density(mass, length, width, height);

      System.out.println("Density is " + Density " KG/m^3");
       
 }
}

