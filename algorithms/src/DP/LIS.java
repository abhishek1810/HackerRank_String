/**
 * 
 */
package DP;

import java.util.Scanner;

/**
 * @author jakkanin
 *
 */
public class LIS {

	/**
	 * 
	 */
	public LIS() {
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] arr = new int[t];
		s.nextLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		 
		int res[] = new int[t];
		res[0] = arr[0];
		int len = 1;
		
		for(int i=1; i< arr.length ; i++) {
			if(res[0] > arr[i]) {
				res[0] = arr[i];
			}
			else if(res[len - 1] < arr[i]) {
				res[len++] = arr[i];
			}
			else{
				res[getEndElementIndex(res, -1, len - 1, arr[i])] = arr[i];
			}
		}
		
		for(int el : res) System.out.println(el);
		s.close();
	}
	
	
	public static int getEndElementIndex(int a[], int l, int r, int val) {
		
		while(r - l > 1) {
			
			int m = l + (r-l)/2;
			
			if(a[m] >= val) {
				r = m;
			}
			else {
				l = m;
			}
		}
		return r;
	}

}
