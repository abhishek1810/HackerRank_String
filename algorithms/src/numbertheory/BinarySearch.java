/**
 * 
 */
package numbertheory;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 *
 */
public class BinarySearch {

	private static final BigInteger TWO = new BigInteger("2");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger number = new BigInteger("" + s.next());
		
		BigInteger i = BigInteger.ONE;
		BigInteger j = sqrt(number);
		BigInteger k = i.add(j).divide(TWO);
		BigInteger counter = BigInteger.ONE;
		while(i.compareTo(j) < 0 || i.equals(j)) {
			BigInteger temp = TWO.multiply(k).add(BigInteger.ONE);
			BigInteger temp1 = k.add(BigInteger.ONE);
			BigInteger f = k.multiply(temp1).multiply(temp);
			f = f.divide(new BigInteger("6"));
			System.out.println("Before :: " + k + " : " + i + " , " + j + " " + f);
			if(number.compareTo(f) < 0){ j = k; }
			else if(number.compareTo(f) > 0 || number.equals(f)){ i = k; }
			k = i.add(j).divide(TWO);
			System.out.println("After :: " + k + " : " + i + " , " + j + " " + f);
			counter = counter.add(BigInteger.ONE);
			if(f.equals(number) || i.equals(k)) break;
		}
		System.out.println("i, j = " + i + " , " + j);
		s.close();
	}
	

	public static BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		while(b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
			else a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}

}
