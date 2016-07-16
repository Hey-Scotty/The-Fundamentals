/**
* LetterGrade.java - prints a LetterGrade based on score out of 100.
* 
* @author Tevin Scott
* @version 09/17/2014
*/

public class Conditionals
{
   public char grades(double numGrade)
   {  
      char letterGrade;
      
      if (numGrade >= 90)  
      {   
         letterGrade = 'A';
      }
      else if (numGrade >= 80) 
      {  
         letterGrade = 'B'; 
      }
      else if (numGrade >= 70) 
      {  
         letterGrade = 'C'; 
      }
      else if (numGrade >= 60) 
      {  
         letterGrade = 'D';
      }
      else 
      {  
         letterGrade = 'F'; 
      }
      return letterGrade;
   }
}   