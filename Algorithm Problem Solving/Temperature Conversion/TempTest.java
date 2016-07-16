/**
* TempTest.java -- demonstrates the TempConverter methods
* 
* @author Tevin Scott
* @version 09/21/2014
*
*/
public class TempTest
{
   public static void main(String[] args)
   {
      TempConverter converter = new TempConverter();
      double celcius;
      double fahrenheit;
      celcius = 0;
      fahrenheit = converter.cToF(celcius);
      System.out.println("0 degrees celcius should return 32 degrees fahrenheit, the result of the converter is: " + fahrenheit + " degrees.");
      
      fahrenheit = 100;
      celcius = converter.fToC(fahrenheit);
      System.out.println("100 degrees fahrenheit should return 37.8 degrees celcius, the result of the converter is: " + celcius + " degrees."); 
   }
   
}      