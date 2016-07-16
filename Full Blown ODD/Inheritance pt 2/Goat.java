/**
 * 
 * Goat.java
 * @author Tevin Scott
 * @version Nov 19, 2014
 *
 */
public class Goat extends Producer {
	public Goat(String goatName){
		super(goatName, "anything", "neiiigh", "milk");
	}
	@Override
	public String eat(String[] food) {
		return this.name + " ate shoes";
	}	
}
