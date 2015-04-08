/**
 * 
 */
package warmups;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/filling-jars
 *
 */
public class FillingJars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] NM = s.nextLine().split(" ");
		BigInteger[] DNM = new BigInteger[2];
		DNM[0] = new BigInteger(NM[0]);
		DNM[1] = new BigInteger(NM[1]);

		List<BigInteger[]> list = new ArrayList<BigInteger[]>();
		
		for (BigInteger i = BigInteger.ZERO; i.compareTo(DNM[1]) < 0;  ) {
			BigInteger[] input = new BigInteger[3];
			String[] ip = s.nextLine().split(" ");
			input[0] = new BigInteger(ip[0]);
			input[1] = new BigInteger(ip[1]);
			input[2] = new BigInteger(ip[2]);
			list.add(input);
			i = i.add(BigInteger.ONE);
		}
		
		BigInteger candies = BigInteger.ZERO;
		for (Iterator<BigInteger[]> iterator = list.iterator(); iterator.hasNext();) {
			BigInteger[] dd = (BigInteger[]) iterator.next();
			BigInteger temp = (dd[1].subtract(dd[0])).add(BigInteger.ONE).multiply(dd[2]);
			candies = candies.add(temp);;
		}
		System.out.println( candies.divide(DNM[0]));
		s.close();
	}

}
