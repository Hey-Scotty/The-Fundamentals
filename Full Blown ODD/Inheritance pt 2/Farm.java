/**
 * 
 * Farm.java
 * @author Tevin Scott
 * @version Nov 19, 2014
 *
 */
public class Farm {
	public static void main(String[] args){
		Animal[] pen = new Animal[6];
		String[] food = {"slop", "hay", "clover", "shoes"}; 
		pen[0] = new Cow("Bessie");
		pen[1] = new Horse("Mr. Ed", "show");
		pen[2] = new Horse("Secretariat", "racing");
		pen[3] = new Sheep("Dolly");
		pen[4] = new Pig("Wilbur");
		pen[5] = new Goat("Billy");
		
		System.out.println("Welcome to the Scott Farm.\n\n"
				+ "Let me introduce you to the animals:\n");
		for(Animal list: pen){
			System.out.println(list);
		}
		System.out.print("\nlisten to all the animals: ");
		for(int i = 0; i < pen.length; i++){
			if(i != pen.length - 1)
				System.out.print(pen[i].speak() + ", ");
			else
				System.out.print(pen[i].speak());
		}
		System.out.println("\n\nLet's feed the animals\n");
		for(int i = 0; i < pen.length; i++){
			System.out.println(pen[i].eat(food));
		}
		
		System.out.println("\nThank you for visiting our farm.");
	}
}
