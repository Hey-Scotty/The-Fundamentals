/** HW06.java
 * 
 * @author Tevin Scott
 * @version 10/02/2014
 *
 */
public class HW06{
	public int sum(int[] nums){
		int sumSoFar = 0;
		for(int num: nums){
			sumSoFar+=num;
		}		
		return sumSoFar; 
	}
	public int range(int[] nums){
		int difference = 0;
		if(nums.length > 1){
			int highest = nums[0];
			int lowest = nums[0];
			for (int num:nums){
				if (highest < num)
					highest = num;
			}	
			for (int num:nums){
				if (lowest > num)
					lowest = num;
			}
			difference = highest - lowest;
		}
		return difference;
	}
	public double average(int[] nums){
		double average = 0;
		int sumSoFar = 0;
		if (nums.length == 1){
			average = nums[0];
		}
		if(nums.length > 1){
			for (int num: nums){
				sumSoFar += num;
			}
			average = (double) sumSoFar / nums.length;
		}	
		return average;
	}
	public boolean isPalindrome(char[] letters){
		boolean answer = false;
		int reverseCheck = letters.length - 1;
		if( letters.length == 0)
			answer = true;
		if( letters.length == 1)
			answer = true;
		if ( letters.length > 1){
			for (int i = 0; i < (letters.length / 2); i++){
				if (letters[i] == letters[reverseCheck])
					answer = true;
				else if (letters[i] != letters[reverseCheck])
					answer = false;
				reverseCheck --;
			}
		}	
		return answer;
	}
}
