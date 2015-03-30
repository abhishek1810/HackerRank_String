/**
 * 
 */
package strings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/antipalindromic-strings
 *
 */
public class AntiPalindromic {

	private static final BigInteger TWO = new BigInteger("2");
	private static final BigInteger _1000000007 = new BigInteger("1000000007");
	private static int counter = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		List<BigInteger[]> list = new ArrayList<BigInteger[]>();
		s.nextLine();
		for (int i = 0; i < test; i++) {
			String[] input = s.nextLine().split(" ");
			BigInteger[] b = new BigInteger[input.length];
			b[0] = new BigInteger(input[0]);
			b[1] = new BigInteger(input[1]);
			list.add(b);
		}
		for (Iterator<BigInteger[]> iterator = list.iterator(); iterator.hasNext();) {
			BigInteger[] b = (BigInteger[]) iterator.next();
			
			BigInteger N = b[0];
			BigInteger M = b[1];
			BigInteger res = BigInteger.ONE;
			if(N.equals(BigInteger.ONE)){
				res = N.multiply(M).mod(_1000000007);
			}
			else if(N.equals(TWO)){
				res = M.multiply(M.subtract(BigInteger.ONE)).mod(_1000000007);
			}
			else if(M.compareTo(N) < 0 && M.compareTo(new BigInteger("3")) < 0){
				res = BigInteger.ZERO;
			}
			else{
				res = power(M.subtract(TWO), N.subtract(TWO));
				res = M.multiply(M.subtract(BigInteger.ONE)).multiply(res).mod(_1000000007);
			}
			System.out.println(res + " :: " + counter) ;
		}
		s.close();
	}

	private static BigInteger power(BigInteger n, BigInteger b) {
		// TODO Auto-generated method stub
		BigInteger res = BigInteger.ONE;
		while(b.compareTo(BigInteger.ZERO) > 0){
			if(b.mod(TWO).equals(BigInteger.ONE)){
				res = res.multiply(n).mod(_1000000007);
			}
			n = n.multiply(n).mod(_1000000007);
			b = b.divide(TWO);
			counter++;
		}
		return res;
	}

}
