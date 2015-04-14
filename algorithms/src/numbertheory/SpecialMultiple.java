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
 * @link https://www.hackerrank.com/challenges/special-multiple
 *
 */
public class SpecialMultiple {

	/**
	 * @param args
	 */
	private static final BigInteger _9 = new BigInteger("9");
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<BigInteger> list = new ArrayList<BigInteger>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			list.add(new BigInteger("" + s.nextInt()));
		}
		BigInteger b = null;
		
		int C = 15000;
		
		BigInteger[] bb = new BigInteger[C];
		for(int i = 1; i<= C; i++){
			b = new BigInteger(Integer.toBinaryString(i));
			b = b.multiply(_9);
			bb[i] = b;
		}
		 for (Iterator<BigInteger> iterator = list.iterator(); iterator.hasNext();) {
			BigInteger bigInteger = (BigInteger) iterator.next();
			for (int i = 1; i < bb.length; i++) {
				if(bb[i].mod(bigInteger).equals(BigInteger.ZERO)){
					System.out.println(bb[i]);break;
				}
			}
		}
		s.close();
	}
}
