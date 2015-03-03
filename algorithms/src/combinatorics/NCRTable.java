/**
 * 
 */
package combinatorics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author jakkani naveen
 * {@link} https://www.hackerrank.com/challenges/ncr-table
 *
 */
public class NCRTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcases  = s.nextInt();
		int[] input = new int[testcases];
		for (int i = 0; i < input.length; i++) {
			input[i] = s.nextInt();
		}
		for (int i = 0; i < input.length; i++) {
			int cond = input[i]/2;
			List<BigInteger> res = new ArrayList<BigInteger>();
			BigInteger den = new BigInteger("1");
			for (int j = 0; j <= cond ; j++) {
				BigInteger f = null;
				if(j == 0 || j == input[i]){ f = new BigInteger("1"); }
				else {
					BigInteger temp = new BigInteger("" + input[i]);
					BigInteger terminator = new BigInteger("0");
					terminator = temp.subtract(new BigInteger("" + j));
					BigInteger nominator = fact(temp, terminator); // n factorial
					BigInteger denominator = den.multiply(new BigInteger("" + (j == 0 ? 1 : j) )); // (n-r) factorial
					den = denominator;
					f = nominator.divide(denominator);
					f = f.mod(new BigInteger("1000000000"));
				}
				res.add(f);
			}
			for (Iterator<BigInteger> iterator = res.iterator(); iterator.hasNext();) {
				BigInteger object = (BigInteger) iterator.next();
				System.out.print(object + (iterator.hasNext() ? " " : ""));
			} 
			int dec = input[i] % 2 == 0 ? 2 : 1;
			for (int j = res.size() - dec ; j >= 0 ; j--) {
				System.out.print((j== res.size() - dec ? " " : "") + res.get(j) + (j != 0 ? " " : "") );
			}
			System.out.println("");
		}
		s.close();
	}

	public static BigInteger fact(BigInteger n, BigInteger terminator){
		if(n.compareTo(terminator) <= 0 /*|| n.equals(new BigInteger("1"))*/) {
			return new BigInteger("1");
		}
		BigInteger temp = fact(n.subtract(new BigInteger("1")), terminator);
		BigInteger res = n.multiply(temp);
		return res;
	}

}
