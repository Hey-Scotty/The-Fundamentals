/**
*  StringCheckerTest.java -- Tests the StringChecker class and its methods
*  @author Tevin Scott
*  @version 09/21/2014
*
*/
public class StringCheckerTest
{
   public static void main(String[] args)
   {  
      /*Tests the isUpperCase method within the StringTester class
      which checks for uppercase Letters within a string */
      //The first test case should be true
      String password = "";
      password = "Atr";
      StringChecker test = new StringChecker();
      boolean result;
      result = test.isUpperCase(password);
      System.out.println("the String " + password + " has an uppercase which will cause .isUpperCase checker to return: " + result);
      //the second test case should be false
      password = "atr";
      result = test.isUpperCase(password);
      System.out.println("the String " + password + " has no uppercase which will cause .isUpperCase checker to return: " + result);
      
      /*Tests the isLowerCase method within the StringTester class
      which checks for lower Letters within a string */
      //the first test case should be true
      password = "Atr";
      result = test.isLowerCase(password);
      System.out.println("the String " + password + " has an lowercase which will cause .isLowerCase checker to return: " + result);
      //the second test case should be false
      password = "ATR";
      result = test.isLowerCase(password);
      System.out.println("the String " + password + " has no lowercase which will cause .isLowerCase checker to return: " + result);
      
      /*Tests the numTester method within the StringTester class
      which checks for numeric values within a string */
      //the first test case will return true
      password = "7a";
      result = test.hasNum(password);
      System.out.println("the String " + password + " has a number wthin it which will cause .hasNum checker to return: " + result);
      
      password = "aTwo";
      result = test.hasNum(password);
      System.out.println("the String " + password + " has no numbers wthin it which will cause .hasNum checker to return: " + result);
   }
}