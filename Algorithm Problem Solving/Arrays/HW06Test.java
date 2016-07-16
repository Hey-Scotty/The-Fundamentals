 /** HW06Test.java
 * 
 * @author Tevin Scott
 * @version 10/02/2014
 *
 */
public class HW06Test{
	public static void main(String[]args){
		final String T = " Pass";
		final String F = "Fail";
		HW06 tester = new HW06();
		
		//sum tester
		System.out.println("Sum Tests");
		System.out.println();
		
		int[] sumTest1 = new int[0];
		int[] sumTest2 = { 1 };
		int[] sumTest3 = { 8, 3 };
		int[] sumTest4 = { 1, 2, 3, 4, 5 };
		int sum;
		int testNum = 0;
		// should return 0
		testNum++;
		sum = tester.sum(sumTest1);
		if (sum == 0)
			System.out.println("Test " + testNum + ":" + T);
		else if (sum != 0)
			System.out.println("Test " + testNum + ":" + F);
		// should return 1
		testNum++;
		sum = tester.sum(sumTest2);
		if (sum == 1)
			System.out.println("Test " + testNum + ":" + T);
		else if (sum != 1)
			System.out.println("Test " + testNum + ":" + F);
		// should return 11
		testNum++;
		sum = tester.sum(sumTest3);
		if (sum == 11)
			System.out.println("Test " + testNum + ":" + T);
		else if (sum != 11)
			System.out.println("Test " + testNum + ":" + F);
		// should return 15
		testNum++;
		sum = tester.sum(sumTest4);
		if (sum == 15)
			System.out.println("Test " + testNum + ":" + T);
		else if (sum != 15)
			System.out.println("Test " + testNum + ":" + F);
		
		// Range method test
		System.out.println();
		System.out.println("Range Tests");
		System.out.println();
		
		int[] rangeTest1 = new int[0];
		int[] rangeTest2 = { 5 };
		int[] rangeTest3 = { 3, 4, 5};
		int[] rangeTest4 = { 5, 4, 3 };
		int[] rangeTest5 = { 4, 5, 3 };
		int[] rangeTest6 = { 6, 8, 2, 12, 1, 5 };
		int range;
		testNum = 0;
		
		// should return 0
		testNum++;
		range = tester.range(rangeTest1);
		if (range == 0)
			System.out.println("Test " + testNum + ":" + T);
		else if (range != 0)
			System.out.println("Test " + testNum + ":" + F);
		// should return 0
		testNum++;
		range = tester.range(rangeTest2);
		if (range == 0)
			System.out.println("Test " + testNum + ":" + T);
		else if (range != 0)
			System.out.println("Test " + testNum + ":" + F);
		// should return 2
		testNum++;
		range = tester.range(rangeTest3);
		if (range == 2)
			System.out.println("Test " + testNum + ":" + T);
		else if (range != 2)
			System.out.println("Test " + testNum + ":" + F);
		// should return 2
		testNum++;
		range = tester.range(rangeTest4);
		if (range == 2)
			System.out.println("Test " + testNum + ":" + T);
		else if (range != 2)
			System.out.println("Test " + testNum + ":" + F);
		// should return 2
		testNum++;
		range = tester.range(rangeTest5);
		if (range == 2)
			System.out.println("Test " + testNum + ":" + T);
		else if (range != 2)
			System.out.println("Test " + testNum + ":" + F);
		// should return 11
		testNum++;
		range = tester.range(rangeTest6);
		if (range == 11)
			System.out.println("Test " + testNum + ":" + T);
		else if (range != 11)
			System.out.println("Test " + testNum + ":" + F);
		
		// average method test
		System.out.println();
		System.out.println("Average Tests");
		System.out.println();
		
		int[] averageTest1 = new int[0];
		int[] averageTest2 = { 5 };
		int[] averageTest3 = { 2, 4 };
		int[] averageTest4 = { 2, 5 };
		int[] averageTest5 = { 1, 2, 3, 4, 5 };
		double average;
		testNum = 0;
		
		// should return 0
		testNum++;
		average = tester.average(averageTest1);
		if (average == 0)
			System.out.println("Test " + testNum + ":" + T);
		else if (average != 0)
			System.out.println("Test " + testNum + ":" + F);
		// should return 5
		testNum++;
		average = tester.average(averageTest2);
		if (average == 5.0)
			System.out.println("Test " + testNum + ":" + T);
		else if (average != 5.0)
			System.out.println("Test " + testNum + ":" + F);
		// should return 3
		testNum++;
		average = tester.average(averageTest3);
		if (average == 3.0)
			System.out.println("Test " + testNum + ":" + T);
		else if (average != 3.0)
			System.out.println("Test " + testNum + ":" + F);
		// should return 3.5
		testNum++;
		average = tester.average(averageTest4);
		if (average == 3.5)
			System.out.println("Test " + testNum + ":" + T);
		else if (average != 3.5)
			System.out.println("Test " + testNum + ":" + F);
		// should return 3
		testNum++;
		average = tester.average(averageTest5);
		if (average == 3.0)
			System.out.println("Test " + testNum + ":" + T);
		else if (average != 3.0)
			System.out.println("Test " + testNum + ":" + F);
		
		// palindrome method test
		System.out.println();
		System.out.println("Palindrome Tests");
		System.out.println();
		
		char[] palTest1 = new char[0];
		char[] palTest2 = { 'a' };
		char[] palTest3 = { 'a', 'a' };
		char[] palTest4 = { 'a', 'b' };
		char[] palTest5 = { 'A', 'B', 'B', 'A'};
		char[] palTest6 = { 'R', 'A', 'C', 'E', 'C', 'A', 'R' };
		char[] palTest7 = { 'A', 'B', 'C', 'E', 'B', 'A' };
		boolean reply;
		testNum = 0;
		
		//should return true
		testNum++;
		reply = tester.isPalindrome(palTest1);
		if ( reply == true)
			System.out.println(testNum + ":" + T);
		else if (reply == false)
			System.out.println(testNum + ":" + F);
		//should return true
		testNum++;
		reply = tester.isPalindrome(palTest2);
		if ( reply == true)
			System.out.println(testNum + ":" + T);
		else if (reply == false)
			System.out.println(testNum + ":" + F);
		//should return true
		testNum++;
		reply = tester.isPalindrome(palTest3);
		if ( reply == true)
			System.out.println(testNum + ":" + T);
		else if (reply == false)
			System.out.println(testNum + ":" + F);
		//should return false
		testNum++;
		reply = tester.isPalindrome(palTest4);
		if ( reply == false)
			System.out.println(testNum + ":" + T);
		else if (reply == true)
			System.out.println(testNum + ":" + F);
		//should return true
		testNum++;
		reply = tester.isPalindrome(palTest5);
		if ( reply == true)
			System.out.println(testNum + ":" + T);
		else if (reply == false)
			System.out.println(testNum + ":" + F);
		//should return true
		testNum++;
		reply = tester.isPalindrome(palTest6);
		if ( reply == true)
			System.out.println(testNum + ":" + T);
		else if (reply == false)
			System.out.println(testNum + ":" + F);
		//should return false
		testNum++;
		reply = tester.isPalindrome(palTest7);
		if ( reply == false)
			System.out.println(testNum + ":" + T);
		else if (reply == true)
			System.out.println(testNum + ":" + F);
		
		
	}
}

