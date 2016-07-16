/**
* Password.java -- generates passwords with .generatePassword method & tests password complexity with .passwordStrength method
*
* @author Tevin Scott
* @version 09/21/2014
*/
public class Password
{  
   //password generator
   public String generatePassword(int pwLength)
   {
     CharGenerator charGen = new CharGenerator();
     String password = "";
     
     while(pwLength >= 0)
     {
         password+= charGen.randomChar();
         pwLength--;
     } 
      
     return
         password;
   }
   //tests password strength
   public int passwordStrength(String password)
   {  
      int strengthVal = 0;
      StringChecker tester = new StringChecker();
      
      boolean upperCase = tester.isUpperCase(password);
      boolean lowerCase = tester.isLowerCase(password);
      boolean hasNum = tester.hasNum(password);

      //return for strength 4 
       if ((password.length() >= 8) && (upperCase) && (lowerCase) && (hasNum))
         strengthVal = 4;
         
      //returns for strength 3
      else if (((password.length() >= 8) && (upperCase) && (hasNum)))        
         strengthVal = 3;
      else if (((password.length() >= 8) && (lowerCase) && (hasNum)))        
         strengthVal = 3;
      
      //return for strength 2   
      else if ((password.length() >= 8) && (upperCase) && (lowerCase))
         strengthVal = 2;
      
      //all the returns for strength of 1
      else if (password.length() < 8)
         strengthVal = 0;
      else if ((password.length() >= 8) && (upperCase))
         strengthVal = 1;
      else if ((password.length() >= 8) && !(upperCase))
         strengthVal = 1;
      else if ((password.length() >= 8) && (hasNum))
         strengthVal = 1;
         
         
      return strengthVal; 
      
        
   }    
}   