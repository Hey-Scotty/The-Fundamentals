/** L17Test.java
 *  
 *  @author Tevin Scott
 *  @date 10/24/2014
 *
 */
import java.io.IOException;
import java.util.Scanner;


public class reAttempt {
	public static void main(String[] args) throws IOException{
    	FileReader reader = new FileReader("C:/Users/TinieT/Google Drive/Radford course/Computer science/L17/src/scores.csv");
    	if(reader.hasNext()){
    		String rowOne = reader.getRecord();
    		String rowTwo = reader.getRecord();
    		Scanner rowOneScan = new Scanner(rowOne);
    		Scanner rowTwoScan = new Scanner(rowTwo);
    		System.out.print(rowOne + ",");
    		System.out.println(rowTwo);
    		rowOneScan.useDelimiter(",");
    		rowTwoScan.useDelimiter(",");
    		int rowOneValue = rowOneScan.nextInt();
    		int rowTwoValue = rowTwoScan.nextInt();
    		int min = rowOneValue;
    		int avg = 0;
    		int max = rowOneValue;
    		int sum = 0;
    		int count = 0;
    		while(rowOneScan.hasNext()){
    			if (min > rowOneValue)
    				min = rowOneValue;
    			if (max < rowOneValue)
    				max = rowOneValue;
    			sum += rowOneValue;
    			count++;
    			rowOneValue = rowOneScan.nextInt();
    		}
    		while(rowTwoScan.hasNext()){
    			if (min > rowTwoValue)
    				min = rowTwoValue;
    			if (max < rowTwoValue)
    				max = rowTwoValue;
    			sum += rowTwoValue;
    			count++;
    			rowTwoValue = rowTwoScan.nextInt();
    		}
    		avg = sum/count;
    		System.out.println("Min: " + min);
    		System.out.println("Average: " + avg);
    		System.out.println("Max: " + max);
    	}	
    		
	}
}

