/**
 * 
 * L12.java
 * @author Tevin Scott
 * @versionOct 5, 2014
 *
 */
public class L12ForEach{
	public int range(final int[] INPUT){
		int rangeFinder = 0;
			if(INPUT.length > 1){
				int highest = INPUT[0];
				int lowest = INPUT[0];
				for(int nums : INPUT){
					if(nums > highest)
						highest = nums;
				}
				for(int nums : INPUT){
					if(nums < lowest)
						lowest = nums;
				}
				rangeFinder = highest - lowest;
			}
		return rangeFinder;
	}
	public boolean isFound(final int[] VAL,final int SEARCH){
		boolean answer = false;
		if(VAL.length > 0){
			for(int nums : VAL){
				if(nums == SEARCH)
					answer = true;
			}
		}
		return answer;
	}
	public int timesFound(final int[] NUMBERS, final int REFERENCE){
		int occur = 0;
		if(NUMBERS.length > 0){
			for(int nums : NUMBERS){
				if(nums == REFERENCE){
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
			for(int nums : ORIGINAL){
				opposite[decender] = nums;
				decender--;
			}
		}	
		return opposite;
	}
}
