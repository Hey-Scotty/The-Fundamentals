/**
 * 
 * BSDriver.java
 * @author Tevin Scott
 * @version Nov 16, 2014
 *
 */
import java.util.Scanner;
public class Battleship{
	private Board game;
	private int[] shipSizes;
	private Scanner scan;

	public void start(){
		scan = new Scanner(System.in);
		System.out.print("please enter input for board size: ");
		this.game = new Board(scan.nextInt());
		System.out.print("input number of ships: ");
		this.shipSizes = new int[scan.nextInt()];
		for(int i = 0; i < shipSizes.length; i++){
			System.out.print("input ship size(must be 2 - 5 squares): ");
			this.shipSizes[i] = scan.nextInt();
		}
		game.placeShips(shipSizes);
	}
	public void play(){
		while(game.hasShip()){
			game.display();
			game.fire(this.shots());
		}
	}
	private int[] shots(){
		int[] gridLocation = new int[2];
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter row: ");
		gridLocation[0] = scan.nextInt() - 1;
		System.out.print("Please enter column: ");
		gridLocation[1] = scan.nextInt() - 1;
		
		return gridLocation;
	}
}
