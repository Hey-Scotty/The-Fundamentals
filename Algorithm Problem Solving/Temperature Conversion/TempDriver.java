/**
* TempDriver.java -- user input to test TempConverter methods
* 
* @author Tevin Scott
* @version 09/21/2014
*/
import java.util.Scanner;

public class TempDriver
{
   private static Scanner scan;

public static void main(String[]args)
   {
      double fahrenheit;
      double celcius;
      int checker;
      
      TempConverter converter = new TempConverter();
      scan = new Scanner(System.in);
      System.out.println("Enter: 1. to quit\n" + "Enter: 2. to Convert from Fahrenheit to Celsius\n" +
      "Enter: 3. to convert from Celcius to Fahrenheit.");
      checker = scan.nextInt();
      if(checker == 1)
      {
         System.out.println("the program will now end.");
         System.exit(0);
      }   
      else if (checker == 2)
      {  
         System.out.print("please enter Fahrenheit Temperature: ");
         fahrenheit = scan.nextDouble();
         celcius = converter.fToC(fahrenheit);
         System.out.println("the celcius temperature is: " + celcius);    
      }
      else if (checker == 3)
      {
         System.out.print("please enter Celcius Temperature: ");
         celcius = scan.nextDouble();
         fahrenheit = converter.cToF(celcius);
         System.out.println("the Fahrenheit temperature is: " + fahrenheit);
      }   
   }
}      