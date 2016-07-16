/**
 * 
 * PairOfDice.java
 * @author Tevin Scott
 * @version Oct 16, 2014
 *
 */
public class PairOfDice {
	private Die dice1;
	private Die dice2;
	public PairOfDice(){
		this.dice1 = new Die();
		this.dice2 = new Die();
	}
	public int getDice1(){
		return dice1.getFaceValue();
	}
	public int getDice2FaceValue(){
		return dice2.getFaceValue();
	}
	public void rollDice(){
		dice1.roll();
		dice2.roll();
	}
	public int getTotalFaceValue(){
		int die1Val = dice1.getFaceValue();
		int die2Val = dice2.getFaceValue();
		int total = die1Val + die2Val;
		return total;
	}
	public String toString(){
		String diceReturn =" Dice 1: " + dice1.toString() + ". Dice 2: " + dice2.toString() + ". ";
		return diceReturn;	
	}
}
