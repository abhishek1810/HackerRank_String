/**
 * 
 */
package numbertheory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/power-of-large-numbers
 *
 */
public class PowerOfLargeNumber {

	private static final BigInteger TWO = new BigInteger("2");

	/**
	 * 
	 */
	public PowerOfLargeNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BigInteger div = new BigInteger("1000000007");
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		List<BigInteger[]> list = new ArrayList<BigInteger[]>();
		s.nextLine();
		for (int i = 0; i < testCases; i++) {
			String[] input= s.nextLine().split(" ");
			BigInteger a[] = new BigInteger[2];
			a[0] = new BigInteger(input[0]);
			a[1] = new BigInteger(input[1]);
			list.add(a);
		}
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			BigInteger[] big = (BigInteger[]) iterator.next();
			
			BigInteger a = big[0];
			BigInteger b = big[1];
			BigInteger res = BigInteger.ONE;
		/*	while(b.compareTo(BigInteger.ZERO) > 0){
				if(b.mod(TWO).equals(BigInteger.ONE)){
					res = res.multiply(a).mod(div);
				}
				a = a.multiply(a).mod(div);
				b = b.divide(new BigInteger("2"));
			}
			*/
			System.out.println(a.modPow(b, div));
			
		}
	}

}
