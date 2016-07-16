/**
 * 
 * Room.java
 * @author Tevin Scott
 * @version Oct 22, 2014
 *
 */
public class Room
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private Treasure treasure;
    /**
     * Constructor for objects of class Room
     */
    public Room(String _name, String _description){
    	this.name = _name;
    	this.description = _description;
    	this.treasure = new Treasure("Empty", "no description", 0, 0);
    }
    public Room(String _name, String _description, Treasure _treasure){
    	this.name = _name;
    	this.description = _description;
    	this.treasure = _treasure;
    }
    public String toString(){
    	String output = "";
    	output += this.name + " - " + this.description + "\n";
    	output += this.treasure.toString();
    	return output;
    }
}
