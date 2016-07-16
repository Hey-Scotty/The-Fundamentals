/**
 * Board.java - represents one player's board for Battleship.
 *
 * @author  Tevin Scott
 * @version 11/16/2014
 */
import java.util.Random;
public class Board
{
	private final char SHIP = 'S';
	private final char WATER = '-';
	private final char MARKER = 'M';
	private final char BUFFER = 'X'; 
	private final int  ROW = 0;
	private final int  ROW_OR_COL = 2;
	private Random rand;
	private char[][] board;
	public Board(int size){
		this.rand = new Random();
		this.board = new char[size][size];
		for(int row = 0; row < size; row++){
			for(int col = 0; col < size; col++){
				board[row][col] = WATER;
			}
		}
	}
	public boolean hasShip(){
		boolean answer = false;
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length; col++){
				if(board[row][col] == 'S')
					answer = true;
			}
		}
		return answer;
	}
	public void fire(int[] input){
		if(board[input[0]][input[1]] == 'S')
			board[input[0]][input[1]] = 'X';
		else if(board[input[0]][input[1]] == '-')
			board[input[0]][input[1]] = 'M';
		else if(board[input[0]][input[1]] == 'X')
			board[input[0]][input[1]] = 'X';
	}
	public void display(){
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length; col++){
				if(board[row][col] != 'S')
					System.out.print(board[row][col] + " ");
				else if(board[row][col] == 'S')
					System.out.print(WATER + " ");
			}
			System.out.println();
		}
	}
	public void placeShips(int[] shipSizes){
		int row, col;
		for (int size: shipSizes)
		{
			int orientation = rand.nextInt(ROW_OR_COL);

			boolean done = false;
			while (!done)
			{
				if (orientation == ROW)
				{
					row = rand.nextInt(this.board.length);
					if (shipPlaced(this.board[row], size))
					{
						wrapShipRow(row);
						done = true;
					}
				}
				else
				{
					col = rand.nextInt(this.board.length);
					// transpose column into one-dimensional array
					char[] column = new char[this.board.length];
					for (int i = 0; i < this.board.length; ++i)
						column[i] = this.board[i][col];
					if (shipPlaced(column, size))
					{
						for (int i = 0; i < this.board.length; ++i)
							this.board[i][col] = column[i]; 
						this.wrapShipCol(col);
						done = true;
					}
				}
			} 		
		}
		this.removeBuffers();
	}
	private boolean shipPlaced(char[] row, int size)
	{
		boolean placed = false;

		int start = 0;	
		int pos = 0;
		int count = 0;

		boolean done = false;
		while (!done)
		{
			start = pos;
			while (start < row.length && row[start] != WATER)
				++start;

			count = 0;
			pos = start;
			while (pos < row.length && row[pos] == WATER)
			{
				++pos;
				++count;
			}

			if (count >= size || pos >= row.length)
				done = true;
		}

		if (count >= size)
		{
			if (count > size)
			{
				int col = rand.nextInt(count - size);
				start += col;
			}
			for (int i = 0; i < size; ++i)
				row[start + i] = MARKER;
			placed = true; 
		}

		return placed;
	}
	private void wrapShipRow(int row)
	{
		int start = 0;
		while (start < this.board.length && this.board[row][start] != MARKER)
		{
			++start; 
		}

		int end = start; 
		while (end + 1 < this.board.length && this.board[row][end + 1] == MARKER)
		{
			++end; 
		}

		if (start < end)
		{
			if (start > 0)
				this.board[row][start - 1] = BUFFER;

			if (end < this.board.length - 1)
				this.board[row][end + 1] = BUFFER;

			if (row > 0)
				for (int i = start; i <= end; ++i)
					this.board[row - 1][i] = BUFFER;

			if (row < this.board.length - 1)
				for (int i = start; i <= end; ++i)
					this.board[row + 1][i] = BUFFER;
		}
		for (int i = start; i <= end; ++i)
			this.board[row][i] = SHIP;
	}
	private void wrapShipCol(int col)
	{
		int start = 0;
		while (start < this.board.length && this.board[start][col] != MARKER)
		{
			++start; 
		}

		int end = start; 
		while (end + 1 < this.board.length && this.board[end + 1][col] == MARKER)
		{
			++end; 
		}

		if (start < end)
		{
			if (start > 0)
				this.board[start - 1][col] = BUFFER;

			if (end < this.board.length - 1)
				this.board[end + 1][col] = BUFFER;

			if (col > 0)
				for (int i = start; i <= end; ++i)
					this.board[i][col - 1] = BUFFER;

			if (col < this.board.length - 1)
				for (int i = start; i <= end; ++i)
					this.board[i][col + 1] = BUFFER;
		}
		for (int i = start; i <= end; ++i)
			this.board[i][col] = SHIP;
	}
	private void removeBuffers()
	{
		for (int row = 0; row < this.board.length; ++row)
			for (int col = 0; col < this.board[row].length; ++col)
				if (this.board[row][col] == BUFFER)
					this.board[row][col] =  WATER;
	}
	public String toString()
	{
		String display = "\n";
		for (int row = 0; row < board.length; ++row)
		{
			for (int col = 0; col < board[row].length; ++col)
				display += board[row][col] + " ";
			display += "\n";
		}
		return display;		
	}
}