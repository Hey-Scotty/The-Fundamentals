/**
* TempConverter.java -- converterts either celcius to fahrenheit or vice versa
* 
* @author Tevin Scott
* @version 09/21/2014
*
*/

public class TempConverter
{
   public double cToF(double celcius)
   {
      double fahrenhiet = ((celcius * 9/5) + 32);
      fahrenhiet = Math.round(fahrenhiet *10)/10.0;
      return 
         fahrenhiet;
   }
   
   
   public double fToC(double fahrenhiet)
   {
      double celcius = ((fahrenhiet - 32) * 5/9);
      celcius = Math.round(celcius * 10)/10.0;
      return
         celcius;
   }   
}  
      