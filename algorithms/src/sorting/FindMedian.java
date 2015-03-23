/**
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 *
 */
public class FindMedian {

	/**
	 * 
	 */
	public FindMedian() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int arr[] = new int[c];
		s.nextLine();
		String[] ip= s.nextLine().split(" ");
		for (int i = 0; i < ip.length; i++) {
			arr[i] = Integer.parseInt(ip[i]);
		}
		Arrays.sort(arr);
		int len = arr.length;
		int median = len%2 == 1 ? arr[len/2] : (arr[len/2] + arr[(len/2) + 1])/2;
		System.out.println(median);
		s.close();

	}

}
