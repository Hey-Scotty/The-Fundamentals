/**
 * 
 * Player.java
 * @author Tevin Scott
 * @version Oct 26, 2014
 *
 */
import java.util.Random;
public class Die {
	private final int MIN_VALUE = 1;
	private final int MAX_VALUE = 6;
	private int value;
	Random generator;
	public Die(){
		this.value = 1;
		generator = new Random();
	}
	public int getValue(){
		return this.value;
	}
	public void setValue(int input){
		this.value = input;
	}
	public void roll(){
		this.value = generator.nextInt(MAX_VALUE) + MIN_VALUE;
	}
	public String toString(){
		return "Die: " + value;
	}
	public boolean equals(Die die2){
		return (this.value == die2.value);
	}
	public int compareTo(Die die2){
		int difference = 0;
		if(this.value - die2.value > 0)
			return 1;
		else if(this.value - die2.value < 0)
			return -1;
		return difference;
	}
	
}
