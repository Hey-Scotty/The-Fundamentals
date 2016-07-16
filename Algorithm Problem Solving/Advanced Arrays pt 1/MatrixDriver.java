
public class MatrixDriver {
	public static void main(String[] args){
		Matrix mObj = new Matrix();
		int[][] grid = {{ 4, 2 , 3} ,{6 , 8, 12}, {7, 1, 9}};
		int[] expected = mObj.sumRows(grid);
		for(int i = 0; i < expected.length; i++){
			System.out.println(expected[i]);
		}
	}
}
