/**
 * 
 * Player.java
 * @author Tevin Scott
 * @version Oct 26, 2014
 *
 */
public class Player {
	private String name;
	private int score;
	public Player(String _name){
		this.name = _name;
		this.score = 0;		
	}
	public void setScore(int input){
		this.score = input;
	}
	public int getScore(){
		return this.score;
	}
	public String getName(){
		return this.name;
	}
	public void addToScore(int input){
		this.score += input;
	}
	public String toString(){
		return this.name + ": " + this.score;
	}
}
