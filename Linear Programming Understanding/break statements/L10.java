/** L10.java
 * 
 * @author Tevin Scott
 * @version 09/30/2014
 *
 */
import java.util.Random;
public class L10{
		private void print(int num, int count){
			String stars = "";
			String finish = "";
			switch (count){
				case 0:
					finish = num + ". ";
					break;
				default:
					for(int i = 0; i < count; count--){
						stars += "*";
					}
					finish = num + ". " + stars;
               System.out.print(finish);
			}
		}
		public void generateNumbers(int total){
	    	Random rng = new Random();
	    	final int UPPER_BOUND = 10;
	    	int count0 = 0;
	    	int count1 = 0;
	    	int count2 = 0;
	    	int count3 = 0;
	    	int count4 = 0;
	    	int count5 = 0;
	    	int count6 = 0;
	    	int count7 = 0;
	    	int count8 = 0;
	    	int count9 = 0;
	    	
	    	int num = 0;
	    	for(int i = 0; i < total; i++){
	    		num = rng.nextInt(UPPER_BOUND);
	    		switch(num){
	    			case 0:
	    				count0++;
	    				break;
	    			case 1:
	    				count1++;
	    				break;
	    			case 2:
	    				count2++;
	    				break;
	    			case 3:
	    				count3++;
	    				break;
	    			case 4:
	    				count4++;
	    				break;
	    			case 5:
	    				count5++;
	    				break;
	    			case 6:
	    				count6++;
	    				break;
	    			case 7:
	    				count7++;
	    				break;
	    			case 8:
	    				count8++;
	    				break;
	    			case 9:
	    				count9++;
	    				break;
	    		}
	    	}
         this.print(0, count0);
         this.print(1, count1);
         this.print(2, count2);
         this.print(3, count3);
         this.print(4, count4);
         this.print(5, count5);
         this.print(6, count6);
         this.print(generateNumbers(7, count7));
         this.print(generateNumbers(8, count8));
         this.print(generateNumbers(9, count9));




	    }

	    public int[] generateNumbers(int total,final int UPPER_BOUND){
	    	Random rng = new Random();
	    	int[] counter = new int[UPPER_BOUND];
	    	for(int i = 0; i < total; i++){
	    		counter[rng.nextInt(UPPER_BOUND)]++; 
	    	}
	    	return counter;
	    }
	    public void print(int[] arrayPasser){
	    	for (int i = 0; i < arrayPasser.length; i++){
	    		System.out.println(print(i, arrayPasser[i]));
	    	}	    
	    }
}