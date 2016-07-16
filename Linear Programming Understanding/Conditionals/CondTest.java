/**
* ConTest.java - Tests LetterGrade method
* 
* @author Tevin Scott
* @version 09/17/2014
*/

public class CondTest
{
   public static void main(String[]args)
   {
      LetterGrade condObj = new LetterGrade();
      char letterGrade;
      double numGrade;
      numGrade = 95;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade); 
      
      numGrade = 90;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade); 
      
      numGrade = 89.9;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
      numGrade = 85;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
      numGrade = 80;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      

      numGrade = 79;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      

      numGrade = 79.99;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
      

      numGrade = 70;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
      numGrade = 69.9;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
      numGrade = 60;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
      numGrade = 59.9;
      letterGrade = condObj.grades(numGrade);
      System.out.println("The output of " + numGrade + " should be: " + letterGrade);
      
   } 
}   