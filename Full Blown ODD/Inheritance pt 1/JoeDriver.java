
public class JoeDriver {
	public static void main(String[] args){
		Sandwich[] shop = new Sandwich[6];
		shop[0] = new Burger(2, 0, "nothing", "ketchup");
		shop[1] = new Burger(1, 3, "bacon, pepperjack cheese, extra onions", "barbeque sauce");
		shop[2] = new HotDog(true, 1, "chilli", "ketchup and mustard");
		shop[3] = new HotDog(false, 2, "onions and chilli", "relish");
		shop[4] = new ItalianBeef(true, true, 1, "hot peppers", "honey mustard");
		shop[5] = new ItalianBeef(false, true, 2, "two servings of mild peppers", "ranch");
		double totalCost = 0;
		for(int i = 0; i < shop.length; i++){
			System.out.println(shop[i] + "\n");
			totalCost += shop[i].calculatePrice();
		}
		System.out.println("\nOrder Total: $" + totalCost);
	}
}
