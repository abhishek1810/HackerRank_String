/**
 * 
 */
package warmups;

import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link  https://www.hackerrank.com/challenges/kaprekar-numbers
 */
public class KaprekarNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    long[] hash = {1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 
		17344, 22222, 77778, 82656, 95121, 99999 };
		
	    Scanner s = new Scanner(System.in);
	    long start = s.nextLong();
	    long end = s.nextLong();
	    int counter = 0;
	    String res = "";
	    for (int i = 0; i < hash.length; i++) {
	    	if(hash[i] >= start && end >= hash[i]){
	    		res += hash[i] + " ";
	    		counter++;
	    	}
		}
	    
	    if(counter == 0){
	    	System.out.println("INVALID RANGE");
	    }
	    else {
	    	System.out.println(res.trim());
	    }
	    s.close();

	}

}
