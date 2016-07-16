/**
* Workout.java
*
* @Author Tevin Scott
* @31-Aug-2014
**/
public class Workout
{	
	public static void main(String[] args)
	{	
      //first week stats
		final String NAME = "Mike ";
      final int LBS1 = 187;
      final int LBSGOAL = 170;
      int bikeTimes1 = 3;
      double bikeLength1 = 2.5;
      int walkTimes1 = 2;
      double walkLength1 = 2;
      int gymTimes1 = 1;
      double gymLength1 = 3;
      int loss1 = 2;
      
      //2nd week stats
      int bikeTimes2 = 3;
      double bikeLength2 = 4;
      int walkTimes2 = 3;
      double walkLength2 = 4.5;
      int gymTimes2 = 3;
      double gymLength2 = 4;
      int loss2 = 4;
      
      System.out.println(NAME + " weighs " + LBS1 + " pounds and he wants to get in better shape and drop his weight to " + LBSGOAL + ".");
      System.out.println("He started working out two weeks ago. The first week was tough. He rode his bike " + bikeTimes1);
      System.out.println("times for a total of " + bikeLength1 + " hours, he walked " + walkTimes1 + " time(s) for " + walkLength1 + " hours, and he spent " + gymLength1);
      System.out.println("hours in the gym. He lost " + loss1 + " pounds the first week.\n");
      System.out.println("The second week he rode his bike " + bikeTimes2 + " times for " + bikeLength2 + " hours, walked " + walkTimes2 + " times for " + walkLength2);
      System.out.println("hours, went to the gym " + gymTimes2 + " times for " + gymLength2 + " hours, and lost " + loss2 + " pounds. At the end");
      System.out.println("of the first two weeks Mike completed the following:\n");
     
      
      /*Totalling
      its easier to combine the ints and doubles rather than making
      some of the variables Strings as you cant add the strings together
      arithmetically*/
      
      int gymTTotal1 = (gymTimes1 + gymTimes2);
      double gymLTotal1 = (gymLength1 + gymLength2);
      int bikeTTotal1 = (bikeTimes1 + bikeTimes2);
      double BikeLTotal1 = (bikeLength2 + bikeLength2);
      int walkTTotal1 = (walkTimes1 + walkTimes2);
      double walkLTotal1 = (walkLength1 + walkLength2);
      int lossTotal1 = (loss1 + loss2);
      
      System.out.println("Gym\t" + gymTTotal1 +" times for " + gymLTotal1 + " hours" );
      System.out.println("Bike\t" +  bikeTTotal1 + " times for " + BikeLTotal1 + " hours");
      System.out.println("Walked\t" + walkTTotal1 + " times for " +  walkLTotal1 + " hours");
      System.out.println("Lost\t" + lossTotal1 + " pounds\n");
      
      //Planned week
      int bikeTimes3 = 3;
      double bikeLength3 = 4;
      int walkTimes3 = 5;
      double walkLength3 = 5;
      int gymTimes3 = 4;
      double gymLength3 = 5;
      int loss3 = 3;
      int lossTotal2 = (loss1 + loss2 + loss3);
      int Remaining = (LBS1 - lossTotal2 - LBSGOAL);

      System.out.println( "Next week Mike plans to ride his bike" + bikeTimes3 + " times for " + bikeLength3 + " hours, walk " + walkTimes3 + " times for " + walkLength3); 
      System.out.println("hours, go to the gym " + gymTimes3 + " times for " + gymLength3 + " hours, and he hopes to lose " + loss3 + "  more pounds. If ");
      System.out.println("all goes according to plan, Mike will need to lose " + Remaining + " Loss more pounds to reach his goal and ");
      System.out.println("his three weeks totals will be: \n");
      
      //FinalTotal
      
      int finalBikeTime = (bikeTimes1 + bikeTimes2 + bikeTimes3);
      double finalBikeLegnth = (bikeLength1 + bikeLength2 + bikeLength3);
      int finalWalkTime = (walkTimes1 + walkTimes2 + walkTimes3);
      double finalWalkLength = (walkLength1 + walkLength2 + walkLength3);
      int finalGymTime = (gymTimes1 + gymTimes2 + gymTimes3);
      double finalGymLength = (gymLength1 + gymLength2 + gymLength3);
      int totalLoss = (LBS1 - LBSGOAL);
      
      System.out.println("Gym\t" + finalGymTime + " times for " + finalGymLength + " hours ");
      System.out.println("Bike\t" + finalBikeTime + " times for " + finalBikeTime + " hours ");
      System.out.println("Walked\t" + finalWalkTime + " times for " + finalWalkLength + " hours ");
      System.out.println("Lost\t" + totalLoss + " pounds ");
      
	}
}	
