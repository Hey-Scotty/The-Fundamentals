/**
 * 
 * Producer.java
 * @author Tevin Scott
 * @version Nov 19, 2014
 *
 */
public abstract class Producer extends Animal {
	private String gives;
	
	public Producer(String _name, String _eats, String _sounds, String _gives) {
		super(_name, _eats, _sounds);
		this.gives = _gives;
	}
	public String toString(){
		return super.toString() + " gives " + this.gives;
	}
}
