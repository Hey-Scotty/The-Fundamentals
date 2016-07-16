import java.util.Scanner;


public abstract class Sandwich {
	protected String condoments;
	protected String extras;
	protected int extrasNum = 0;
	public Sandwich(int _extrasNum, String _extras, String _condoments){
		this.extras = _extras; 
		this.condoments = _condoments;
		this.extrasNum = _extrasNum;
	}
	public abstract double calculatePrice();
	
	public String toString(){
		String output = "";
		output += "\nwith:\t" + extras;
		output += " and " + condoments;
		output += "\nprice:\t" + "$" + calculatePrice();
		return output;
	}
}
