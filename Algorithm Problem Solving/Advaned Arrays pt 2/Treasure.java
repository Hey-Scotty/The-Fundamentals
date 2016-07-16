
/**
 * Treasure.java models treasures.
 * 
 * @author Tevin Scott
 * @version 11/08/2014
 */
public class Treasure
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private double weight;
    private int value;

    /**
     * Constructor for objects of class treasure
     */
    public Treasure(String _name, String _description, double _weight, int _value){
    	this.name = _name;
    	this.description = _description;
    	this.weight = _weight;
    	this.value = _value;
    }
    public String getName(){
    	return this.name;
    }
    public String getDescription(){
    	return this.description;
    }
    public double getWeight(){
    	return this.weight;
    }
    public int getValue(){
    	return this.value;
    }
    public void setValue(int input){
    	this.value = input;
    }
    public int compareTo(Treasure treasure2){
    	return this.value - treasure2.getValue();
    }
    public String toString(){
    	String output = "";
    	output ="Name: " + this.name + "\nDescription: " + this.description + "\nValue: " + this.value + "\nWeight: " + this.weight;
    	return output;		
    }
    public boolean equals(Treasure treasure2){
    	boolean answer = false;
    	if(this.name.equals(treasure2.getName()) && this.description.equals(treasure2.getDescription()) && this.weight == treasure2.getWeight() && this.value == treasure2.getValue())
    		answer = true;
    	else answer = false;
    	return answer;
    }
}
