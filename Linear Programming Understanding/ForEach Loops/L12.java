/**
 * 
 * L12.java
 * @author Tevin Scott
 * @versionOct 5, 2014
 *
 */
public class L12{
	public int range(final int[] INPUT){
		int rangeFinder = 0;
			if(INPUT.length > 1){
				int highest = INPUT[0];
				int lowest = INPUT[0];
				for(int i = 0; i < INPUT.length; i++){
					if(INPUT[i] > highest)
						highest = INPUT[i];
				}
				for(int i = 0; i < INPUT.length; i++){
					if(INPUT[i] < lowest)
						lowest = INPUT[i];
				}
				rangeFinder = highest - lowest;
			}
		return rangeFinder;
	}
	public boolean isFound(final int[] VAL,final int SEARCH){
		boolean answer = false;
		if(VAL.length > 0){
			for(int i = 0; i < VAL.length; i++){
				if(VAL[i] == SEARCH)
					answer = true;
			}
		}
		return answer;
	}
	public int timesFound(final int[] NUMS, final int REFERENCE){
		int occur = 0;
		if(NUMS.length > 0){
			for(int i = 0; i < NUMS.length; i++){
				if(NUMS[i] == REFERENCE){
					occur++;
				}
			}
		}	
		return occur;
	}
	public int[] reverse(final int[]ORIGINAL){
		int decender = ORIGINAL.length - 1;
		int[] opposite = new int[ORIGINAL.length];
		if(ORIGINAL.length > 0){
			for(int i = 0; i < ORIGINAL.length; i++){
				opposite[i] = ORIGINAL[decender];
				decender--;
			}
		}	
		return opposite;
	}
}
