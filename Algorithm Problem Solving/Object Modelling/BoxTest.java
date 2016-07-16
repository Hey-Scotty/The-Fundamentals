
public class BoxTest {
	public static void main(String[] args){
		final String PASS = "Pass";
		final String FAIL = "Fail";
		Box boxObj1 = new Box(0, 0, 0);
		Box boxObj2 = new Box(1, 1, 1);
		int testNum = 0;
		//Tests the Constructor
		System.out.println("Constructor Test");
		System.out.println();
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		if((boxObj1.toString().equals("0x0x0")) && (boxObj1.getFull() == false))
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		if((boxObj2.toString().equals("1x1x1")) && (boxObj2.getFull() == false))
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		//Tests the height getter and setter methods
		testNum = 0;
		System.out.println();
		System.out.println("height getter and setter method test");
		System.out.println();
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj1.setHeight(5);
		if(boxObj1.getHeight() == 5)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj2.setHeight(4);
		if(boxObj2.getHeight() == 4)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//Tests the width getter and setter methods
		testNum = 0;
		System.out.println();
		System.out.println("height getter and setter method test");
		System.out.println();
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj1.setWidth(12);
		if(boxObj1.getWidth() == 12)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj2.setWidth(8);
		if(boxObj2.getWidth() == 8)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//Tests the depth getter and setter methods
		testNum = 0;
		System.out.println();
		System.out.println("depth getter and setter method test");
		System.out.println();
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj1.setDepth(7);
		if(boxObj1.getDepth() == 7)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj2.setDepth(13);
		if(boxObj2.getDepth() == 13)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		
		//Tests the full getter and setter methods
		testNum = 0;
		System.out.println();
		System.out.println("full getter and setter method test");
		System.out.println();
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj1.setFull(true);
		if(boxObj1.getFull() == true)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		boxObj2.setFull(false);
		if(boxObj2.getFull() == false)
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		//Tests the Box toString method
		testNum = 0;
		System.out.println();
		System.out.println(" Box toString method Test");
		System.out.println();
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		if(boxObj1.toString().equals("5x12x7"))
			System.out.println(PASS);
		else
			System.out.println(FAIL);
		testNum++;
		System.out.print("Test Number " + testNum + ": ");
		if(boxObj2.toString().equals("4x8x13"))
			System.out.println(PASS);
		else
			System.out.println(FAIL);
	}
}
