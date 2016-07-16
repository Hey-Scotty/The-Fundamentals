import java.util.Random;

public class CharGenerator
{
   public char randomChar()
   {
      final int NUM_CHARS = 62; 

      Random rand = new Random();
      int num = rand.nextInt(NUM_CHARS);
   
      if (num <= 9)
         num += 48;
      else if (num <= 35)
         num += 55;
      else
         num += 61;

      return (char) num;
   }   
}
