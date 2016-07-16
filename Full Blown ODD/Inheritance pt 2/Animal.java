/**
 * 
 * Animal.java
 * @author Tevin Scott
 * @version Nov 19, 2014
 *
 */
public abstract class Animal {
	protected String name;
	protected String food;
	protected String sound;
	public Animal(String _name, String _food, String _sound){
		this.name = _name;
		this.food = _food;
		this.sound = _sound;
	}
	public String speak(){
		return this.sound;
	}
	public String eat(String[] food){
		String phrase = this.name + " ate ";
		boolean ate = false;
		for(int i = 0; i < food.length; i++){
			if(food[i].equals(this.food)){
				phrase+= food[i];
				ate = true;
				food[i] = "gone";
			}
		}
		if(ate == false){
			phrase += " nothing";
		}
		return phrase;	
	}
	public String toString(){
		return this.name + " eats " + this.food + " says " + this.sound;
	}
	
}
