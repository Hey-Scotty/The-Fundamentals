import java.util.Scanner;

public class StoryDriver
{
	public static void main(String[]args){
		String adj1; 
		String name; 
		String noun; 
		String largeNum; 
		String star; 
		String adj2; 
      	String num;
      	String tale;
      
      	Scanner scan = new Scanner(System.in);
      	System.out.print("Enter an adjective :"); 
      	adj1 = scan.nextLine();
      	System.out.println();
      	
      	System.out.print("Enter a name:");
      	name = scan.nextLine();
      	System.out.println();
  
      	System.out.print("Enter a noun:");
      	noun = scan.nextLine();
      	System.out.println();
      	
      	System.out.print("Enter a large number:");
      	largeNum = scan.nextLine();
      	System.out.println();
      	
      	System.out.print("Enter a famous person's name:");
      	star = scan.nextLine();
      	System.out.println();
      	
      	System.out.print("Enter another adjective:");
      	adj2 = scan.nextLine();
      	System.out.println();
      	
      	System.out.print("Enter a number:");
      	num = scan.nextLine();
      	System.out.println();
      	
      	Story go = new Story();
      
      	tale = go.story( adj1, name, noun, largeNum, star, adj2, num);
      	System.out.print(tale);
	}
}      