/**
 * 
 */
package DP;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author jakkanin
 *
 */
public class SamAndSubString {

	/**
	 * 
	 */
	public SamAndSubString() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger remainder = new BigInteger("1000000007");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int len = input.length();
		String[] arr = input.split("");
		BigInteger sum = BigInteger.ZERO;
		BigInteger TEN = new BigInteger("10");
		int position = len;
		int counter = 1;
		BigInteger temp = BigInteger.ONE;
		for (int i=0; i<len; i++) {
			BigInteger element = new BigInteger(arr[len - counter]).mod(remainder);
			BigInteger elePosition = new BigInteger("" + position).mod(remainder);
			if(i == 0) {
				temp = BigInteger.ONE;
			}
			else {
			temp = TEN.multiply(temp).add(BigInteger.ONE).mod(remainder);
			}
			sum= sum.add(temp.multiply(element).multiply(elePosition)).mod(remainder);
			position--;
			counter ++;
		}
		
		System.out.println(sum);
		
		s.close();
	}

}
