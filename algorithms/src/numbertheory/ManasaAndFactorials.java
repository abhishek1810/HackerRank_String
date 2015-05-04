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
 * @link https://www.hackerrank.com/challenges/manasa-and-factorials
 *
 */
public class ManasaAndFactorials {
	
	private static final BigInteger _5 = new BigInteger("5");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<BigInteger> list = new ArrayList<BigInteger>();
		for (int i = 0; i < t; i++) {
			list.add(new BigInteger("" + s.next()));
		}
		for (Iterator<BigInteger> iterator = list.iterator(); iterator.hasNext();) {
			BigInteger bigInteger = (BigInteger) iterator.next();
			zeroes(bigInteger);
		}
		s.close();
	}
	private static void zeroes(BigInteger N){
		BigInteger X = N.subtract(N.divide(_5)).multiply(_5);
		BigInteger count =  check(X);
		if(!count.equals(N)){
			X= X.add(_5);
			count = check(X);
			while(true){
				count = check(X);
				if(count.compareTo(N) > 0 || count.equals(N)) { break; }
				X = X.add(BigInteger.ONE);
			}
		}
		if(count.equals(N)){  System.out.println(X); } 
		else{
			System.out.println(X);
		}
	}
	private static BigInteger check(BigInteger x){
		BigInteger count = BigInteger.ZERO;
		BigInteger i = _5;
		while(true){
			count = count.add(x.divide(i));
			i = i.multiply(_5);
			if(x.divide(i).compareTo(BigInteger.ONE) < 0) break;
		}
		return count;
	}

}
