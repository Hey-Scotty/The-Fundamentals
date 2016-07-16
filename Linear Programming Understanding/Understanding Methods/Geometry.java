/**
* Beer.java - prints a story.
* 
* @author Tevin Scott
* @author 
* @version 08/29/2014
*/
// Contains geometry methods.
public class Geometry
{
 
      public int area(int height, int width)
      { 
         return (height * width);
      }
      public int perimeter( int height, int width)
      {
         return ((height * 2) + (width * 2));
      }
      public int volume(int length, int height,int width)
      {  
         return (height * width * length);
      }
      public double density (double mass, double length, double height, double width)
      { 
         return (mass  / (length * height * width));
      }   
}