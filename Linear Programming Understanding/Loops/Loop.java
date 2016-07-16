import java.util.Scanner;

public class Loop
{
   public static void main(String[] args)
   {
      //user input for start and stop to control the range of numbers printed    
      Scanner scan = new Scanner(System.in);
      
      int start;
      int stop; 
      
      start=1;
      int accumulator = 0;  
      while (start <= 10)
      {
         accumulator += start;
         start++;
      }   
      System.out.println(accumulator);
      
      System.out.print("please enter your start number: ");
      start = scan.nextInt();
      System.out.print("please enter your finish number: ");
      stop = scan.nextInt();
      accumulator = 0;
      while(start <= stop)
      {  
         accumulator += start;
         start ++;       
      }  
       System.out.println(accumulator);
   }
}         