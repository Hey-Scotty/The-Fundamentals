
public class HotDog extends Sandwich{
	private boolean regular;
	private final double REGULAR = 1.5;
	private final double FTLONG = 2.5;
	private final double EXTRASCOST = .3;
	public HotDog(boolean _regular, int extrasNum, String addons, String _condoments){
		super(extrasNum, addons, _condoments);
		regular = _regular;
	}
    @Override
    public double calculatePrice() {
    	double cost = 0;
    	if(regular == true)
			cost += REGULAR;
		else
			cost += FTLONG;
		cost += EXTRASCOST * this.extrasNum;
		return cost;
    }
    @Override
    public String toString() {
    	if(regular == true)
    		return "regular Hot Dog " + super.toString();
    	else
    		return "FootLong Hot Dog " + super.toString();
    }
	
}
