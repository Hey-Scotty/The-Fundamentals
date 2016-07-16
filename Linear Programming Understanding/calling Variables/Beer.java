/**
* Beer.java - prints a story.
* 
* @author Tevin Scott
* @version 08/29/2014
*/
public class Beer
{
   public static void main(String[] args)
   {
   String beer = "Corona";
   String fruit = "limes";
   final String store = "Mike's";
   final String customer = "Jim";
   double discount = 0.25;
   int INCREASE = 1;
   int beerPrice = 8;
   double limePrice = 0.40;
   double saleOne = ((beerPrice * 2) + (limePrice * 2));
   
   
  
   System.out.println(store + " Beer Cave sells a six-pack of " + beer + " for $8 and");
   System.out.println(fruit + " are .40 cents each. " + customer + " bought two six-packs of");
   System.out.println(beer + " and two " + fruit + " for $" + saleOne + ". Last weekend " + beer + " was");
   double saleTwo = (((beerPrice * 3) * (1 - discount))+(limePrice * 4)) ;
   System.out.println((discount * 100) + " % off. " + customer + " bought three six-packs of " + beer + " and four");
   System.out.println(fruit + " for $" + saleTwo + ". This week " + store + " raised the price of");
   double saleThree = ((beerPrice + INCREASE) + (limePrice *  2));
   System.out.println(beer + " by $" + INCREASE + ". " + customer + " bought one six-pack of " + beer + " and");
   System.out.println("two " + fruit + " for $" + saleThree + ". " + customer + " has spent $" +(saleOne + saleTwo + saleThree) + " at " + store + ".");
   }
}   