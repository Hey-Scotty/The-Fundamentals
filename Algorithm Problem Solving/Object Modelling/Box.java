/**
 * Box.java - models a box object, storing its dimensions and specifying if it is full or not.
 * @author Tevin Scott
 * @version Oct 19, 2014
 *
 */
public class Box {
	private int height;
	private int width;
	private int depth;
	private boolean full;
	public Box(int _height, int _width, int _depth){
		this.height = _height;
		this.width = _width;
		this.depth = _depth;
		this.full = false;
	}
	public void setHeight(int heightInput){
		 this.height = heightInput;
	}
	public int getHeight(){
		return this.height;
	}
	public void setWidth(int widthInput){
		this.width = widthInput;
	}
	public int getWidth(){
		return this.width;
	}
	public void setDepth(int depthInput){
		this.depth = depthInput;
	}
	public int getDepth(){
		return this.depth;
	}
	public void setFull(boolean fullInput){
		this.full = fullInput;
	}
	public boolean getFull(){
		return this.full;
	}
	public String toString(){
		String boxReturn = height + "x" + width + "x" + depth;
		return boxReturn;
	}	
}
