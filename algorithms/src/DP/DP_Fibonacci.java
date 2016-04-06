/**
 * 
 */
package DP;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author JakkaniN
 * @link https://www.hackerrank.com/challenges/fibonacci-modified
 *
 */
public class DP_Fibonacci {

	/**
	 * 
	 */
	public DP_Fibonacci() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String[] input = s.nextLine().split(" ");
		
		BigInteger a = new BigInteger(input[0]);
		BigInteger b = new BigInteger(input[1]);
		int n = Integer.parseInt(input[2]);
		
		BigInteger nth = BigInteger.ZERO;
		
		for (int i = 3; i <= n; i++) {
			nth = b.multiply(b).add(a);
			a = b;
			b = nth;
		}
		
		System.out.println(nth);
		
		
		s.close();
		
	}

}
