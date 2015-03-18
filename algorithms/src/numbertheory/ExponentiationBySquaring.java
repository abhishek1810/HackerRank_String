/**
 * 
 */
package numbertheory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Naveen Jakkani
 * 
 * This class deals with getting power of a number using modular exponentiation by squaring.
 *
 */
public class ExponentiationBySquaring {

	private static final BigInteger TWO = new BigInteger("2");

	/**
	 * 
	 */
	public ExponentiationBySquaring() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BigInteger n = new BigInteger("10");
		BigInteger res = BigInteger.ONE;
		BigInteger power = new BigInteger("5");
		power = power.subtract(BigInteger.ONE);
		BigInteger div = new BigInteger("18");
		BigInteger temp = BigInteger.TEN;
		while(power.compareTo(BigInteger.ZERO) > 0){
			if(power.mod(TWO).equals(BigInteger.ONE)) {
				res = res.multiply(n).mod(div);
				//power = power.subtract(BigInteger.ONE);
			}
			n = n.multiply(n);
			n = n.mod(div);
			power = power.divide(TWO);
		}
		System.out.println("res : " + res);
		res = res.multiply(BigInteger.TEN).divide(new BigInteger("9"));
		System.out.println(res);
	}
}
