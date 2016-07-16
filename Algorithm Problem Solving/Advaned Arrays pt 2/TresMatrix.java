/**
 * 
 * TresMatrix.java
 * @author Tevin Scott
 * @version Nov 14, 2014
 *
 */
import java.util.Random;
public class TresMatrix {
	public Treasure[][] newMatrix(int rows, int colomns){
		Treasure[][] grid = new Treasure[rows][colomns];
		return grid;
	}
	public void print(Treasure[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(Treasure tres: grid[i]){
				System.out.print(tres + "\t");
			}
			System.out.print("\n");
		}
	}
	public int sum(Treasure[][] grid){
		int sum = 0;
		if(grid.length > 0 && grid[0].length > 1){
			for(int i = 0; i < grid.length; i++){
				for(Treasure tres: grid[i]){
					sum += tres.getValue();
				}
			}
		}	
		
		return sum;
	}
	public int min(Treasure[][] grid){
		int min = 0;
		if(grid.length > 0 && grid[0].length > 0){
			min = grid[0][0].getValue();
			for(int row = 0; row < grid.length; row++){
				for(Treasure tres: grid[row]){
					if(tres.getValue() < min)
						min = tres.getValue();
				}
			}
		}
		return min;
	}
	public int max(Treasure[][] grid){
		int max = 0;
		if(grid.length > 0 && grid[0].length > 0){
			max = grid[0][0].getValue();
			for(int row = 0; row < grid.length; row++){
				for(Treasure tres: grid[row]){
					if(tres.getValue() < max)
						max = tres.getValue();
				}
			}
		}
		return max;
	}
	public int range(Treasure[][] grid){
		int range = 0;
		range = this.max(grid) - this.min(grid);
		return range;
	}
	public int[] sumRows (Treasure[][] grid){
		int[] sum = new int[grid.length];
		int rowSum;
			for(int row = 0; row < grid.length; row++){
				rowSum = 0;
				for(Treasure tres : grid[row]){
					rowSum += tres.getValue();
				}
				sum[row] = rowSum;
			}
		return sum;
	}
	public boolean isFound(Treasure[][] grid, Treasure input){
		boolean answer = false;
		for(int row = 0; row < grid.length; row++){
			for(Treasure tres : grid[row]){
				if(tres.equals(input))
					answer = true;
			}
		}
		return answer;
	}
	public Treasure[][] reverseRows(Treasure[][] grid){
		Treasure[][] reverse = grid;
		for(int row = 0; row < grid.length; row++){
			int reverseCounter = grid[row].length - 1;
			for(Treasure tres : grid[row]){
				reverse[row][reverseCounter] = tres; 
				reverseCounter --;
			}
		}
		return reverse;
	}
	public Treasure[][] reverseColumns(Treasure[][]grid){
		Treasure[][] reverse = grid;
		//
		return reverse;
	}
	public Treasure[][] reverseMatrix(Treasure[][]grid){
		Treasure[][] reverse = grid;
		//
		return reverse;
	}
}
