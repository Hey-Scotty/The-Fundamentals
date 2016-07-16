/**
 * 
 * Horse.java
 * @author Tevin Scott
 * @version Nov 19, 2014
 *
 */
public class Horse extends Animal {
	protected String type;
	public Horse(String horseName, String _type){
		super(horseName, "hay", "nay");
		type = _type;
	}
	@Override
	public String toString() {
		
		return super.name + ", a " + this.type + " horse, says " + super.sound + " eats " + super.food;
	}
}
