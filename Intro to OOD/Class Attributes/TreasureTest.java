/**
 * 
 * TreasureTest.java
 * @author Tevin Scott
 * @version Oct 22, 2014
 *
 */
public class TreasureTest {
	public static void main(String[] args){
		Treasure t1 = new Treasure("USS-Enterprise model", "this is a minature figure of the great USS-Enterprise from the 1960's origninal star trek", 10, 45000);
		Treasure t2 = new Treasure("Teleporter tranciever", "Scotty! Beam me up!",2 , 500);
		Treasure t3 = new Treasure("Ship thrust handle", "Mr. Sulu, punch it!", 4, 800);
		Treasure t4 = new Treasure("USS Badge", "given to Jim Kirk by the Abmiral, himself", .5, 640000);
		Treasure t5 = t3;
		Treasure found = new Treasure("0","0",0,0);
		Treasure min = t1;
		Treasure max = t2;
		int testNum = 0;
		final String PASS = "Pass";
		final String FAIL = "Fail";
		
		if (t5.equals(t1))
			found = t1;
		if (t5.equals(t2))
			found = t2;
		if (t5.equals(t3))
			found = t3;
		if (t5.equals(t4))
			found = t4;
		
		//testing equals method
		System.out.println(".equals method tests\n");
		testNum = 0;
			//test case 1
		testNum++;
		System.out.print(testNum + ": ");
		if (t1.equals(t2) == false)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		//when two values are the same
			//test case 2
		testNum++;
		System.out.print(testNum + ": ");
		if(t3.equals(t5) && t3.equals(found) == true)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		// testing min using .compareTo method
			//sets the minimum value using .compareTo
		System.out.println("\n.compareTo method tests\n");
		testNum = 0;
		if (min.compareTo(t1) > 0)
			min = t1;
		if (min.compareTo(t2) > 0)
			min = t2;
		if (min.compareTo(t3) > 0)
			min = t3;
		if (min.compareTo(t4) > 0)
			min = t4;
			//test case 2
		testNum++;
		System.out.print(testNum + ": ");
		if (min.getValue() == 500)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//testing max using compareTo method
			//sets the minimum value using .compareTo
		if(max.compareTo(t1) < 0)
			max = t1;
		if(max.compareTo(t2) < 0)
			max = t2;
		if(max.compareTo(t3) < 0)
			max = t3;
		if(max.compareTo(t4) < 0)
			max = t4;
			//test case 2
		testNum++;
		System.out.print(testNum + ": ");
		if  (max.getValue() == 640000)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		//testing the method evaluation
			//test case 3
		testNum++;
		System.out.print(testNum + ": ");
		if(t3.compareTo(t2) == 300)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		System.out.println(t1);
	}
}
