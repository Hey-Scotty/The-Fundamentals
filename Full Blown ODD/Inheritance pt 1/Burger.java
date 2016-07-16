
public class Burger extends Sandwich{
	private int pattyNum;
	private final int PATTYVAL = 2;
	private final double EXTRASCOST = .5;
	public Burger(int _pattyNum, int extrasNum,  String extras, String condoments){
		super(extrasNum, extras, condoments);
		pattyNum = _pattyNum;
	}
	@Override
	public double calculatePrice() {
		double cost = 0;
		cost += PATTYVAL * pattyNum;
		cost += this.extrasNum * EXTRASCOST;
		return cost;
	}
	 @Override
		public String toString() {
			return pattyNum + " patty Hamburger" + super.toString();
		}
	
}
