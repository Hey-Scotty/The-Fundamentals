
public class L19Test {
	public static void main(String[] args){
		L19 L19Obj = new L19();
		Treasure[] treasureArray1 = new Treasure[6];
		Treasure[] treasureArray2 = new Treasure[5];
		treasureArray1[0] = new Treasure("Pen", "for righting", 0.1, 5);
		treasureArray1[1] = new Treasure("TextBook", "overly expensive", 2, 20000);
		treasureArray1[2] = new Treasure("backpack", "handy for carrying books", 1, 40);
		treasureArray1[3] = new Treasure("Laptop", "good for on the go users", 2.5, 600);
		treasureArray1[4] = new Treasure("TextBook", "overly expensive", 2, 20000);
		treasureArray1[5] = new Treasure("Keyboard", "mechanical with LEDs", 0.7, 120);
		Treasure searchTreasure = new Treasure("TextBook", "overly expensive", 2, 20000);
		treasureArray2[0] = new Treasure("Pen", "for righting", 0.1, 5);
		treasureArray2[1] = new Treasure("backpack", "handy for carrying books", 1, 40);
		treasureArray2[2] = new Treasure("Keyboard", "mechanical with LEDs", 0.7, 120);
		treasureArray2[3] = new Treasure("Laptop", "good for on the go users", 2.5, 600);
		treasureArray2[4] = new Treasure("TextBook", "overly expensive", 2, 20000);
		final String PASS = "Pass";
		final String FAIL = "Fail";
		int testNum = 0;
		
		//L19 max method test
		System.out.println("Max method test cases\n");
		
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.max(treasureArray1).getValue() == 20000)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		testNum++;
		treasureArray1[2].setValue(50000);
		System.out.print("Test No. " + testNum);
		if(L19Obj.max(treasureArray1).getValue() == 50000)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		//L19 min method test
		System.out.println("\nMin method test cases\n");
		testNum = 0;
		
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.min(treasureArray1).getValue() == 5)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		testNum++;
		treasureArray1[3].setValue(1);
		System.out.print("Test No. " + testNum);
		if(L19Obj.min(treasureArray1).getValue() == 1)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		//L19 isFound method test
		System.out.println("\nisFound method test cases\n");
		testNum = 0;
		
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.isFound(searchTreasure, treasureArray1) == true)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		testNum++;
		searchTreasure = new Treasure("Keyboard", "mechanical with LEDs", 0.7, 120);
		System.out.print("Test No. " + testNum);
		if(L19Obj.isFound(searchTreasure, treasureArray1) == true)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		//L19 timesFound method test
		System.out.println("\ntimesFound method test cases\n");
		testNum = 0;
		
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.timesFound(searchTreasure, treasureArray1) == 1)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		testNum++;
		searchTreasure = new Treasure("TextBook", "overly expensive", 2, 20000);
		System.out.print("Test No. " + testNum);
		if(L19Obj.timesFound(searchTreasure, treasureArray1) == 2)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.timesFound(searchTreasure, treasureArray2) == 1)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
		//L19 search method test
		System.out.println("\nsearch method test cases\n");
		testNum = 0;
		//tests an array that is not in order
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.search(searchTreasure, treasureArray1) == false)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		//tests an array in ascending order
		testNum++;
		System.out.print("Test No. " + testNum);
		if(L19Obj.search(searchTreasure, treasureArray2) == true)
			System.out.println(" " + PASS);
		else
			System.out.println(" " + FAIL);
		
	}
}
