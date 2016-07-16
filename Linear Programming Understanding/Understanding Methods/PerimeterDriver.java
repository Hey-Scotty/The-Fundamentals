//********************************************************************
// PerimeterDriver.java       
//
// @uthor  Brandon Devera
// @version 10-Sept-2014
//********************************************************************

import java.util.Scanner;

public class PerimeterDriver 
{
   //-----------------------------------------------------------------
   //  
   //  
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
     
      Scanner scan = new Scanner(System.in);  
   
      int height;
      int width;
      
       System.out.println("width is (m) ");
       
       width = scan.nextInt();
       
       System.out.println("height is (m) ");
       
       height = scan.nextInt();
       
      Geometry geomObj = new Geometry();
      
     int perimeter = geomObj.area( width, height);

       System.out.println("perimeter is: " + perimeter + " m^2");
       
 }
}

