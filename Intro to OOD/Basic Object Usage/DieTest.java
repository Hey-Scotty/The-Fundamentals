/**
 * 
 * DieTest.java
 * @author Tevin Scott
 * @version Oct 26, 2014
 *
 */
public class DieTest {
	public static void main(String[] args){
		final String PASS = "Pass";
		final String FAIL = "Fail";
		Die dieObj1 = new Die();
		Die dieObj2 = new Die();
		int testNum = 0;
		
		//Tests the constructor default value which should be 1
		System.out.println("Die Constructor test\n");
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if (dieObj1.getValue() == 1)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//tests the getter method
		System.out.println("\nDie getter method test\n");
		testNum = 0;
		dieObj1.roll();
		int min = dieObj1.getValue();
		int max = dieObj1.getValue();
		int minPrintCheck = 0;
		int maxPrintCheck = 0;
		for(int i = 0; i < 100; i ++){
			dieObj1.roll();
			if(minPrintCheck < 1 && dieObj1.getValue() == 1){
				System.out.println(dieObj1.toString());
				minPrintCheck++;
			}
			if(maxPrintCheck < 1 && dieObj1.getValue() == 6){
				System.out.println(dieObj1.toString());
				maxPrintCheck++;
			}	
			if(dieObj1.getValue() < min){
				min = dieObj1.getValue();
			}	
			if (dieObj1.getValue() > max)
				max = dieObj1.getValue();
		}
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if (min == 1 && max == 6)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//tests the compareTo method
		System.out.println("\nDie compareTo method test\n");
		testNum = 0;
		dieObj1.setValue(1);
		dieObj2.setValue(2);
		//tests the return when obj1 is less than obj2 output should be -1
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if (dieObj1.compareTo(dieObj2) == -1)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		//tests the return when obj2 is greater than obj2 output should be 1
		dieObj1.setValue(4);
		dieObj2.setValue(3);
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if (dieObj1.compareTo(dieObj2) == 1)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		//tests the return when obj2 is greater than obj2 output should be 1
		dieObj1.setValue(5);
		dieObj2.setValue(5);
		testNum++;
		System.out.print("Test number " + testNum + ": ");
		if (dieObj1.compareTo(dieObj2) == 0)
			System.out.println(PASS);
		else
			System.out.println(FAIL);

		
	}
}
