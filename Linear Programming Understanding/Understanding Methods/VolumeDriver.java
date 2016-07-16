//********************************************************************
// VolumeDriver.java       
//
// @uthor  Brandon Devera
// @version 10-Sept-2014
//********************************************************************

import java.util.Scanner;

public class VolumeDriver 
{
   //-----------------------------------------------------------------
   //  
   //  
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
     
      Scanner scan = new Scanner(System.in);  
      
      int length; 
      int height;
      int width;
      
      System.out.println("length is (m) ");
       
      length = scan.nextInt();
       
      System.out.println("width is (m) ");
       
      width = scan.nextInt();
       
      System.out.println("height is (m) ");
       
      height = scan.nextInt();
       
      Geometry geomObj = new Geometry();
      
      int Volume = geomObj.volume(length, width, height);

      System.out.println("Volume is " + Volume + " m^3");
       
 }
}

