
public class ItalianBeef extends Sandwich{
	private final double REGULAR = 4.0;
	private final double BIGBEEF = 5.5;
	private final double EXTRASCOST = .75;
	private boolean wet;
	private boolean regular;
	public ItalianBeef(boolean _regular, boolean _wet, int _extrasNum, String _extras, String _condoments){
		super(_extrasNum, _extras, _condoments);
		this.wet = _wet;
		this.regular = _regular;
	}
	@Override
	public double calculatePrice() {
		double cost = 0;
		if(!regular)
			cost += BIGBEEF;
		else 
			cost += REGULAR;
		
		cost += EXTRASCOST * extrasNum;	
		return cost;
	}
	@Override
	public String toString() {
		String output = "";
		if(regular)
    		output = "regular ";
		else
			output = "big ";
		if(wet)
			output += " wet ";
		else
			output += " dry ";
		output += " Italian Beef " + super.toString();
		return output;
	}
}
