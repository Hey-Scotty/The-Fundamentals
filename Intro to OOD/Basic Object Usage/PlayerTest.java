/**
 * 
 * PlayerTest.java
 * @author Tevin Scott
 * @version Oct 26, 2014
 *
 */
public class PlayerTest {
	public static void main(String[] args){
		Player playerObj = new Player("Tevin");
		final String PASS = "Pass";
		final String FAIL = "Fail";
		int testNum = 0;
		//Tests the getter and setter methods
		System.out.println("getter and setter mothod test\n");
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if(playerObj.getScore() == 0)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		playerObj.setScore(6);
		if(playerObj.getScore() == 6)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if(playerObj.getName().equals("Tevin"))
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//Tests the addScore method
		testNum = 0;
		System.out.println("\naddScore method test\n");
		
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		playerObj.addToScore(4);
		//Score is now 10
		if(playerObj.getScore() == 10)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		playerObj.addToScore(2);
		//Score is now 12
		if(playerObj.getScore() == 12)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//Tests toString
		testNum = 0;
		System.out.println("\ntoString method Test\n");
		
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if(playerObj.toString().equals("Tevin: 12"))
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		
			
	}
}
