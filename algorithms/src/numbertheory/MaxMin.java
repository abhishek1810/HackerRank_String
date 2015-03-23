/**
 * 
 */
package numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Naveen Jakkani
 *
 */
public class MaxMin {

	/**
	 * 
	 */
	public MaxMin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      int N = Integer.parseInt(in.readLine());
	      int K = Integer.parseInt(in.readLine());
	      int[] list = new int[N];

	      for(int i = 0; i < N; i ++)
	         list[i] = Integer.parseInt(in.readLine());
	      
	      int unfairness = Integer.MAX_VALUE;
	      Arrays.sort(list);
	      
	      /*
	       * Write your code here, to process numPackets N, numKids K, and the packets of candies
	       * Compute the ideal value for unfairness over here
	      */
	      int len = list.length;
	      for (int i = 0, j = K; i <= len-K; i++) {
	    	  if((list[i+j-1] - list[i]) < unfairness){
	    		  unfairness = list[i+j-1] - list[i]; 
	    	  }
	      }
	      
	      System.out.println(unfairness);
	   }
}
