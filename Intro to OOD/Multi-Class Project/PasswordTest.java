/**
* PasswordTest.java -- tests the Password class and its methods*
* @author Tevin Scott
* @version 09/21/2014
*/
public class PasswordTest
{
   public static void main(String[] args)
   {  
      //Generates password
      String password = "";
      int pwLength = 10;
      Password pw = new Password();
      password = pw.generatePassword(pwLength);
      System.out.println(password);
 
      
      int strengthVal;
      strengthVal = pw.passwordStrength(password);
      System.out.println(strengthVal); 
      
      password = "a";
      strengthVal = pw.passwordStrength(password);
      System.out.println("If the password's length is equal to or less than eight its strength is: " + strengthVal); 
      
      password = "helloworld";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and is all lowercase its strength is: " + strengthVal); 
      
      password = "HELLOWORLD";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and is all uppercase its strength is: " + strengthVal); 
      
      password = "12345678";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and is all numeric its strength is: " + strengthVal); 
      
      password = "HelloWorld";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and contains a uppercase and lowercase letter its strength is: " + strengthVal); 
      
      password = "HELLOWWORLD2";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and contains just uppercase letters, and numbers its strength is: " + strengthVal);
      
      password = "helloworld2";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and contains just lowercase letters, and numbers its strength is: " + strengthVal);
       
       
      
      password = "HelloWorld2";
      strengthVal = pw.passwordStrength(password);
      System.out.println("if the password length is equal to or greater than eight and contains  lowercase and uppercase letters, and numbers its strength is: " + strengthVal); 
      
      
      
           
   }
}        
      