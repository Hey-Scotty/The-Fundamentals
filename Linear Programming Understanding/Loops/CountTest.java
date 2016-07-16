

public class CountTest
{
   public static void main(String[] args)
   {
      int start = 4;
      int stop = 10;
      System.out.println("this is a standard test senario: ");
      Count counter = new Count();
      counter.countUp(start,stop);
      
      start = 1;
      stop = 1;
      System.out.println("this is what happens if the values are the same: ");
      counter.countUp(start,stop);
      
      start = 0;
      stop = 1;
      System.out.println("this is what happens if the start is less than the stop: ");
      counter.countUp(start,stop);
      
      start = 2;
      stop = 5;
      System.out.print("test case 1: ");
      counter.accumulator(start, stop);
            
      start = 9;
      stop = 20;
      System.out.print("test case 2: ");
      counter.accumulator(start, stop);
      
      start = 6;
      stop = 15;
      System.out.print("test case 3: ");

      counter.accumulator(start, stop);
   }
   
}      
      
      