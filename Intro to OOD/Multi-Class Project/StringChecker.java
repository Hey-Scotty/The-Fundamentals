/**
* StringChecker.java -- checks for uppercase, lowercase, and numbers within a given string
*
*@author Tevin Scott
*@version 09/21/2014
*/ 

public class StringChecker
{
   public boolean isUpperCase(String testCase)
   {    
      int i = 0;
      boolean checker = false;
      while ( i < testCase.length() && (checker == false))
      {
         String test =  testCase.charAt(i) + "";
         checker = test.matches("[A-Z]");
         i++;  
     
      }
      return
         checker;
   }
   public boolean hasNum(String testCase)
   {    
      int i = 0;
      boolean checker = false;
      while ( i < testCase.length() && (checker == false))
      {
         String test =  testCase.charAt(i) + "";
         checker = test.matches("[0-9]");
         i++;  
     
      }
      return
         checker;    
   }
   public boolean isLowerCase(String testCase)
   {    
      int i = 0;
      boolean checker = false;
      while ( i < testCase.length() && (checker == false))
      {
         String test =  testCase.charAt(i) + "";
         checker = test.matches("[a-z]");
         i++;  
     
      }
      return
         checker;
   }
}       