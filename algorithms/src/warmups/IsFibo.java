/**
 * 
 */
package warmups;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/is-fibo
 *
 */
public class IsFibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger[] list = new BigInteger[51];
		list[0] = BigInteger.ZERO;
		list[1] = BigInteger.ONE;
		BigInteger fib = new BigInteger("0");
		int counter  = 2;
		while(fib.compareTo(new BigInteger("10000000000")) < 0){
			fib = list[counter - 1].add(list[counter - 2]);
			list[counter] = fib;
			counter ++;
		}
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		BigInteger[] input = new BigInteger[t];
		s.nextLine();
		for (int j = 0; j < t; j++) {
			input[j] = new BigInteger(s.next());
		}
		boolean found = false;
		for (int k = 0; k < input.length; k++) {
			int min = minValue(list, input[k]);
			found = false;
			//System.out.println(min);
			for (int j = min; j < list.length && (list[j].compareTo(input[k]) > 0 || list[j].equals(input[k])); j++) {
			//	System.out.println(j + " >> " +  list[j]);
				if(list[j].equals(input[k])){
					found = true;
					break;
				}
			}
			System.out.println(found ? "IsFibo" : "IsNotFibo");
		}
		 s.close();
	}

	private static int minValue(BigInteger[] list, BigInteger v) {
		int i = 0;
		int j = list.length - 1;
		int k = list.length/2;
		
		while(i<=j || i == k){
			if(v.compareTo(list[k]) < 0){
				j = k;
				k = (i + j)/2;
				if(i == k) return i;
			}
			else if(v.compareTo(list[k]) > 0) {
				i = k;
				k = (i + j)/2;
				if(i == k) return i;
			}
			else {
				return k;
			}
		}
		
		return i;
	}

}
