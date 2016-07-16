public class Count
{
   public void countUp(int start, int finish)
   {
      if(start <=finish)
      {
         while(start <= finish)
         {
            System.out.println(start);
            start++;
         }
      }
      else 
         countDown(start, finish);
   }
   
   public void countDown( int start, int finish)
   {
      if(start >= finish)
      {
         while (start >= finish)
         {
            System.out.println(start);
            start--;
         }   
      }
      else  
         countUp(start, finish);
   }
   
   public void accumulator( int start, int finish)
   {  
      int accumulator = 0;
      while (start <= finish)
      { 
         accumulator += start;
         start++;
      }
      System.out.println(accumulator);
   }      
}    