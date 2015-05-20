/**
 * 
 */
package bitmanipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/flipping-bits
 *
 */
public class FlippingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BigInteger max = new BigInteger("4294967295");
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		List<BigInteger> l = new ArrayList<BigInteger>();
		for (int i = 0; i < t; i++) {
			l.add(new BigInteger(s.nextLine()));
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(max.subtract(l.get(i)));
		}
		s.close();
	}

}
