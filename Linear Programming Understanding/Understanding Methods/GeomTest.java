//********************************************************************
//  Geometry.java       
//
// @uthor  Brandon Devera
// @version 10-Sept-2014
//********************************************************************

import java.util.Scanner;

public class GeomTest
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
      
       System.out.println("width is ");
       
       width = scan.nextInt();
       
       System.out.println("height is ");
       
       height = scan.nextInt();
       
       Geometry geomObj = new Geometry();
       
       int recArea = geomObj.area(height, width);
       
System.out.println("The area of a rectangle with height " 
                 + height + " and width " + width 
                 + " is " + recArea);

       
       
  
   }
}
