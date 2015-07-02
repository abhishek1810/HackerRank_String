/**
 * 
 */
package warmups;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * {@link https://www.hackerrank.com/challenges/extra-long-factorials}
 *
 */
public class ExtraLongFact {
	public static void main(String argp[]){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		BigInteger p = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			p = p.multiply(new BigInteger("" + i));
		}
		System.out.println(p);
		s.close();
		
		
	}

}
