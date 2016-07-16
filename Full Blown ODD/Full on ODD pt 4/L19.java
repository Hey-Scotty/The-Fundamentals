/**
 * 
 * L19.java Treasure class comparison methods
 * @author Tevin Scott
 * @version Nov 5, 2014
 *
 */
public class L19 {
	public Treasure min(Treasure[] tresArray){
		Treasure lowestVal = null;;
		if(tresArray != null){
			if(tresArray.length > 0)
			 lowestVal = tresArray[0];
			for(int i = 0; i < tresArray.length; i++){
				if(tresArray[i].getValue() < lowestVal.getValue())
					lowestVal = tresArray[i];
			}
		}	
		return lowestVal;
	}
	public Treasure max(Treasure[] tresArray){
		Treasure highVal = null;;
		if(tresArray != null){
			if(tresArray.length > 0)
				highVal = tresArray[0];
			for(int i = 0; i < tresArray.length; i++){
				if(tresArray[i].getValue() > highVal.getValue())
					highVal = tresArray[i];
			}
		}	
		return highVal;
	}
	public boolean isFound(Treasure tres, Treasure[] tresArray){
		boolean answer = false;
			if(tresArray.length > 0){
				for(int i = 0; i < tresArray.length; i++){
					if(tresArray[i].equals(tres)){
						answer = true;
					}
				}
			}
		return answer;
	}
	public int timesFound(Treasure tres, Treasure[] tresArray){
		int count = 0;
			if(tresArray.length > 0){
				for(int i = 0; i < tresArray.length; i++){
					if(tresArray[i].equals(tres))
						count++;
				}
			}
		return count;
	}
	public boolean search(Treasure tres, Treasure[] tresArray){
		boolean answer = false;
		boolean isOrdered = false;
		if(tresArray.length > 1){	
			for(int i = 0; i < tresArray.length - 1; i++){
				if(tresArray[i].getValue() <= tresArray[i+1].getValue()){
					isOrdered = true;	
				}
				else if(tresArray[i].getValue() >= tresArray[i+1].getValue())
					isOrdered = false;
			}
		}
		if(isOrdered == true){
			for(int i = 0; i < tresArray.length; i++){
				if(tresArray[i].compareTo(tres) == 0)
					answer = true;
			}
		}
		return answer;
	}
}
