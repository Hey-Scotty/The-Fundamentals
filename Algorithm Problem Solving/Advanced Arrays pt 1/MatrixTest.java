/**
 *
 * MatrixTest.java
 * @author Tevin Scott
 * @version Nov 12, 2014
 *
 */
public class MatrixTest {
	public static void main(String[] args){
		Matrix mObj = new Matrix();
		int[][] grid1 = {{ 4, 2 , 3} ,{6 , 8, 12}, {7, 1, 9}}; 
		int[][] grid2 = {{ -4, -2, -3} ,{-6 , -8, -12}, {-7, -1, -9}};
		int[][] grid3 = {{ -4, -2, -3} ,{-6 , 8, -12}, {7, -1, 9}};
		int[][] grid4 = {{ 7, 12, 9, 8}, { 13, 5, 20, 16} , { 57, 42, 1, 39}};
		int[][] grid5 = {{ 7, 1, 9, 8}, { 13, 5, 57, 16} , { 57, 42, 1, 39}};
		final String PASS = "Pass";
		final String FAIL = "Fail";
		int numTest = 0;
		//Tests sum method
		System.out.println(".sum method test");
		System.out.println();
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.sum(grid1) == 52)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.sum(grid2) == -52)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.sum(grid3) == -4)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.sum(grid4) == 229)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		//.range method Test
		System.out.println("\n.range method Test\n");
		numTest = 0;
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.range(grid1) == 11)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.range(grid2) == 11)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.range(grid3) == 21)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.range(grid4) == 56)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.range(grid5) == 56)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		//isFound method Test
		System.out.println("\n.isFound method Test\n");
		numTest = 0;
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.isFound( grid1, 4) == true)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.isFound( grid1, 0) == false)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.isFound( grid2, -4) == true)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.isFound( grid2, -10) == false)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.isFound( grid3, -12) == true)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
		
		numTest++;
		System.out.print("Test number " + numTest + ": ");
		if(mObj.isFound( grid3, -7) == false)
			System.out.println(PASS);	
		else
			System.out.println(FAIL);
	}
}
