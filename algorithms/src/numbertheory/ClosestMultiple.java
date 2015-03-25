package numbertheory;

/**
 * @author jakkani naveen
 * @link https://www.hackerrank.com/challenges/closest-number
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ClosestMultiple {

	private static final BigInteger TWO = new BigInteger("2");

	/* Driver program to test above functions */
	public static void main(String[] args) { // 193321855 :: 184804527 1
		// 38664371

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		s.nextLine();
		List<String[]> list = new ArrayList<String[]>();
		for (int i = 0; i < testCases; i++) {
			String[] is = s.nextLine().split(" ");
			list.add(is);
		}

		for (int i = 0; i < list.size(); i++) {
			String[] str = list.get(i);
			BigInteger a = new BigInteger(str[0]);
			BigInteger b = new BigInteger(str[1]);
			BigInteger x = new BigInteger(str[2]);
			BigInteger result = power(a, b);
			BigInteger[] p = new BigInteger[3];
			BigInteger div = result.divide(x); 
			p[0] = div.multiply(x).subtract(x);
			p[1] = div.multiply(x);
			p[2] = div.multiply(x).add(x);
			
			//System.out.println(p[0] + ", " + p[1] + ", " + p[2]);
			
			BigInteger min = result.subtract(p[1]);
			
			if((result.subtract(p[0]).compareTo(min)) < 0){
				min = p[0];
			}
			else if(p[2].subtract(result).compareTo(min) < 0) {
				min = p[2];
			}
			else {
				min = p[1];
			}
			
			System.out.println(min);
		}

		s.close();
	}

	private static BigInteger power(BigInteger n, BigInteger power) {

		BigInteger res = BigInteger.ONE;
		while (power.compareTo(BigInteger.ZERO) > 0) {
			if (power.mod(TWO).equals(BigInteger.ONE)) {
				res = res.multiply(n);
				power = power.subtract(BigInteger.ONE);
			}
			n = n.multiply(n);
			power = power.divide(TWO);
		}
		return res;
	}
}