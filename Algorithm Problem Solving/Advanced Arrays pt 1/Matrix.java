/**
 * 
 * MatrixDriver.java
 * @author Tevin Scott
 * @version Nov 12, 2014
 *
 */
import java.util.Random;
public class Matrix {
	public int[][] newMatrix(int rows, int colomns){
		int[][] grid = new int[rows][colomns];
		return grid;
	}
	public void print(int[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int k = 0; k < grid[i].length; k++){
				System.out.print(grid[i][k] + "\t");
			}
			System.out.print("\n");
		}
	}
	public int[][] fill(int[][] grid, int upperBound, int lowerBound){
		Random rand = new Random();
		for(int row = 0; row < grid.length; ++row){
			for(int column = 0; column < grid[row].length; column++){

				grid[row][column] = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
			}
		}
		return grid;
	}
	public int sum(int[][] grid){
		int sum = 0;
		if(grid.length > 0 && grid[0].length > 1){
			for(int i = 0; i < grid.length; i++){
				for(int nums: grid[i]){
					sum += nums;
				}
			}
		}	
		
		return sum;
	}
	public int min(int[][] grid){
		int min = 0;
		if(grid.length > 0 && grid[0].length > 0){
			min = grid[0][0];
			for(int row = 0; row < grid.length; row++){
				for(int column = 0; column < grid[row].length; column++){
					if(grid[row][column] < min)
						min = grid[row][column];
				}
			}
		}
		return min;
	}
	public int max(int[][] grid){
		int max = 0;
		if(grid.length > 0 && grid[0].length > 0){
			max = grid[0][0];
			for(int row = 0; row < grid.length; row++){
				for(int column = 0; column < grid[row].length; column++){
					if(grid[row][column] > max)
						max = grid[row][column];
				}
			}
		}
		return max;
	}
	public int range(int[][] grid){
		int range = 0;
		range = this.max(grid) - this.min(grid);
		return range;
	}
	public int[] sumRows(int[][] grid){
		int[] sum = new int[grid.length];
		int rowSum;
			for(int row = 0; row < grid.length; row++){
				rowSum = 0;
				for(int column = 0; column < grid[row].length; column++){
					rowSum += grid[row][column];
				}
				sum[row] = rowSum;
			}
		return sum;
	}
	public boolean isFound(int[][] grid, int inputVal){
		boolean answer = false;
		for(int row = 0; row < grid.length; row++){
			for(int column = 0; column < grid[row].length; column++){
				if(grid[row][column] == inputVal)
					answer = true;
			}
		}
		return answer;
	}
	public int[][] reverseRows(int[][] grid){
		int[][] reverse = grid;
		for(int row = 0; row < grid.length; row++){
			int reverseCounter = grid[row].length - 1;
			for(int column = 0; column < grid[row].length; column++){
				reverse[row][column] = grid[row][reverseCounter]; 
				reverseCounter --;
			}
		}
		return reverse;
	}
	public int[][] reverseColumns(int[][]grid){
		int[][] reverse = grid;
		//
		return reverse;
	}
	public int[][] reverseMatrix(int[][]grid){
		int[][] reverse = grid;
		//
		return reverse;
	}
}
