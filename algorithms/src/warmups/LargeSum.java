package warmups;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Naveen Jakkani
 * 
 * @link https://www.hackerrank.com/challenges/a-very-big-sum
 *
 */


public class LargeSum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		BigInteger sum = BigInteger.ZERO;
		s.nextLine();
		String[] val = s.nextLine().split(" ");
		for (int i = 0; i < val.length; i++) {
			sum = sum.add(new BigInteger(val[i]));
		}
		System.out.println(sum);
		s.close();
		
	}

}
